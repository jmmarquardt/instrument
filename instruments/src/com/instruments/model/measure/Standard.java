/**
 * Standard.java
 * Written by: John-Michael Marquardt
 * Date: 22-Dec-2020 
 */
package com.instruments.model.measure;

import java.text.DateFormat;

/**
 * Standard - An Interface that declares all of the fields
 * and methods common to Standards.
 * @author John-Michael Marquardt, jmmarquardt@gmail.com
 */
public abstract class Standard {
	private boolean isTraceable;
	private boolean isExpired;
	private boolean isActive;
	private DateFormat calibrationDate;
	private DateFormat expirationDate;
	private String name;
	private String description;
	
	
	
	/**
	 * @param isTraceable
	 * @param isExpired
	 * @param isActive
	 * @param calibrationDate
	 * @param expirationDate
	 * @param name
	 * @param description
	 */
	public Standard(boolean isTraceable, boolean isExpired, boolean isActive, DateFormat calibrationDate,
			DateFormat expirationDate, String name, String description) {
		this.isTraceable = isTraceable;
		this.isExpired = isExpired;
		this.isActive = isActive;
		this.calibrationDate = calibrationDate;
		this.expirationDate = expirationDate;
		this.name = name;
		this.description = description;
	}
	/** isTraceable - returns true if the standard is traceable to a NIST standard.
	 * @return the isTraceable
	 */
	public boolean isTraceable() {
		return isTraceable;
	}
	/**
	 * @param isTraceable the isTraceable to set
	 */
	public void setTraceable(boolean isTraceable) {
		this.isTraceable = isTraceable;
	}
	/**
	 * @return the isExpired
	 */
	public boolean isExpired() {
		return isExpired;
	}
	/**
	 * @param isExpired the isExpired to set
	 */
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}
	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the calibrationDate
	 */
	public DateFormat getCalibrationDate() {
		return calibrationDate;
	}
	/**
	 * @param calibrationDate the calibrationDate to set
	 */
	public void setCalibrationDate(DateFormat calibrationDate) {
		this.calibrationDate = calibrationDate;
	}
	/**
	 * @return the expirationDate
	 */
	public DateFormat getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(DateFormat expirationDate) {
		this.expirationDate = expirationDate;
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
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
