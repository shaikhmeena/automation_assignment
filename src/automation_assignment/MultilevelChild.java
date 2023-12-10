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
		MultilevelGrandParent gp1= new MultilevelGrandParent();
		gp1.Shop(); //MultilevelGrandParent object can access method of MultilevelGranParent class
		//gp1.House();//MultilevelGrandParent object cannot access method of MultilevelParent class.
		//gp1.Bike();//MultilevelGrandParent object cannot access method of MultilevelParent class.
		//gp1.FarmHouse();//MultilevelGrandParent object cannot access method of MultilevelChild class.
		//gp1.Car();//MultilevelGrandParent object cannot access method of MultilevelChild class.
		MultilevelParent p1= new MultilevelParent();
		p1.House(); //MultilevelParent object can access method of MultilevelParent class.
		p1.Bike(); //MultilevelParent object can access method of MultilevelParent class.
		p1.Shop();//MultilevelParent object can access method of MultilevelGranParent class.
		//p1.FarmHouse(); //MultilevelParent object cannot access method of MultilevelChild class.
		//p1.Car();//MultilevelParent object cannot access method of MultilevelChild class.
	
	}

}
