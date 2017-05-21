import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Card card1;
  Card card2;
  Player player1;
  Table table;
  Deck deck;
  
  @Before 
  public void before(){
    card1 = new Card(CardNumber.FIVE , CardSuit.SPADES);
    card2 = new Card(CardNumber.KING , CardSuit.SPADES);
    player1 = new Player("Lewis");
    table = new Table();
    deck = new Deck();
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

  @Test
  public void canGetTotalValue(){
   player1.addCard(card1);
   player1.addCard(card2);
    assertEquals(18, player1.cardsValue());
  }


}