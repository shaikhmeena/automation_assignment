package automation_assignment;

public class HybridChild2 extends HybridParent{
	//employee2
	
	public void DoWork2() {
		System.out.println("Employee2 is working assignment.");
	}
	public static void main(String []args) {
	
	HybridChild2 c2= new HybridChild2();
	c2.Company_seat();
	c2.Work();
	c2.Salary();
	c2.DoWork2();
	
}
	
}
