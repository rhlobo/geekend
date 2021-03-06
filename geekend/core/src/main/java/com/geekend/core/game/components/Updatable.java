package com.geekend.core.game.components;

import playn.core.GroupLayer;



/**
 * A module represents a screen / level.
 */
public interface Updatable {
	
	/**
	 * Initializes this module. Here is where listeners should be wired up and
	 * resources loaded.
	 */
	void init(GroupLayer rootLayer);

	/**
	 * Shuts down this module. Listeners should be cleared and resources
	 * destroyed.
	 */
	public abstract void destroy();

	/**
	 * Called every update tick while this module is active.
	 * 
	 * @param delta
	 *            the amount of time that has elapsed since the last update
	 *            call.
	 */
	public void update(float delta);

	/**
	 * Called while this module is active, to paint it.
	 * 
	 * @param alpha
	 *            a value in the range [0,1) that represents the fraction of the
	 *            update tick that has elapsed since the last call to update.
	 */
	public void paint(float alpha);

}
