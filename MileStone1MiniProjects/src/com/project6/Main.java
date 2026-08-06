package com.project6;
import java.util.*;

class Card implements Comparable<Card> {
    private char symbol;
    private int number;

    public Card() {
    }

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Ensures equality is based on the card's symbol so only unique symbols are added
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return symbol == card.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

    // Allows automatic sorting in alphabetical order of symbol
    @Override
    public int compareTo(Card o) {
        return Character.compare(this.symbol, o.symbol);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TreeSet automatically maintains alphabetical order and uniqueness
        Set<Card> cardSet = new TreeSet<>();
        int totalCardsEntered = 0;

        // Keep collecting cards until 4 unique symbols are found
        while (cardSet.size() < 4) {
            System.out.println("Enter a card :");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();
            
            totalCardsEntered++;
            
            Card card = new Card(symbol, number);
            // TreeSet.add() only adds the card if a card with the same symbol is not already present,
            // preserving the first occurrence.
            cardSet.add(card);
        }

        System.out.println("Four symbols gathered in " + totalCardsEntered + " cards.");
        System.out.println("Cards in Set are :");
        
        for (Card card : cardSet) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        scanner.close();
    }
}