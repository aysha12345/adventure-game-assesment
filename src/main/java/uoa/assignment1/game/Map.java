package uoa.assignment1.game;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Monster;
import uoa.assignment1.character.Player;

public class Map {
    public String[][] layout;
    public GameCharacter[] characters = new GameCharacter[4];
    
    public Map (int height, int width) {
        layout = new String[height][width];
    }
    
    //code to intialise array adapted from: https://www.codegrepper.com/code-examples/java/populate+2d+array+java
    private void initialiseArray() {
        for (int height = 0; height < layout.length; height++) {
            for (int width = 0; width < layout[height].length; width++) {
                layout[height][width] = ".";
            }
        }
    }
 
    //code to print array adapted from: https://www.codegrepper.com/code-examples/java/how+to+print++a+2d+array+in+java
    public void printLayout() {
        initialiseArray();
        for (int height = 0; height < layout.length; height ++) {
            for (int width = 0; width < layout[height].length; width++) {
                System.out.print(layout[height][width]);
            }
            System.out.println();
        }
    }   
}
