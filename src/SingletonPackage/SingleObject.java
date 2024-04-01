package SingletonPackage;

public class SingleObject {
    /**
     * Create an object of SingleObject
     */
    private static SingleObject instance = new SingleObject();
    
    /**
     * make the constructor private so that this class cannot be instantiated
     */
    private SingleObject() {}
    
    /**
     * get the only object available
     * @return instance
     */
     public static SingleObject getInstance(){
         return instance;
     }   
     
     public void showMessage(){
         System.out.println("Singleton Pattern!");
     }

}
