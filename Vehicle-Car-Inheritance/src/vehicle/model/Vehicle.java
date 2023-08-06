package vehicle.model;

public abstract class Vehicle {
	protected String model;
	protected String color;
	protected int speed;
	
	public Vehicle(int speed, String model, String color) {
		super();
		this.speed = speed;
		this.model = model;
		this.color = color;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract String moving();
	
	public abstract String speedinkmperhr();
	
	
}
