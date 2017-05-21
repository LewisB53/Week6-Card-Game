public class LoseState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in Lose state");
      context.setState(this); 
   }

   public String toString(){
      return "Win State";
   }
}