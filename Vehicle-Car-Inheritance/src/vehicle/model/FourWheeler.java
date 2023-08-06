package vehicle.model;

public abstract class FourWheeler extends Vehicle{
	
	protected int noOfTyres;
	protected int seats;
	

	public FourWheeler(int speed, String model, String color, int seats) {
		super(speed, model, color);
		this.noOfTyres = 4;
		this.seats = seats;
	}


	public int getNoOfTyres() {
		return noOfTyres;
	}


	public void setNoOfTyres(int noOfTyres) {
		this.noOfTyres = noOfTyres;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


//	@Override
//	public String moving() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public int speedinkmperhr() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
}
