package automation_assignment;

public class HybridChild1 extends HybridParent {
	
	//employee1
	public void DoWork1() {
		System.out.println("Employee1 is working assignment.");
	}
	public static void main(String []args) {
		
	HybridChild1 c1= new HybridChild1();
	c1.Company_seat();
	c1.Work();
	c1.Salary();
	c1.DoWork1();
	}
}
