package test.javareact.examples.remote;

import java.util.Random;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;
import test.javareact.common.types.observable.ObservableString;

public class RemoteObservable {

	public static void main(String args[]) {
		Consts.hostName = "Remote";
		ObservableString obString = new ObservableString("obString", true, "a");
		while (true) {
			System.out.println("Insert String: ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println("You sent " + input);
			obString.set(input);
		}

	}

}
