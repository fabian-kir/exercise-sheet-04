package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;

/**
 * In this hamster-game {@code paule} gets two new friends.
 *
 * @author (Your name)
 * @version (A date or a version number)
 */
public class PaulesFriendsGame extends InternalPaulesFriendsGame {

	/**
	 * Creates {@code paule}s friends {@code ronnie} in the bottom right corner and
	 * {@code paula} in the bottom left corner.
	 */
	void createPaulesFriends() {
	
		// TODO initialize variables below with values according to exercise 1 of sheet 4
		
		// Local variables for Ronnie
		Location locationRonnie = new Location(7, 7);
		Direction directionRonnie = Direction.NORTH;
		Territory territoryRonnie = game.getTerritory();
		Integer grainCountRonnie = 2;
		
		// Local variables for Paula
		Location locationPaula = new Location(7, 0);
		Direction directionPaula = Direction.EAST;
		Territory territoryPaula = game.getTerritory();
		Integer grainCountPaula = 5;
		
		// TODO create hamsters according to exercise 1 of sheet 4
		Hamster Ronnie = new Hamster(territoryRonnie, locationRonnie, directionRonnie, grainCountRonnie);
		Hamster Paula = new Hamster(territoryPaula,locationPaula, directionPaula, grainCountPaula);

		// Hint: Be careful with the location of the new hamsters
	}

	/**
	 * Starts the PaulesFriendsGame to create {@code paule}s friends.
	 * Do <strong>not modify</strong> this operation!
	 */
	protected void run() {
		game.startGame();
		createPaulesFriends();
	}
}


// This is a git test to mika