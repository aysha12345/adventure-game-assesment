package uoa.assignment1.character;

import java.util.Random;

public class Monster extends GameCharacter {
    
    private Random rand = new Random();

	public Monster(String name) {
		super(name);
	}


	public void hurtCharacter(GameCharacter character) {
        if (character.successfulDefense() == false) {
            character.setHealth(character.getHealth() - 20);
        }
	}

	
	public boolean successfulDefense() {
        int chance = rand.nextInt(2);
        if(chance == 0) {
            return true;
        } else {
            return false;
        }		  
	}


	
	public String decideMove () {
        int move = rand.nextInt(4);
        if (move == 0) {
            return "up";
        }
        else if (move == 1) {
            return "down";
        }
        else if (move == 2) {
            return "right";
        }
        else {
            return "left";
        }
	}

}

