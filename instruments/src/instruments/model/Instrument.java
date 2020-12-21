/**
 * Instrument.java
 * Written By: John-Michael Marquardt, jmmarquardt@gmail.com
 * Date: 20-DEC-2020
 */

package instruments.model;

import java.text.DateFormat;

/**
 * Instrument - An abstract class defining a basic laboratory instrument.
 * An Instrument has the following fields:
 * type: a category of instrument (e.g. HPLC, GC, AA, ICP, UV/VIS)
 * manufacturer: the manufacturer of the instrument
 * manufactureDate: the instrument's manufacture date
 * model: the manufacturer model number
 * serial: the instrument's unique identifier
 * name: an optional name
 * ----------------------
 * optionally, the following fields can be incorporated by an interface, for a LIMS
 * asset#: an optional asset number
 * location: the current physical location of the instrument
 * isActive: boolean if instrument is currently active.
 * activeStatus: enum (out of service, in service)
 * calibrationStatus: enum (in calibration, out of calibration, calibration in progress)
 * GXP: boolean
 * installDate:
 * ageDays:
 * purchaseCost:
 * currentDepreciatedValue:
 * depreciationRate
 * lifeTime
 * avgServiceLifetime
 * avgExpectancy
 * manufacturerSupport:
 * serviceProvider:
 * contractId:
 * startDate:
 * endDate:
 * numPMYear: int
 * pmFrequency: enum
 * 
 * @author John-Michael Marquardt, jmmarquardt@gmail.com
 * 
 */
public abstract class Instrument {
	private Category category;
	/** manufacturer: the manufacturer of the instrument */
	private String manufacturer;
    /** manufactureDate: the instrument's manufacture date */
    private DateFormat manufactureDate;
    /** model: the manufacturer model number */
    private String model;
    /** serial: the instrument's unique identifier */
    private String serial;
    /** name: an optional name */
    private String name;
	
	/** Category: a category of instrument (e.g. HPLC, GC, AA, ICP, UV/VIS) */
    private enum Category 
    {
    	CHROMATOGRAPHY, 
    	MAT_CHAR, 
    	INORGANIC, 
    	BALANCE, 
    	PIPETTE, 
    	METER, 
    	HOOD, 
    	STABILITY_REFRIGERATION, 
    	OVENS_FURNACES, 
    	DIAGNOSTIC
    }

	/** Instrument(Category, String, DateFormat, String, String) - A constructor 
	 * accepting all fields as parameters to generate a new Instrument object.
	 * 
	 * @param category the Instrument category (enum)
	 * @param manufacturer
	 * @param manufactureDate
	 * @param model
	 * @param serial
	 * @param name
	 */
	public Instrument(Category category, String manufacturer, DateFormat manufactureDate, String model, String serial,
			String name) {
		setCategory(category);
		setManufacturer(manufacturer);
		setManufactureDate(manufactureDate);
		setModel(model);
		setSerial(serial);
		setName(name);
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	private void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	private void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the manufactureDate
	 */
	public DateFormat getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * @param manufactureDate the manufactureDate to set
	 */
	private void setManufactureDate(DateFormat manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	private void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial the serial to set
	 */
	private void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

    
}
