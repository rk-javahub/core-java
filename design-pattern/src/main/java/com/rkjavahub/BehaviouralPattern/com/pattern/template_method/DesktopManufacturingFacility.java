/**
 * 
 */
package com.rkjavahub.BehaviouralPattern.com.pattern.template_method;

/**
 * @author Rohit
 *
 */
public class DesktopManufacturingFacility extends AsusComputers {

	@Override
	void addHardDisk() {
		System.out.println("TOSHIBA 500 GB");
		
	}

	@Override
	void addRam() {
		System.out.println("4 GB DDR3");
		
	}

	@Override
	void addProcessor() {
		System.out.println("INTEL CORE I 5");
		
	}

}
