/*
 * Othello class project competition
 * Copyright 2017 Roger Jaffe
 * All rights reserved
 */
 

/**
 * Othello class project competition
 * @author Roger Jaffe
 * @version 1.0
 */
public class Othello {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Controller c = new Controller( 
      new TestPlayer(Constants.BLACK), 
      new Corner(Constants.WHITE)
    );
    c.displayMatchup();
    int result = c.run();
    System.exit(0);
  }
  
}
