package Days42_encopsulation02_construction;

public class Car {
private String type;
private String make;
private String model;
private int speed;

public Car() {
	System.out.println("car class constructure");
	type="Unknown";
	make="Unknown";
	model="Unknown";
}

public Car(String type,String make,String model ) {
	System.out.println("3 args constructor");
	this.type=type;
	this.make=make;
	this.model=model;
}





public void  accellerate(int mph) {
	speed+=mph;
	System.out.println(make + " " + type + "is accelerating.");
}



public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

}
