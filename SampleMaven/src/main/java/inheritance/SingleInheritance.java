package inheritance;

 class A
{
	int a=5;
	void display()
	{
		System.out.println(a);
	}
	
}
 
 class B extends  A
 {
	 
	 int b=10;
	 void show()
	 {
		 System.out.println(b);
	 } 
 }


public class SingleInheritance {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();
		obj.show();

	}

}
