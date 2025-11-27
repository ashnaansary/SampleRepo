package inheritance;


class C
{
	int a;
	void display()
	{
		System.out.println(a);
	}
	
}

class D extends  C
{
	 
	 int b;
	 void show()
	 {
		 System.out.println(b);
	 } 
}

class E extends D
{
	
	int d;
	 void print()
	 {
		 System.out.println(d);
	 } 
	
	
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     E obj=new E();
     obj.a=3;
     obj.b=4;
     obj.d=5;
     obj.display();
     obj.print();
     obj.show();
     
	}

}
