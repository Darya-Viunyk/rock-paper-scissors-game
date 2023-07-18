package org.example;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private String name;
    private Scanner scanner;

    public HumanPlayer (String name){
        this.name = name;
        this.scanner = new Scanner(System.in);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public Move getMove(){
        while (true){
            System.out.print("Enter your move (rock/paper/scissors):");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("rock")){
                return new Rock();
            } else if (input.equals("paper")) {
                return new Paper();
            } else if (input.equals("scissors")) {
                return new Scissors();
            }else {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }
}
