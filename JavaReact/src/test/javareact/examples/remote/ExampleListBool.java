package test.javareact.examples.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableListBool;
import test.javareact.common.types.observable.ObservableListInteger;

public class ExampleListBool {

	public static void main(String args[]) {
		Consts.hostName = "Remote1";
		List<Boolean> startingValue = new ArrayList<Boolean>();
		//startingValue.add(false);
		ObservableListBool obList = new ObservableListBool("ObList", startingValue);
//		List<Boolean> list = new ArrayList<Boolean>();
		
		while (true) {
			System.out.println("Add Value : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.compareTo("t")==0){
				obList.add(true);
			}
			else {obList.add(false);}
		}
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
//	}
}
