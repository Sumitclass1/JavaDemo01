package Common;

public class AccessControlTest {
public static void main(String[] args) {
	AccessControlDemo obj1 = new AccessControlDemo();
	
	obj1.a = 10;
	obj1.b = 20;
	obj1.setc(30);
	System.out.println("value of a "+ obj1.a);
	System.out.println("value of b "+ obj1.b);
	System.out.println("value of c "+ obj1.getc());
	/*when a member of a class is public then it is accessed by any other code   
	 *if  private then it cannot be access in other classes and sub classes and sub classes  
	 *it can be access by only members of its class
	 *protected applied only when inheritance is involved
	 */ 
}
}
