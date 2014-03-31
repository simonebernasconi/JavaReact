package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.observable.ObservableInteger;

public class ProvaTire3 {

	public static void main(String args[]) {
		Consts.hostName = "Tire3";
		ObservableBool obTire3 = new ObservableBool("obTire3", false);
		while (true) {
			boolean bool=false;
			System.out.println("Tire3...Insert t for true or f for false: ");
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
			obTire3.set(bool);
		}

	}

}
