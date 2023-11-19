public class Main {

	public static void main(String[] args) {
		Shapes[] shapes = {new Circle(), new Square(), new Tri(new Triangle())};
		
		for(Shapes shape : shapes) {
			shape.draw();
		}
	}

}

abstract class Shapes {
	public void draw() {
		System.out.println("I am drawing");
	}
}

class Circle extends Shapes {
	public void draw() {
		System.out.println("I am a circle");
	}
}
class Square extends Shapes {
	public void draw() {
		System.out.println("I am a square");
	}
}
//My AdapterClass 

class Tri extends Shapes {
	private Triangle triangle;
	public Tri(Triangle triangle) {
		this.triangle = triangle;
	}
	public void draw() {
		triangle.display();
	}
}

class Triangle { // Class coming from China.
	void display() {
		System.out.println("I am displaying a triangle");
	}
}