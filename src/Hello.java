
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello "+System.getProperty("user.name"));
		System.out.println("This is an edit for Question 9!");
		int x = 27;
		int y = 32;
		System.out.println("These are two variables:\nx = "+x+"\ny = "+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The variables' values have been swapped using math:\nx = "+x+"\ny = "+y);
		System.out.print("This is my edit. Antoinette");
	}

}
