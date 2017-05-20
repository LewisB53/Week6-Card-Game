package cards;

public class Card {

  private CardNumber cardNumber;
  private CardSuit cardSuit;

  public Card(CardNumber cardNumber, CardSuit cardSuit) {
    this.cardNumber = cardNumber;
    this.cardSuit = cardSuit;
  }

  // public CardNumber cardNumber getCardNumber(){
  //   return this.cardNumber;
  // }

  public CardSuit getCardSuit(){
    return this.cardSuit;
  }

}