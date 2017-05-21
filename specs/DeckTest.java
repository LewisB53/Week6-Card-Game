import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(CardNumber.FIVE , CardSuit.SPADES);
  }

  @Test
  public void canGetCard(){
    assertEquals(CardNumber.FIVE, card.getCardNumber());
  }



}