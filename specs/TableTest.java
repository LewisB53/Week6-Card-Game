import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class TableTest {

  Table table;
  Player player1;
  Player player2;

  
  @Before 
  public void before(){
    table = new Table();
    player1 = new Player("Lewis");
    player2 = new Player("Skip");
  }


  @Test
  public void canAddPlayers(){
    table.addPlayer(player1);
    table.addPlayer(player2);

    assertEquals(2, table.playerCount());
  }

}