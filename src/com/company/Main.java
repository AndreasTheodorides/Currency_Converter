package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Currency Converter!!");
        String input1 = getInput("Insert the amount in Euros: ");
        double amount = Double.parseDouble(input1);
        String input2 = getInput("Insert the currency you want (dollar, yen, GBP): ");
        double result = 0;

        try{
            switch (input2){
                case "dollar":
                    result = amount * 1.11;
                    break;
                case "yen":
                    result = amount * 128.35;
                    break;
                case "GBP":
                    result = amount * 0.84;
                    break;
                default:
                    System.out.println("Unrecognised currency!");
                    return;
            }
            System.out.println(amount +" Euros are " + result+ " " +input2);
        }catch (Exception e){
            System.out.println("Currency formatting exception" + e.getMessage());
        }

    }

    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    }
