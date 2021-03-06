package com.geekend.core.game.components.controllable.player;

import com.geekend.core.game.components.controllable.State;

public enum PlayerStates implements State<Player> {

	WAITING(new int[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 2, 0, 1, 0, 1, 0, 56, 56 }, 700f), SHOOTING(new int[] { 3, 4, 5, 6, 7 }, 40f), RUNNING(new int[] {
			8, 9, 10, 11, 12, 13, 14, 15 }, 120f), SKATING(new int[] { 16, 17 }, 300f), SKATING_HIT(new int[] { 22 }, 50f), HIT(new int[] { 53 }, 50f), DEAD(
			new int[] { 55 },
			50f);

	private final int[] spriteIndexes;
	private final float delay;

	private PlayerStates(final int[] spriteIndexes, final float delay) {
		this.spriteIndexes = spriteIndexes;
		this.delay = delay;
	}

	@Override
	public float getCountdownDelay() {
		return delay;
	}

	@Override
	public int numSprites() {
		return spriteIndexes.length;
	}

	@Override
	public int getSpriteIndex(final int index) {
		return spriteIndexes[index];
	}

	@Override
	public int ordinalRepresentation() {
		return ordinal();
	}
}
