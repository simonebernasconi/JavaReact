package test.javareact.examples.remote.car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableListDouble;

public class TireAL {

	public static void main(String args[]) {
		Consts.hostName = "TirePressureAL";
		List<Double> startingValue = new ArrayList<Double>();
		startingValue.add(2.4);
		startingValue.add(2.4);
		ObservableListDouble obTire1 = new ObservableListDouble("ObTirePressureAL", startingValue);
		while (true) {
			System.out.println("Value of Anterior Left Tire Pressure is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			double in = Double.parseDouble(input);
			System.out.println("You sent " + in);
			obTire1.changeLast(in);
		}
	}
}
