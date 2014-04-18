package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableDouble;

public class Example2 {

	public static void main(String args[]) {
		Consts.hostName = "Remote2";
		ObservableDouble obTire2 = new ObservableDouble("obInt2", 10);
		while (true) {
			System.out.println("Value of Tire 2 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			double in = Double.parseDouble(input);
			System.out.println("You sent " + in);
			obTire2.set(in);
		}
		
//		Random random = new Random();
//
//		while (true) {
//			obTire1.set(random.nextInt(1000));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
