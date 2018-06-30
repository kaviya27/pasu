package Inheritance;

public class Animal {
	public void eat() {
		System.out.println("Eat Fruits");
	}
	public void sleep() {
		System.out.println("Sleep in Forest");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("Eating Vadaa");
	}
	public void sleep() {
		System.out.println("Sleep in home");
	}
	public void fly() {
		System.out.println("Happily Fly");
	}
}
class Inherit{
	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}