package cards;
import behaviours.*;
import java.util.*;


public class Deck {
  
  private ArrayList<Holdable> deck;

  public Deck(){
    this.deck = new ArrayList<Holdable>();
  }

  public void addCard(Holdable card){
    this.deck.add(card);
  }


  public int cardCount(){
    return this.deck.size();
  }

  public void dealCard(Holdable card){

    this.deck.remove(card);
  }

}
