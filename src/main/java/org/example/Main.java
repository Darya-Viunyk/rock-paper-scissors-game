package org.example;


public class Main {
    public static void main(String[] args) {


        Player humanPlayer = new  HumanPlayer("Player 1");
        Player computerPlayer = new ComputerPlayer("Computer");

        RockPaperScissorsGame game = new RockPaperScissorsGame(humanPlayer, computerPlayer);
        game.play();

        }
    }

