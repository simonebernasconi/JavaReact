package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;

public class Tire2 {

	public static void main(String args[]) {
		Consts.hostName = "Tire2";
		ObservableInteger obTire2 = new ObservableInteger("obTire2", 10);
		while (true) {
			System.out.println("Value of Tire 2 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int in = Integer.parseInt(input);
			System.out.println("You sent " + in);
			obTire2.set(in);
		}

	}

}
