package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	
	public void print()
	{
		System.out.println("TTT");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SuperMethodChild obj=new SuperMethodChild();
     obj.print();
     
	}

}
