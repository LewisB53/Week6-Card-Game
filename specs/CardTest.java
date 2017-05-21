import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(CardNumber.FIVE , CardSuit.SPADES);
  }

  @Test
  public void canGetCard(){
    assertEquals(CardNumber.FIVE, card.getCardNumber());
  }

  @Test
  public void canGetSuit(){
    assertEquals(CardSuit.SPADES, card.getCardSuit());
  }

  @Test
  public void canGetCardValue(){
    assertEquals(CardNumber.FIVE.getValue(), card.getCardValue());
  }



}
