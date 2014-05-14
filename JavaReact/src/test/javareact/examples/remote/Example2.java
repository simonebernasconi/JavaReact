package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;

public class Example2 {

	public static void main(String args[]) {
		Consts.hostName = "Remote2";
		ObservableInteger obTire1 = new ObservableInteger("ObInt2", 10);
		while (true) {
			System.out.println("Value of Tire 2 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int in = Integer.parseInt(input);
			System.out.println("You sent " + in);
			obTire1.set(in);
		}
		
		
//		Consts.hostName = "Remote2";
//		ObservableString obTire1 = new ObservableString("obInt2", "");
//		while (true) {
//			System.out.println("Value of Tire 2 is : ");
//			Scanner scanner = new Scanner(System.in);
//			String input = scanner.nextLine();
//			System.out.println("You sent " + input);
//			obTire1.set(input);
//		}
	}
}
