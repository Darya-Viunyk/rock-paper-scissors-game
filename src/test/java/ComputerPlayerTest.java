import org.example.ComputerPlayer;
import org.junit.jupiter.api.Test;
public class ComputerPlayerTest {
    @Test
    public void testGetMove(){
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");
        Move move = computerPlayer.getMove();
        assertNotNull(move);
    }
}
