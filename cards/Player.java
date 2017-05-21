package cards;
import behaviours.*;
import java.util.*;


public class Player {
  
  private String playerName;
  private ArrayList<Holdable> hand;

  public Player(String playerName){
    this.playerName = playerName;
    this.hand = new ArrayList<Holdable>();
  }

}
