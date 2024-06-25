package Blatt7.Aufgabe17;

import java.util.ArrayList;
import java.util.List;

class Player {
    private int health ;
    private int score ;
    private int level ;
    public Player ( int health , int score , int level ) {
        this . health = health ;
        this . score = score ;
        this . level = level ;
    }
    public GameState save () {
        return new GameState ( health , score , level );
    }
    public void restore ( GameState gameState ) {
        health = gameState . getHealth ();
        score = gameState . getScore ();
        level = gameState . getLevel ();
        System .out . println (" Restored game state : " + health + " health , " + score + " score , " + level + " level ");
    }
    public int getHealth () {
        return health ;
    }
    public int getScore () {
        return score ;
    }
    public int getLevel () {
        return level ;
    }
    public void setHealth ( int health ) {
        this . health = health ;
    }
    public void setScore ( int score ) {
        this . score = score ;
    }
    public void setLevel ( int level ) {
        this . level = level ;
    }
}
class GameState {
    private int health ;
    private int score ;
    private int level ;
    public GameState ( int health , int score , int level ) {
        this . health = health ;
        this . score = score ;
        this . level = level ;
    }
    public int getHealth () {
        return health ;
    }
    public int getScore () {
        return score ;
    }
    public int getLevel () {
        return level ;
    }
}
class GameSaver {
    private Player player ;
    private List< GameState > history = new ArrayList< >();
    public GameSaver ( Player player ) {
        this . player = player ;
    }
    public void save () {
        GameState gameState = player . save ();
        history . add ( gameState );
        System .out . println (" Saved game state : " + player . getHealth () + " health , " +
                player . getScore () + " score , " + player . getLevel () + " level ");
    }
    public GameState getGameState ( int index ) {
        return history . get ( index );
    }
}
public class Maini {
    public static void main ( String [] args ) {
        Player player = new Player (100 , 0, 1);
        GameSaver saver = new GameSaver ( player );
        player . setHealth (80) ;
        player . setScore (10) ;
        player . setLevel (2) ;
        /* Start */
        saver . save ();
        player . setHealth (50) ;
        player . setScore (20) ;
        player . setLevel (3) ;
        player . restore ( saver . getGameState (0) );
        /* Ende */
    }
}