package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    @org.junit.jupiter.api.Test
    void detName() {
        Paper paper = new Paper();
        String name = paper.detName();
        assertEquals("paper", paper.detName());
    }
    @org.junit.jupiter.api.Test
    public void testBeats() {
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();

        assertTrue(rockMove.beats(new Scissors()));
        assertFalse(rockMove.beats(new Rock()));
        assertFalse(rockMove.beats(new Paper()));
    }

}