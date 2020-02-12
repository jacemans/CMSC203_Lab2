import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter diameter of a sphere: ");
		double diam = scan.nextDouble();
		double variable = diam / 2;
		
		System.out.println("Volume is " + (4/3.0 * Math.PI * Math.pow(variable, 3)));
		
		scan.close();
	}
}
