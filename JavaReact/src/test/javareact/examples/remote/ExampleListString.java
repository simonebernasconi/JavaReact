package test.javareact.examples.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableListInteger;

public class ExampleListString {

	public static void main(String args[]) {
		Consts.hostName = "Remote1";
		List<String> startingValue = new ArrayList();
		startingValue.add("vuoto");
		ObservableListInteger obList = new ObservableListInteger("obList", startingValue);
		List<String> list = new ArrayList();
		while (true) {
			System.out.println("Add Value : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println("You add " + input);
			list.add(input);
			System.out.println("List contains "+ list);
			obList.add(list);
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
