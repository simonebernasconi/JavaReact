package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.observable.ObservableInteger;

public class ProvaTire4 {

	public static void main(String args[]) {
		Consts.hostName = "Tire4";
		ObservableBool obTire4 = new ObservableBool("obTire4", false);
		while (true) {
			boolean bool=false;
			System.out.println("Tire4...Insert t for true or f for false: ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.compareTo("t")==0){
				bool = true;
			}
			else if (input.compareTo("f")==0){
				bool = false;	
			} 
			else{}
			System.out.println("You sent " + bool);
			obTire4.set(bool);
		}

	}

}