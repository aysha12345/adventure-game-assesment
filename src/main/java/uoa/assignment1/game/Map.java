package uoa.assignment1.game;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Monster;
import uoa.assignment1.character.Player;

public class Map {
    public String[][] layout;
    public GameCharacter[] characters;
    
    public Map (int height, int width) {
        layout = new String[height][width];
        characters = new GameCharacter[4];
        Player player = new Player("name");
        player.column = width - 1;
        player.row = height - 1 ;
        Monster monster1 = new Monster("name");
        monster1.column = width - 1;
        monster1.row = 0;
        Monster monster2 = new Monster("name");
        monster2.column = 0;
        monster2.row = height - 1;
        Monster monster3 = new Monster("name");
        monster3.row = 0;
        monster3.column = 0;
        characters[0] = player;
        characters[1] = monster1;
        characters[2] = monster2;
        characters[3] = monster3;
    }
    
    //code to intialise array adapted from: https://www.codegrepper.com/code-examples/java/populate+2d+array+java
    private void initialiseArray() {   
        for (int height = 0; height < layout.length; height++) {
            for (int width = 0; width < layout[height].length; width++) {
                layout[height][width] = ".";
            }
        }
        layout[characters[0].row][characters[0].column] = "*";
        layout[characters[1].row][characters[1].column] = "%";
        layout[characters[2].row][characters[2].column] = "%";
        layout[characters[3].row][characters[3].column] = "%";
    }
    
    public void getArray() {
            initialiseArray();
    } 
    
    //code to print array adapted from: https://www.codegrepper.com/code-examples/java/how+to+print++a+2d+array+in+java
    public void printLayout() {
        getArray();
        for (int height = 0; height < layout.length; height ++) {
            for (int width = 0; width < layout[height].length; width++) {
                System.out.print(layout[height][width]);
            }
            System.out.println();
        }
    }   
}
