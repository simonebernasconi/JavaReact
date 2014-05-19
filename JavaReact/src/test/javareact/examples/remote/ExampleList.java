package test.javareact.examples.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableListInteger;

public class ExampleList {

	public static void main(String args[]) {
		Consts.hostName = "Remote1";
		List<Integer> startingValue = new ArrayList<Integer>();
		startingValue.add(0);
		ObservableListInteger obTire1 = new ObservableListInteger("ObList", startingValue);
		//Queue<Double> queue = new LinkedList<Double>();
		while (true) {
			System.out.println("Value of Tire 1 is : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int in = Integer.parseInt(input);
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
