package inheritance;

public class MultilevelChild  extends MultilevelParent{
	public static void displayOfChild()
	{
		System.out.println("Child");
	}
	

	public static void main(String[] args) {
		
		MultilevelChild  n=new MultilevelChild();
		n.GrandParent();
		n.display();
		n.displayOfChild();

	}

}
