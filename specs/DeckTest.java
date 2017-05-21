import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {

  Card card1;
  Card card2;
  Deck deck;
  
  @Before 
  public void before(){
    card1 = new Card(CardNumber.FIVE , CardSuit.SPADES);
    card2 = new Card(CardNumber.KING , CardSuit.SPADES);

    deck = new Deck();

  }

  @Test
  public void canGetCard(){
    assertEquals(CardNumber.FIVE, card1.getCardNumber());
  }

  @Test
  public void canAddCard(){
    deck.addCard(card1);
    assertEquals(1, deck.cardCount());
  }

  @Test
  public void canDealCard(){
    deck.addCard(card1);
    deck.addCard(card2);
    deck.dealCard(card2);
    assertEquals(1, deck.cardCount());
  }

  @Test
  public void canDealCard(){
    deck.fillDeck();
    assertEquals(13, deck.cardCount());
  }

}