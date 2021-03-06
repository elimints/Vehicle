package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

/**
 * This class implements EventHandler. The methods in this class are used to
 * create a park button for the application.
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class ParkButton extends GUIButton implements EventHandler<ActionEvent> {

	/**
	 * Method used to create the park button.
	 * 
	 * @param string
	 */
	public ParkButton(String string) {
		super(string);
	}

	/**
	 * Method used to handle the button clicks.
	 */
	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().changeGearToPark();
	}
}
