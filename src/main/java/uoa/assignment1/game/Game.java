package uoa.assignment1.game;

import uoa.assignment1.character.Monster;


public class Game {
    public Map map;
  
    Game (int height, int width) {
        map = new Map(height, width);
        
    }
    
    public void setMap() {
        map.printLayout();
    }
    			
    public Map getMap() {
        setMap();
        return map;
    }
    
    public boolean nextRound (String input) {
        return true;
    }
   
}