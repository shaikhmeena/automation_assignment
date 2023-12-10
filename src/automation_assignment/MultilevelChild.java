package automation_assignment;

public class MultilevelChild extends MultilevelParent{

	public void FarmHouse() {
		
		System.out.println("It's Child_House");
	}
	protected void Car() {
		
		System.out.println("It's Child_Car");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild c1= new MultilevelChild();
		c1.Shop();//MultilevelChild object can access method of MultilevelGranParent class.
		c1.House();//MultilevelChild object can access method of MultilevelParent class.
		c1.Bike();//MultilevelChild object can access method of MultilevelParent class.
		c1.FarmHouse();
		c1.Car();
	}

}
