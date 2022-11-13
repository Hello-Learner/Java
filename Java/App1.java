public class App1 {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Car1 car = new Car1();
		
		Vehicle vehicle2 = car;
		
		vehicle2.design();
		car.ride();
		//vehicle2.ride();
		
		createDesign(car);		
	}
	
	public static void createDesign(Vehicle vehicle) {
		
		vehicle.design();
	}
	
}