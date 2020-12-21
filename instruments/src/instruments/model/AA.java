/**
 * 
 */
package instruments.model;

import java.text.DateFormat;

/** AA - A class representing an Atomic Absorption Spectrophotometer, which
 * is a type of Instrument.
 * 
 * @author johnm
 *
 */
public class AA extends Instrument {

	public AA(Category category, String manufacturer, DateFormat manufactureDate, String model, String serial,
			String name) {
		super(category, manufacturer, manufactureDate, model, serial, name);
		// TODO Auto-generated constructor stub
	}

}
