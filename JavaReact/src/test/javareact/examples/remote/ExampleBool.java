package test.javareact.examples.remote;

import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.observable.ObservableString;

public class ExampleBool {

	public static void main(String args[]) {
		Consts.hostName = "Remote1";
		ObservableBool obTire1 = new ObservableBool("obInt1", true);
		while (true) {
			System.out.println("Value is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.compareTo("t")==0){
				obTire1.set(true);
			}
			else {obTire1.set(false);}
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
