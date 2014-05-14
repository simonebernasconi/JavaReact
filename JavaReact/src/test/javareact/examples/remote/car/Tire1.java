package test.javareact.examples.remote.car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableList;

public class Tire1 {

	public static void main(String args[]) {
		Consts.hostName = "Tire1";
		List<Double> startingValue = new ArrayList<Double>();
		startingValue.add(0.0);
		ObservableList obTire1 = new ObservableList("ObTire1", startingValue);
		Queue<Double> queue = new LinkedList<Double>();
		while (true) {
			System.out.println("Value of Tire 1 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			double in = Double.parseDouble(input);
			System.out.println("You sent " + in);
			if (queue.size() < 10){
				queue.add(in);
			}
			else { 
				queue.remove();
				queue.add(in);
			}
			ArrayList<Double> list = new ArrayList<Double>(queue);
			System.out.println(list);
			obTire1.add(list);
		}
	}
}
