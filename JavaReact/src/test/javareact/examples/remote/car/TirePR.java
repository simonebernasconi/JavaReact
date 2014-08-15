package test.javareact.examples.remote.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableInteger;
import test.javareact.common.types.observable.ObservableListDouble;

public class TirePR {

	public static void main(String args[]) {
		Consts.hostName = "TirePressurePR";
		List<Double> startingValue = new ArrayList<Double>();
		startingValue.add(2.1);
		startingValue.add(2.1);
		ObservableListDouble obTire1 = new ObservableListDouble("ObTirePressurePR", startingValue);
		while (true) {
			System.out.println("Value of Posterior Right Tire Pressure is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			double in = Double.parseDouble(input);
			System.out.println("You sent " + in);
			obTire1.changeLast(in);
		}
	}
}