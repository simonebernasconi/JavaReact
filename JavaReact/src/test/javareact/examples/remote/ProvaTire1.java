package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableBool;

public class ProvaTire1 {

	public static void main(String args[]) {
		Consts.hostName = "Tire1";
		ObservableBool obTire1 = new ObservableBool("obTire1", true);
		while (true) {
			boolean bool=false;
			System.out.println("Tire1...Insert t for true or f for false: ");
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
			obTire1.set(bool);
		}

	}

}
