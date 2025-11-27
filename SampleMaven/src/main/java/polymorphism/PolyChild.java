package polymorphism;

public class PolyChild extends PolyParent{
	public void addition(int a , int b)
	{
		super.addition(5, 2);
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
			
   PolyChild obj=new PolyChild();
   obj.addition(5, 100);
 
	}

}
