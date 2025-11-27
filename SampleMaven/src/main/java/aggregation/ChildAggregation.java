package aggregation;

public class ChildAggregation {
	String city;

	String state;
	
	ParentAggregation ref;
	public ChildAggregation(String city,String state,ParentAggregation ref)
	{
		this.ref=ref;
		this.city=city;
		this.state=state;
		
	}
	
	public void display()
	{
		System.out.println(ref.name);
		System.out.println(ref.age);
		System.out.println(ref.Adress);
		System.out.println(city);
		System.out.println(state);
	
		
	}
	
	public static void main(String[] args) {
		
		ParentAggregation obj1=new ParentAggregation("Ashna",28,"Test");
		ChildAggregation obj2=new ChildAggregation("Kanjirappally","Kerala",obj1);
		obj2.display();
	}

}
