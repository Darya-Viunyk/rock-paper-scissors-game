package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScissorsTest {
    @org.junit.jupiter.api.Test
    void detName() {
        Scissors scissors = new Scissors();
        String name = scissors.detName();
        assertEquals("scissors", scissors.detName());
    }

    @org.junit.jupiter.api.Test
    void beats() {
        Scissors scissors = new Scissors();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();


        assertFalse(scissors.beats(rockMove));
        assertTrue(scissors.beats(paperMove));
        assertFalse(scissors.beats(scissorsMove));
    }

}
