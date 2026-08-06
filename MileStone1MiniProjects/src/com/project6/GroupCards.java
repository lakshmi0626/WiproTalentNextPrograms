package com.project6;

import java.util.*;

class Cards {
    private char symbol;
    private int number;

    public Cards() {
    }

    public Cards(char symbol, int number) {
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
}

public class GroupCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TreeMap automatically sorts keys (symbols) in alphabetical order
        Map<Character, List<Card>> cardMap = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int numberOfCards = scanner.nextInt();

        for (int i = 1; i <= numberOfCards; i++) {
            System.out.println("Enter card " + i + ":");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();

            Card card = new Card(symbol, number);

            // Add card to the corresponding list in the map
            if (!cardMap.containsKey(symbol)) {
                cardMap.put(symbol, new ArrayList<>());
            }
            cardMap.get(symbol).add(card);
        }

        // Print distinct symbols in alphabetical order separated by space
        System.out.println("Distinct Symbols are :");
        StringBuilder symbolsList = new StringBuilder();
        for (Character symbol : cardMap.keySet()) {
            symbolsList.append(symbol).append(" ");
        }
        System.out.println(symbolsList.toString().trim());

        // Process each symbol group
        for (Map.Entry<Character, List<Card>> entry : cardMap.entrySet()) {
            char symbol = entry.getKey();
            List<Card> cards = entry.getValue();

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;
            for (Card card : cards) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        scanner.close();
    }
}