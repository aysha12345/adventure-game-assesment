package uoa.assignment1.game;

import java.util.Scanner;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Player;
import uoa.assignment1.character.Monster;

public class GameLogic {
    

	public static void moveCharacter(String input, Map gameMap, GameCharacter character) {
        if (input == "up") {
            moveUp(character, gameMap);
        }
        
        else if (input == "down") {
            moveDown(character, gameMap);
        }
        
        else if (input == "left") {
            moveLeft(character, gameMap);
        }
        
        else if (input == "right") {
            moveRight(character, gameMap);
        }
        
        else if (input != "up" ||input != "down" || input != "left" || input != "right") {
            System.out.println("Use only keywords up, down, left, right");            
        }
	}
    
    private static void moveUp(GameCharacter character, Map gameMap) {
        character.row -= 1;
        gameMap.printLayout();
        }        
     
    private static void moveDown(GameCharacter character, Map gameMap) {
        character.row += 1;
        gameMap.printLayout();
        }                      
    
     private static void moveRight(GameCharacter character, Map gameMap) {
         character.column += 1;
         gameMap.printLayout();
         }                           
    private static void moveLeft(GameCharacter character, Map gameMap) {
        character.column -= 1;
        gameMap.printLayout();
    }                        	
}
