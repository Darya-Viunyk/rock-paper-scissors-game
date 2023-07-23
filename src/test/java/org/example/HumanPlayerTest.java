package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HumanPlayerTest extends TestCase {

    private InputStream originalSystemIn;

    @Before
    public void setUp() {
        originalSystemIn = System.in;
    }

    @After
    public void tearDown() {
        System.setIn(originalSystemIn);
    }

    @Test
    public void testMove_Rock() {
        // Arrange
        String userInput = "rock\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        HumanPlayer humanPlayer = new HumanPlayer("Test Player", inputStream);
        Move move = humanPlayer.move();
        assertTrue(move instanceof Rock);
    }

    @Test
    public void testMove_Paper() {
        // Arrange
        String userInput = "paper\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        HumanPlayer humanPlayer = new HumanPlayer("Test Player", System.in);
        Move move = humanPlayer.move();
        assertTrue(move instanceof Paper);
    }

    @Test
    public void testMove_Scissors() {
        // Arrange
        String userInput = "scissors\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        HumanPlayer humanPlayer = new HumanPlayer("Test Player", System.in);
        Move move = humanPlayer.move();
        assertTrue(move instanceof Scissors);
    }

}