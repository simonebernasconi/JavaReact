package test.javareact.examples.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableList;

public class ExampleList {

	public static void main(String args[]) {
		Consts.hostName = "Remote1";
		List<Double> startingValue = new ArrayList();
		startingValue.add(0.0);
		ObservableList obList = new ObservableList("obList", startingValue);
		List<Double> list = new ArrayList();
		while (true) {
			System.out.println("Add Value : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			double in = Double.parseDouble(input);
			System.out.println("You add " + in);
			list.add(in);
			System.out.println("List contains "+ list);
			obList.set(list);
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
