package PracticeProject8;

public class OOPDemo {

	
		  public static void main(String[] args) {
		    // Create objects of different classes
		    Animal animal = new Animal("Generic Animal");
		    Dog dog = new Dog("Bruno");
		    Cat cat = new Cat("Kitty");
		    
		    // Call methods on objects
		    animal.eat();
		    animal.sleep();
		    
		    dog.eat();
		    dog.sleep();
		    dog.bark();
		    
		    cat.eat();
		    cat.sleep();
		    cat.meow();
		    
		    // Use inheritance
		    animal = new Dog("Max");
		    animal.eat();
		    animal.sleep();
		    
		    // Use encapsulation
		    Employee employee = new Employee("John", "Doe");
		    System.out.println("Full name: " + employee.getFullName());
		    
		    // Use abstraction
		    Shape shape = new Circle(5);
		    System.out.println("Area of circle: " + shape.getArea());
		    
		    shape = new Rectangle(4, 6);
		    System.out.println("Area of rectangle: " + shape.getArea());
		    
		    // Use polymorphism
		    Animal[] animals = {new Dog("Charlie"), new Cat("Fluffy")};
		    
		    for (Animal a : animals) {
		      a.eat();
		      a.sleep();
		      
		      if (a instanceof Dog) {
		        ((Dog) a).bark();
		      } else if (a instanceof Cat) {
		        ((Cat) a).meow();
		      }
		    }
		  }
		}

		// Class Animal
		class Animal {
		  protected String name;
		  
		  public Animal(String name) {
		    this.name = name;
		  }
		  
		  public void eat() {
		    System.out.println(name + " is eating.");
		  }
		  
		  public void sleep() {
		    System.out.println(name + " is sleeping.");
		  }
		}

		// Class Dog
		class Dog extends Animal {
		  public Dog(String name) {
		    super(name);
		  }
		  
		  public void bark() {
		    System.out.println(name + " is barking.");
		  }
		}

		// Class Cat
		class Cat extends Animal {
		  public Cat(String name) {
		    super(name);
		  }
		  
		  public void meow() {
		    System.out.println(name + " is meowing.");
		  }
		}

		// Class Employee
		class Employee {
		  private String firstName;
		  private String lastName;
		  
		  public Employee(String firstName, String lastName) {
		    this.firstName = firstName;
		    this.lastName = lastName;
		  }
		  
		  public String getFullName() {
		    return firstName + " " + lastName;
		  }
		}

		// Interface Shape
		interface Shape {
		  double getArea();
		}

		// Class Circle
		class Circle implements Shape {
		  private double radius;
		  
		  public Circle(double radius) {
		    this.radius = radius;
		  }
		  
		  public double getArea() {
		    return Math.PI * radius * radius;
		  }
		}

		// Class Rectangle
		class Rectangle implements Shape {
		  private double width;
		  private double height;
		  
		  public Rectangle(double width, double height) {
		    this.width = width;
		    this.height = height;
		  }
		  
		  public double getArea() {
		    return width * height;
		  }
		

	
}
