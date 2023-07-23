package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class ComputerPlayerTest extends TestCase {
    @Test
    public void testMove() {

        ComputerPlayer computerPlayer = new ComputerPlayer("Computer Player");
        Move move = computerPlayer.move();
        assertTrue(move instanceof Rock || move instanceof Paper || move instanceof Scissors);
    }
}