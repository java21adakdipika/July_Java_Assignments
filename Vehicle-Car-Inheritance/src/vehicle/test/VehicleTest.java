package vehicle.test;

import vehicle.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[] = {
			new Car(120, "BK186", "Blue", 5),
			new Car(156, "OIO143", "Red", 7),
			new Car(90, "RUG-1K1", "Black", 4),
		};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			System.out.println(cars[i].moving());
			System.out.println(cars[i].speedinkmperhr());
			System.out.println("************************************\n");
		}
	}

}
