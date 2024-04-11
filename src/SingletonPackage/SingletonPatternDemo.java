package singletonPackage;

/*** 
 * main class for Singleton pattern
 * @author Chitra
 * @version 2024.04
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		
        //SingleObject object = new SingleObject();
        
        //Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		//Show message
        object.showMessage();

	}

}
