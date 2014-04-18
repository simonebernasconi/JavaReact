package test.javareact.examples.remote;

import java.util.Random;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;

public class Tire1 {

	public static void main(String args[]) {
		Consts.hostName = "Tire1";
		ObservableInteger obTire1 = new ObservableInteger("obTire1", 10);
		while (true) {
			System.out.println("Value of Tire 1 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int in = Integer.parseInt(input);
			System.out.println("You sent " + in);
			obTire1.set(in);
		}
		
//		Random random = new Random();
//
//		while (true) {
//			obTire1.set(random.nextInt(1000));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
