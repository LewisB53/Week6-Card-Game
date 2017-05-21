import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Card card1;
  Player player1;
  
  @Before 
  public void before(){
    card1 = new Card(CardNumber.FIVE , CardSuit.SPADES);
    player1 = new Player("Lewis");
  }


  @Test
  public void canGetCard(){
    assertEquals(CardNumber.FIVE, card1.getCardNumber());
  }

  @Test
  public void canAddCard(){
    player1.addCard(card1);
    assertEquals(1, player1.cardCount());
  }

}