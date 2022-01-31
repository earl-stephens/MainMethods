package application;

public class App {
	/* main method is public because it is called outside of itself
	 * by the JVM.
	 * It's static because there is no instance of the App class (not
	 * instantiated.  
	 * Being public static lets the main method be called outside of the 
	 * class itself, without creating an App object.
	 * String[] args refers to inputs/text coming in from the command
	 * line.
	 */
	public static void main(String[] args) {
		for(String arg: args) {
			System.out.println(arg);
		}
	}
}
