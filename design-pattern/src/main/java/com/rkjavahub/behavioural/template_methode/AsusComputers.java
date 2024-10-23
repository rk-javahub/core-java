/**
 * Program for template methode design pattern.
 */
package com.rkjavahub.behavioural.template_methode;

/**
 * @author Rohit
 *
 */
public abstract class AsusComputers {
	public void buidComputer() {
		addHardDisk();
		addRam();
		addProcessor();
	}

	abstract void addHardDisk();

	abstract void addRam();

	abstract void addProcessor();
	
}
