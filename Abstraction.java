package abstraction;

public abstract class Abstraction {
	public void car() {
		System.out.println("varieties of car : ");
		}
	abstract void sound();
	abstract void run();
	Abstraction(){
		System.out.println("this is constructor");	
	}
}
