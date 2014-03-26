package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;

public class Tire3 {

	public static void main(String args[]) {
		Consts.hostName = "Tire3";
		ObservableInteger obTire3 = new ObservableInteger("obTire3", 10);
		while (true) {
			System.out.println("Value of Tire 3 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int in = Integer.parseInt(input);
			System.out.println("You sent " + in);
			obTire3.set(in);
		}

	}

}
