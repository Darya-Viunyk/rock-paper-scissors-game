package org.example;

 class RockPaperScissorsGame {
  private Player player1;
  private Player player2;

  public RockPaperScissorsGame(Player player1, Player player2) {
   this.player1 = player1;
   this.player2 = player2;
  }



  public void play(){
   Move move1 = player1.getMove();
   Move move2 = player2.getMove();

   System.out.println(player1.getName() + "chose" + move1.detName());
   System.out.println(player2.getName() + "chose" + move2.detName());

   if (move1.beats(move2)){
    System.out.println(player1.getName() + " wins!");
   } else if (move2.beats(move1)) {
    System.out.println(player2.getName() + " wins!");

   }else {
    System.out.println("It is a draw! Let's play again.");
   }
  }
}
