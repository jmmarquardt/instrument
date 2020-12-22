package com.instruments.model.instrument;

/** 
 * Manufacturer - enumeration of Manufacturers of Laboratory Instruments
 * @author John-Michael Marquardt, jmmarquardt@gmail.com 
 */
public enum Manufacturer {
	/** Agilent Technologies */
	AGILENT("Agilent"),
	/** Bruker */
	BRUKER("Bruker"),
	/** Hitachi */
	HITACHI("Hitachi"),
	/** PerkinElmer, Inc */
	PERKIN_ELMER("PerkinElmer"),
	/** Shimadzu */
	SHIMADZU("Shimadzu"), 
	/** ThermoFisher Scientific */
	THERMO("Thermo-Fisher Scientific");
	/** The value (String) of this enumeration */
	public final String val;
	
	Manufacturer(String value) {
		this.val = value;
	}
}