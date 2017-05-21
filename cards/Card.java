package cards;
import behaviours.*;

public class Card implements Holdable{

  private CardNumber cardNumber;
  private CardSuit cardSuit;

  public Card(CardNumber cardNumber, CardSuit cardSuit) {
    this.cardNumber = cardNumber;
    this.cardSuit = cardSuit;
  }

  public CardNumber getCardNumber(){
    return this.cardNumber;
  }

  public int getCardValue(){
    return this.cardNumber.getValue();
  }

  public CardSuit getCardSuit(){
    return this.cardSuit;
  }



}