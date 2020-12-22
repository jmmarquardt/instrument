/**Chrom.java
 * Written by: John-Michael Marquardt
 * Date: 22-DEC-2020
 */
package com.instruments.model.instrument;

/**
 * Chrom - An Interface to be implemented by all Chromatography type 
 * Instruments. Chromatographs have a sampling method, an injection source,
 * a column oven (or chiller), an analytical column, and some type of detector
 * at minimum. This interface forces the implementation of all common 
 * chromatography data types and methods, which need to be defined in
 * the concrete class that implements this interface.
 * @author John-Michael Marquardt, jmmarquardt@gmail.com
 */
public interface Chrom {
	
}
