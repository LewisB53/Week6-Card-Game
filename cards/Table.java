package cards;
import behaviours.*;
import java.util.*;


public class Table {
  
  private ArrayList<Playing> players;

  public Table(){

    this.players = new ArrayList<Playing>();
  }

  public void addPlayer(Playing player){
    this.players.add(player);
  }


  public int playerCount(){
    return this.players.size();
  }

}