package vehicle.model;

public class Car extends FourWheeler{

	public Car(int speed, String model, String color, int seats) {
		super(speed, model, color, seats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String moving() {
		// TODO Auto-generated method stub
		return "Car - model no. " + this.model + " is moving";
	}

	@Override
	public String speedinkmperhr() {
		// TODO Auto-generated method stub
		return "Car is moving at the speed of" + this.speed + "km/hr";
	}

	@Override
	public String toString() {
		return "[Car]\nmodel: " + this.model + ",\nNumber of Tyres: " + this.noOfTyres + ",\nColor: " + this.color + ",\nNo. of seats: " + this.seats;
	}
	
	

}
