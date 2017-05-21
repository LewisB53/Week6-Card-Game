import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {

  Card card;
  Deck deck;
  
  @Before 
  public void before(){
    card = new Card(CardNumber.FIVE , CardSuit.SPADES);
    deck = new Deck();

  }

  @Test
  public void canGetCard(){
    assertEquals(CardNumber.FIVE, card.getCardNumber());
  }

  @Test
  public void canAddCard(){
    deck.addCard(card);
    assertEquals(1, deck.cardCount());
  }

}