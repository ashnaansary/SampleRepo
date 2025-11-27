package inheritance;
class Q 
{
	 
	
	 void show(int a)
	 {
		 System.out.println(a);
	 } 
}

class W extends  Q
{
	 
	 
	 void display( int d)
	 {
		 System.out.println(d);
	 } 
}

class T extends  Q
{
	 
	 
	 void print(int s)
	 {
		 System.out.println(s);
	 } 
}



public class HierarchicalInheritance {

	public static void main(String[] args) {
		
    T obj1=new T();
    obj1.print(3);
    obj1.show(5);
    
    W obj2=new W();
    obj2.display(1);
    obj2.show(2);
    
	}

}
