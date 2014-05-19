package test.javareact.examples.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableListDouble;

public class ExampleList {

	public static void main(String args[]) {
		Consts.hostName = "Remote1";
		List<Double> startingValue = new ArrayList<Double>();
		startingValue.add(0.0);
		ObservableListDouble obTire1 = new ObservableListDouble("ObList", startingValue);
		//Queue<Double> queue = new LinkedList<Double>();
		while (true) {
			System.out.println("Value of Tire 1 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			double in = Double.parseDouble(input);
			System.out.println("You sent " + in);
//			if (queue.size() < 5){
//				queue.add(in);
//			}
//			else { 
//				queue.remove();
//				queue.add(in);
//			}
			//ArrayList<Double> list = new ArrayList<Double>(queue);
			//System.out.println(list);
			obTire1.add(in);
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
