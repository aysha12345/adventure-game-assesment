package uoa.assignment1.game;

import uoa.assignment1.character.Monster;
import uoa.assignment1.character.Player;

public class Game {
    public Map map;
    public Player player;
    public Monster monster;
    
    Game (int height, int width) {
        map = new Map(height, width);
        player = new Player("name");            
        monster = new Monster("name");
    }
    
    public void setMap() {
        map.printLayout();
    }
    			
    public Map getMap() {
        setMap();
        return map;
    }
    
    public boolean nextRound (String input) {
        getMap();
        if (input.equals("up") || input.equals("down") || input.equals("left") || input.equals("right")) {
            System.out.println("Player is moving " + input);
        }
        GameLogic.moveCharacter(input, map, map.characters[0]);
        for (int i = 1; i < map.characters.length; i++) {
            if (map.characters[i].getHealth() != 0) {
                String monsterMove = monster.decideMove();
                System.out.println("Monster is moving " + monsterMove);
                GameLogic.moveCharacter(monsterMove, map, map.characters[i]);
            }
        }
        System.out.println("Health Player:\t" + map.characters[0].getHealth());
        System.out.println("Health Monster1:\t" + map.characters[1].getHealth());
        System.out.println("Health Monster2:\t" + map.characters[2].getHealth());
        System.out.println("Health Monster3:\t" + map.characters[3].getHealth());
        return true;
    }   
}
 /*
                if (monsterMove.equals("up")) {
                    int currentRow = map.characters[i].row;
                    int currentColumn = map.characters[i].column;
                    if (map.layout[currentRow][currentColumn - 1].equals("%")) {
                        System.out.println("Monster alreadythere so can't move");
                    }                    
                }
                */