import org.example.ComputerPlayer;
import org.example.HumanPlayer;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsGameTest {
    @Test
    public void testPlay() {
        Player humanPlayer = new HumanPlayer("Player 1");
        Player computerPlayer = new ComputerPlayer("Computer");
        RockPaperScissorsGame game = new RockPaperScissorsGame(humanPlayer, computerPlayer);
    }

    @Test
    public void testPlay_Draw() {
        Player player1 = mock(Player.class);
        Player player2 = mock(Player.class);
        when(player1.getMove()).thenReturn(new Rock());
        when(player2.getMove()).thenReturn(new Rock());

        RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
        game.play();


        assertTrue(systemOut().comtains("It is a draw! Let's play again."));
    }

    @Test
    public void testPlay_PlayerWins() {
        Player player1 = mock(Player.class);
        Player player2 = mock(Player.class);
        when(player1.getMove()).thenReturn(new Rock());
        when(player2.getMove()).thenReturn(new Scissors());

        RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
        game.play();


        assertTrue(systemOut().comtains("Player 1 wins!"));
    }

    @Test
    public void testPlay_ComputerWins() {
        Player player1 = mock(Player.class);
        Player player2 = mock(Player.class);
        when(player1.getMove()).thenReturn(new Rock());
        when(player2.getMove()).thenReturn(new Paper());

        RockPaperScissorsGame game = new RockPaperScissorsGame(player1, player2);
        game.play();


        assertTrue(systemOut().comtains("Computer wins!"));
    }
    private String systemOut(){
        return outContent.toString();
    }
}