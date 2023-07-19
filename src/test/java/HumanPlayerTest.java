import org.example.HumanPlayer;
import org.junit.jupiter.api.Test;

public class HumanPlayerTest {
    @Test
    public void testGetMove(){
        HumanPlayer humanPlayer = new HumanPlayer("Player 1");
        Move move = humanPlayer.getMove();
        assertNotNull(move);
    }
}
