import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class TableTest {

  Table table;
  Player player1;
  Player player2;
  Card card1;
  Card card2;
  
  @Before 
  public void before(){
    table = new Table();
    player1 = new Player("Lewis");
    player2 = new Player("Skip");
    card1 = new Card(CardNumber.FIVE , CardSuit.SPADES);
    card2 = new Card(CardNumber.KING , CardSuit.SPADES);
  }

  @Test
  public void canAddPlayers(){
    table.addPlayer(player1);
    table.addPlayer(player2);
    assertEquals(2, table.playerCount());
  }

  @Test
  public void CanCheckForWinner(){
    player1.addCard(card1);
    player2.addCard(card2);
    assertEquals(player2, table.returnWinner(player1, player2));
  }



}