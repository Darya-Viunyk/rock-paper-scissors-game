package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockTest {

    @Test
    void detName() {
        Rock rock = new Rock();
        String name = rock.detName();
        assertEquals("rock", name);
    }

    @Test
    void beats() {
        Rock rock = new Rock();
        Move rockMove = new Rock();
        Move paperMove = new Paper();
        Move scissorsMove = new Scissors();


        assertTrue(rock.beats(scissorsMove));
        assertFalse(rock.beats(rockMove));
        assertFalse(rock.beats(paperMove));
    }
    }
