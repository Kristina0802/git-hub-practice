package com.devxschool;

import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        /**
         * Write a program to count number of vowels, consonants,
         * digits, special characters and whitespaces in the string
         *
         * Ex 1:
         *
         * Enter the string : This program is very easy
         * Vowels: 7
         * Consonants: 14
         * Digits: 0
         * White spaces: 4
         * Symbols : 0
         *
         * Ex 2:
         *
         * Enter the string : 123 this very ^^
         * Vowels: 2
         * Consonants: 6
         * Digits: 3
         * White spaces: 3
         * Symbols : 2
         */

        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        line = sc.nextLine();
        printCounts(line);
    }

    public static void printCounts(String word) {
        // TODO IMPLEMENT METHOD
        word = word.toLowerCase();
        int vowels =0, consonants =0, digits =0, spaces =0, symbols=0;

        for(int i=0; i<word.length(); i++){
            if(Character.isAlphabetic(word.charAt(i))){
                switch(word.charAt(i)){
                    case 'a':
                    case 'o':
                    case 'i':
                    case 'u':
                    case 'e':
                        vowels++;
                        break;
                    default:
                        consonants++;
                }
            }
            else if(Character.isDigit(word.charAt(i))){
                digits++;
            }
            else if(Character.isWhitespace(word.charAt(i))){
                spaces++;
            }
            else{
                symbols++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("Digits: "+digits);;
        System.out.println("White spaces: "+spaces);
        System.out.println("Symbols: "+symbols);

    }
}
