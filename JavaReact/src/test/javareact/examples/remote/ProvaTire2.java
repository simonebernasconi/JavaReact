package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.observable.ObservableInteger;

public class ProvaTire2 {

	public static void main(String args[]) {
		Consts.hostName = "Tire2";
		ObservableBool obTire2 = new ObservableBool("obTire2", false);
		while (true) {
			boolean bool=false;
			System.out.println("Tire2...Insert t for true or f for false: ");
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
			obTire2.set(bool);
		}

	}

}