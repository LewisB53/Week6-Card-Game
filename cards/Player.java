package cards;
import behaviours.*;
import java.util.*;


public class Player implements Playing{
  
  private String playerName;
  private ArrayList<Holdable> hand;

  public Player(String playerName){
    this.playerName = playerName;
    this.hand = new ArrayList<Holdable>();
  }

  public void addCard(Holdable card){
    this.hand.add(card);
  }


  public int cardCount(){
    return this.hand.size();
  }

}
