package com.devxschool;

import java.util.Scanner;

public class Address {

    public static void main(String[] args) {

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */

        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full address:");
        String str = sc.nextLine();
        System.out.println(getStreetAddress(address));
        System.out.println(getCity(address));
        System.out.println(getState(address));
        System.out.println(getZipcode(address));

    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ',') {
                result = address.substring(0, i);
                return result;
            }
        }
        return result;
    }


        public static String getCity (String address) {
            String city = "";
            int indexComa = address.indexOf(',')+1;
            int secondComa = address.lastIndexOf(',');
            city = address.substring(indexComa, secondComa);


            return city;
        }

        public static String getState (String address){
            String state ="";
            int state1 = address.lastIndexOf(',')+1;
            int state2 = address.indexOf(' ');

            return state;
        }

        public static int getZipcode (String address){
          String zipCode ="";
          int zipCode2 = address.lastIndexOf(' ')+1;
          zipCode = address.substring(zipCode2);
            return Integer.valueOf(zipCode);
        }

    }

