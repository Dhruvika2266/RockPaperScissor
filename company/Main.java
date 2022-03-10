package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock or 1 for Paper or 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Tie-Breaker or Draw.");
        }else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 ||
                userInput == 2 && computerInput == 1){
            System.out.println("You are Winner.");
        }else{
            System.out.println("Computer is Winner.");
        }

        if(computerInput == 0){
            System.out.println("Computer selected: Rock.");
        }else if(computerInput == 1){
            System.out.println("Computer selected: Paper.");
        }else if(computerInput == 2) {
            System.out.println("Computer selected: Scissors");
        }

    }
}
