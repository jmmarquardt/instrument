/**
 * Instrument.java
 * Written By: John-Michael Marquardt, jmmarquardt@gmail.com
 * Date: 20-DEC-2020
 */

package com.instruments.model;

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
    /** The category of this Instrument. */
    private Category category;
	/** manufacturer: the manufacturer of the instrument */
    private Manufacturer manufacturer;
    /** manufactureDate: the instrument's manufacture date */
    private DateFormat manufactureDate;
    /** model: the manufacturer model number */
    private String model;
    /** serial: the instrument's unique identifier */
    private String serial;
    /** name: an optional name */
    private String name;
    
	/**
	 * Instrument(Category, String, DateFormat, String, String) - A constructor
	 * accepting all fields as parameters to generate a new Instrument object.
	 * 
	 * @param category the Instrument category (enum).
	 * @param manufacturer the manufacturer of this instrument (String).
	 * @param manufactureDate the date this instrument instance was manufactured
	 *                        (DateFormat).
	 * @param model the model name or number of this instrument (String).
	 * @param serial the serial number (String) of this Instrument instance,
	 *                  which may contain letters, numbers and special
	 *                  characters but cannot be null or an empty String.
	 * @param name An optional name identifier for this Instrument instance
	 *                (String).
	 */
    public Instrument(Category category, Manufacturer manufacturer,
					  DateFormat manufactureDate, String model, String serial,
					  String name) {
		setCategory(category);
		setManufacturer(manufacturer);
		setManufactureDate(manufactureDate);
		setModel(model);
		setSerial(serial);
		setName(name);
	}

	/**
	 * getCategory() - returns the Category of this Instrument.
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * setCategory(Category) - sets the category field of this Instrument to
	 * the given Category.
	 * @param category the category to set
	 */
	private void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * getManufacturer - returns the manufacturer of this instrument.
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer.val;
	}

	/**
	 * setManufacturer(String) - sets the manufacturer of this Instrument to
	 * the given String.
	 * @param manufacturer the manufacturer to set
	 */
	private void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * getManufactureDate - returns the manufactureDate of this instrument
	 * as a formatted DateFormat object.
	 * @return the manufactureDate
	 */
	public DateFormat getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * setManufactureDate(DateFormat) - sets the manufactureDate of this
	 * instrument to the given DateFormat object.
	 * @param manufactureDate the manufactureDate to set
	 */
	private void setManufactureDate(DateFormat manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	/**
	 * getModel - returns the model name or number of this Instrument.
	 * @return the model name or model number of this instrument.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * setModel(String) - sets the model name or number of this Instrument to
	 * the given String.
	 * @param model the model number or name to set
	 */
	private void setModel(String model) {
		this.model = model;
	}

	/**
	 * getSerial - returns the serial number as a String.
	 * @return the serial number (String).
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * setSerial(String) - used only by the constructor, this method sets the
	 * serial field value to the given serial number.
	 * @param serial the serial number to set on construction.
	 */
	private void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * getName - returns the name (String) if any, of this instrument, otherwise
	 * it returns an empty String.
	 * @return the name or an empty String.
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName(String) - sets the name field to the given String.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}  
}