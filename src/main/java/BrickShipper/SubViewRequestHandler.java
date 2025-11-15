package BrickShipper;

/**
 * Lets the super-Controller (JavaFX FXML) not need to care which 
 * exact controller it is dealing with.
 */
public interface SubViewRequestHandler {
	
	/**
	 * Takes a Consumer that throws an Exception. Returns nothing.
	 */
	public void setOnViewSwitch(ThrowingConsumer<String> runner);

}
