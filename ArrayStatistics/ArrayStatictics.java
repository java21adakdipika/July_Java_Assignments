package assignments;
public class ArrayStatictics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[args.length];
		for (int i=0;i<args.length;i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		
		System.out.print("Array [");
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println("]");
		
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum: " + sum);
		
		double average = sum / numbers.length;
		System.out.println("Average: " + average);
		
		int min = numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("Minimum: " + min);
		
		int max = numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("Maximum: " + max);
		
		int count = numbers.length;
		int median = 0;
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length-1; j++) {
				if (numbers[i]<numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		
		System.out.print("\nSorted Array [");
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println("]");
		
		if (count % 2 == 0) {  // 5
			median = (numbers[(count/2)-1] + numbers[count/2]) / 2;
		}
		else {
			median = numbers[count/2];
		}
		System.out.println("Median: " + median);
		
		System.out.println("\nFrequency: ");
		int num = numbers[0];    // sorted array
		int freq = 1;
		for (int i=1; i<numbers.length; i++) {
			if (num == numbers[i]) {
				freq++;
			} else {
				System.out.print(numbers[i-1] + ": " + freq + "\n");
				num = numbers[i]; // setting num to new number
				freq = 1;         // setting freq = 1 for new number
			}
		}
	}

}
