package com.company;

//line of code to read user input
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double userTemp= 0.0d;
        double temperature = 104.0d;


        Scanner scanner = new Scanner(System.in); //scanner is used to get input from the user

        while(userTemp != temperature) {
            System.out.println("\nEnter the temperature: ");
            userTemp = scanner.nextDouble(); //gets input from the user


            if ((userTemp >= 92.0) && (userTemp < 97.5)) {
                System.out.println("Low temperature");
            } else if ((userTemp >= 97.5) && (userTemp <= 99.5)) {
                System.out.println("Normal temperature");
            } else if ((userTemp > 99.5) &&(userTemp <=104.0)) {
                System.out.println("High Temperature");
            }
            else {
                System.out.println("Please enter a valid number, between 92.0 and 104.0.");
            }
        }

        }

    }

