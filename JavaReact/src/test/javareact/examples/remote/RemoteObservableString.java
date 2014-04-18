package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableString;

public class RemoteObservableString {

	public static void main(String args[]) {
		Consts.hostName = "Remote";
		ObservableString obString = new ObservableString("obString", "startingValue");
		while (true) {
			System.out.println("Insert String : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println("You sent " + input);
			obString.set(input);
		}

	}

}
