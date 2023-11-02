package q1;

import java.util.Comparator;

class comparatorforsort implements Comparator<Double>
{
	public int compare(Double a, Double b) {
		int diff=a.compareTo(b);
		return diff; 
	};
}

public class sorting {

	
	
	static <Double> void selectionSort(Double[] arr, Comparator<Double> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					Double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	
	
	
	
	
	public static void main(String[] args) {
		Double[] arr = new Double[] { 10.1, 33.1, 22.1, 44.1,1.33 };
		selectionSort(arr,new comparatorforsort() );
		for(Double ele:arr)
		{
			System.out.println(ele);
		}

	}

}
