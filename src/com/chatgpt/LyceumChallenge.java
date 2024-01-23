package com.chatgpt;
import java.util.*;

public class LyceumChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<String> squares = findSquares(n);

            if (squares.isEmpty()) {
                System.out.println("-1");
            } else {
                for (String square : squares) {
                    System.out.println(square);
                }
            }
        }
    }

    private static List<String> findSquares(int n) {
        // Initialize list to store squares
        List<String> squares = new ArrayList<>();

        // Calculate maximum possible square with n digits
        int maxSquare = (int) Math.pow(10, (n - 1) / 2);

        // Check squares from largest to smallest
        for (int i = maxSquare; i >= 1; i--) {
            long square = i * i;

            // Convert square to string with leading zeros
            String strSquare = String.valueOf(square);
            while (strSquare.length() < n) {
                strSquare = "0" + strSquare;
            }

            // Check if digit multiset of square matches n repetitions of each digit
            Map<Character, Integer> digitCount = new HashMap<>();
            for (char c : strSquare.toCharArray()) {
                digitCount.put(c, digitCount.getOrDefault(c, 0) + 1);
            }

            boolean valid = true;
            for (int count : digitCount.values()) {
                if (count != n) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                squares.add(strSquare);
            }
        }

        return squares;
    }
}

