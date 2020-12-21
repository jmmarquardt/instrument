/**
 * 
 */
package com.instruments.model;

import java.text.DateFormat;

/** AA - A class representing an Atomic Absorption Spectrophotometer, which
 * is a type of Instrument in a chemical analysis laboratory commonly used
 * to analyze heavy metals in liquids (water).
 * 
 * @author John-Michael Marquardt, jmmarquardt@gmail.com
 *
 */
public class AA extends Instrument {

	
	/**
	 * AA(Category, String, DateFormat, String, String, String) - Constructor
	 * @param category Inorganic
	 * @param manufacturer Agilent, Bruker, Hitachi, PerkinElmer, ThermoFisher, Shimadzu
	 * @param manufactureDate DateFormat object
	 * @param model Model number depends on manufacturer selected
	 * @param serial String
	 * @param name Optional name String
	 */
	public AA(Category category, Manufacturer manufacturer, DateFormat manufactureDate,
			String model, String serial, String name) {
		super(category, manufacturer, manufactureDate, model, serial, name);
		// TODO Auto-generated constructor stub
	
	}
}
