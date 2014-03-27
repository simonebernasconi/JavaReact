package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableString;

public class RemoteObservableString2 {

	public static void main(String args[]) {
		Consts.hostName = "Remote2";
		ObservableString obString = new ObservableString("obString", "");
		while (true) {
			System.out.println("Insert String2 : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println("You sent " + input);
			obString.set(input);
		}

	}

}
