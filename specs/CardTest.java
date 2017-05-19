import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(CardNumber.FIVE , CardSuit.SPADES);
  }

}