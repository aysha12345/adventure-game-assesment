package uoa.assignment1.character;

import java.util.Random;

public class Player extends GameCharacter{
    
    private Random rand = new Random();

	public Player(String name) {
		super(name);
	}

	
	public
	void hurtCharacter(GameCharacter character) {
        if (character.successfulDefense() == false) {
            character.setHealth(character.getHealth() - 50);
        }
		
	}

	
	public
	boolean successfulDefense() {
        int chance = rand.nextInt(10);
        if (chance <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
