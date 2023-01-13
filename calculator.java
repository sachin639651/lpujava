import java.util.Scanner;

class calculator {

	int x;
	int y;
	int z;
	double result;

	public calculator(int x, int y, int z) {

		this.x = x;
		this.y = y;
		this.z = z;

	}

	public double getresult() {

		switch (z) {
			case 1:
				result = x + y;
				break;
			case 2:
				result = x - y;
				break;
			case 3:
				result = x * y;
				break;
			case 4:
				result = x / y;
				break;
			default:
				result = -1;

		}
		return result;

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter X ");
		int x = myObj.nextInt();

		System.out.println("Enter y ");
		int y = myObj.nextInt();

		System.out.println("Enter 1 for Add 2 for Subtraction 3 for multiplication 4 for division ");
		int z = myObj.nextInt();

		calculator cl = new calculator(x, y, z);

		if (cl.getresult() == -1.0) {
			System.out.println("Some thing went wrong");
		} else {
			System.out.println("Your answer is : " + cl.getresult());
		}

	}

}