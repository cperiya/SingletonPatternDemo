package singletonPackage;

/** class with methods related to singleton pattern instance  
 * @author Chitra
 * @version 2024.04
 */
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
     
     /**
      * prints the pattern name
      * 
      */
     public void showMessage(){
         System.out.println("Singleton Pattern!");
     }

}
