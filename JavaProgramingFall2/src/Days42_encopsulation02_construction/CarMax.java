package Days42_encopsulation02_construction;

public class CarMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car carOne=new Car();
carOne.setMake("Acura");
carOne.setModel("ILX");
carOne.setType("Sedan");
//carOne.setSpeed(35);
System.out.println("Make:" + carOne.getMake());
System.out.println("Current speed: " + carOne.getSpeed());

carOne.accellerate(30);
System.out.println("Current speed: " + carOne.getSpeed());

Car carTwo = new Car();
System.out.println("Car 2 make: " + carTwo.getMake());
System.out.println("Car 2 model: " + carTwo.getModel());
System.out.println("Car 2 type: " + carTwo.getType());

Car carThree = new Car("Coupe" , "Ford", "Mustang");
System.out.println("Car 3 make: " + carThree.getMake());
System.out.println("Car 3 model: " + carThree.getModel());
System.out.println("Car 3 type: " + carThree.getType());


//Car carFour = new Car("Coupe" , "Ford");
	}

}
