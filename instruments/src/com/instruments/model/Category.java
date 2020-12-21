/**
 * Category.java
 * Written by: John-Michael Marquardt
 * Date: 21-DEC-2020
 */
package com.instruments.model;

/**
 * Category - A category of an instrument typically found in a chemical
 * laboratory (e.g. HPLC, GC, AA, ICP, UV/VIS).
 * @author John-Michael Marquardt, jmmarquardt@gmail.com
 */
public enum Category {
	/** Chromatography */
	CHROMATOGRAPHY("Chromatography (HPLC, HPLC/MS, GC, GC/MS)"),
	/** Material Characterization */
	MAT_CHAR("Material Characterization (e.g. Polarimeter, UV/VIS, IR, Fluorometer)"),
	/** Thermal Analysis */
	THERMAL("Thermal Analysis (e.g. DSC, TGA)"),
	/** Inorganic Analysis */
	INORGANIC("Inorganic Chemical Analysis (e.g. AA, ICP, ICP/MS)"),
	/** Balances and Scales */
	BALANCE("Balances and Scales"),
	/** Weight sets */
	WEIGHTS("Weights and weight sets"),
	/** Pipettes */
	PIPETTE("Pipettes and liquid handling"),
	/** Meters (thermometers, pH meters) */
	METER("Meters (e.g. pH meters, Digital Thermometers, Chart Recorders)"),
	/** Fume Hoods */
	HOOD("Fume Hoods, Glove Boxes, Isolation Chambers"),
	/** Stability Chambers, Refrigerators */
	STABILITY_REFRIGERATION("Stability Chambers and Refrigerators (walk-in and cabinet)"),
	/** Ovens, Muffle Furnaces */
	OVENS_FURNACES("Ovens, Furnaces, Incubation Chambers"),
	/** Medical and diagnostic equipment */
	DIAGNOSTIC("Diagnostic and Medical Equipment");
	/** The value of this enumeration, represented as a String */
	public final String val;
	Category(String value) {
		this.val = value;
	}
}