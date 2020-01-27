
public class ClockDemo {
	public static void main(String [] args) {
		Clock time = new Clock();
		time.setHour(04);
		time.setMin(59);
		System.out.println("The time is " + time.getHour() +" hours and "+ time.getMin()+ " minutes");
	}

}
