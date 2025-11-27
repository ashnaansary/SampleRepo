package inheritance;

public class SingleChild extends SingleParent{
	public void print()
	
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) 
	{
		SingleChild obj=new SingleChild();
		obj.display();
		obj.print();
    }

}
