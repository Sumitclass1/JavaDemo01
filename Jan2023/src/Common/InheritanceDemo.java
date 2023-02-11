package Common;

public class InheritanceDemo {
	public static void main(String[] args) {
		InheritanceA parent =new InheritanceA ();
		InheritanceB child =new InheritanceB ();
		
		parent.i =10;
		parent.j =10;
		parent.showij();
		
		child.i =30;
		child.j =40;
		child.k =50;
		child.showij();
		child.showk();
		
		
	}

}
