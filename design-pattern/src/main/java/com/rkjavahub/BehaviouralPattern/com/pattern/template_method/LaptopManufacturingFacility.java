/**
 * 
 */
package com.rkjavahub.BehaviouralPattern.com.pattern.template_method;

/**
 * @author Rohit
 *
 */
public class LaptopManufacturingFacility extends AsusComputers {

	@Override
	void addHardDisk() {
		System.out.println("SEGATE SATA 1 TB and 500GB SSD");

	}

	@Override
	void addRam() {
		System.out.println("8 GB DDR4");

	}

	@Override
	void addProcessor() {
		System.out.println("AMD RYZEN 5000");

	}

}
