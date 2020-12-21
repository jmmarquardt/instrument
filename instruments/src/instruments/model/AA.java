/**
 * 
 */
package instruments.model;

import java.text.DateFormat;

/** AA - A class representing an Atomic Absorption Spectrophotometer, which
 * is a type of Instrument.
 * 
 * @author John-Michael Marquardt, jmmarquardt@gmail.com
 *
 */
public class AA extends Instrument {
	/** Agilent Technologies */
	public static final String AGILENT = "Agilent";
	/** Bruker */
	public static final String BRUKER = "Bruker";
	/** Hitachi */
	public static final String HITACHI = "Hitachi";
	/** PerkinElmer */
	public static final String PERKINELMER = "PerkinElmer";
	/** ThermoFisher Scientific */
	public static final String TFS = "Thermo-Fisher Scientific";
	
	/**
	 * AA(Category, String, DateFormat, String, String, String) - Constructor
	 * @param category Inorganic
	 * @param manufacturer 
	 * @param manufactureDate
	 * @param model
	 * @param serial
	 * @param name
	 */
	public AA(Category category, String manufacturer, DateFormat manufactureDate,
			String model, String serial, String name) {
		super(category, manufacturer, manufactureDate, model, serial, name);
		// TODO Auto-generated constructor stub
	
	}
}
