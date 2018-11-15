package Days40_CostumClass;

public class CellPhonefactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CellPhone phone1= new CellPhone();//we create object from a cellPhone class
	phone1.brand="Apple iPhone XS";
	phone1.color="Piona Balck ";
	phone1.price=999.0;
	
	
	phone1.call();
	phone1.text();
	CellPhone phone2= new CellPhone();
	//create  2 cellohine object
	phone2.brand="Ericson 1018";
	phone2.color="Silver";
	phone2.price=30.5;
	
	
	CellPhone phone3= new CellPhone();
	phone3.brand="Htc Evo";
	phone3.color="Black";
	phone3.price=350.5;
	
	phone2.call();
	phone3.text();
	System.out.println("phone1 brand -" +phone1.brand);
	System.out.println("phone2 brand -" +phone2.brand);
	System.out.println("phone3 brand -" +phone3.brand);
	//calculate all price of all tree object
	double total=phone1.price+phone2.price+phone3.price;
	System.out.println("Total price of all three phone:" + total);
	// can we update object values
	phone1.price=1200.0;
	phone2.price=phone3.price;
	System.out.println("pHone1 price:" + phone1.price);
	System.out.println("pHone1 price:" + phone2.price);
	System.out.println("pHone1 price:" + phone3.price);
	
	}

}
