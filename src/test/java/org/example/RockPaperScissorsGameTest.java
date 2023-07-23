package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class RockPaperScissorsGameTest extends TestCase {

    private record TestPlayer(String name, Move move) implements Player {
    }

    @Test
    public void testPlay_Player1Wins() {

        Move move1 = new Rock();
        Move move2 = new Scissors();

        Player player1 = new TestPlayer("Player 1", move1);
        Player player2 = new TestPlayer("Player 2", move2);

        RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
        game.play();

    }

    @Test
    public void testPlay_Player2Wins() {
        // Arrange
        Move move1 = new Paper();
        Move move2 = new Scissors();

        Player player1 = new TestPlayer("Player 1", move1);
        Player player2 = new TestPlayer("Player 2", move2);

        RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
        game.play();

    }

    @Test
    public void testPlay_Draw() {

        Move move1 = new Rock();
        Move move2 = new Rock();

        Player player1 = new TestPlayer("Player 1", move1);
        Player player2 = new TestPlayer("Player 2", move2);

        RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
        game.play();


    }

}