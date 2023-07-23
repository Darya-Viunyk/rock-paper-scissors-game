package org.example;

import java.io.InputStream;

public class Main {
    private static InputStream inputStream;

    public static void main(String[] args) {


        Player humanPlayer = new  HumanPlayer("Player 1", inputStream);
        Player computerPlayer = new ComputerPlayer("Computer");

        RockPaperScissorsGame game = new RockPaperScissorsGame(humanPlayer, computerPlayer);
        game.play();

        }
    }

