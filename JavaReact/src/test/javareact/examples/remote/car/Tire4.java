package test.javareact.examples.remote.car;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;

public class Tire4 {

	public static void main(String args[]) {
		Consts.hostName = "Tire4";
		ObservableInteger obTire4 = new ObservableInteger("ObTire4", 10);
		while (true) {
			System.out.println("Value of Tire 4 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int in = Integer.parseInt(input);
			System.out.println("You sent " + in);
			obTire4.set(in);
		}

	}

}
