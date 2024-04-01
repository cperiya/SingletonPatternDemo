package SingletonPackage;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//illegal construct- compile time error 
        //SingleObject object = new SingleObject();
        
        //Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		//Show message
        object.showMessage();

	}

}
