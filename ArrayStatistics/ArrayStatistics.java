import java.util.Arrays;

public class ArrayStatistics {

 public static void main(String[] args) {

  System.out.println("Array Elements : ");
  for (int i = 0; i < args.length; i++) {
    System.out.println(args[i]);
  }

  sumofArrayElements(args);
  averageOfArrayElements(args);
  minArrayElements(args);
  maxArrayElements(args);
  meanofArrayElements(args);
  medianOfArrayElements(args);

 }

 private static void medianOfArrayElements(String[] args) {
  Arrays.sort(args);
  int number = args.length;
  double sum = 0;
  double median = 0;
  if (number % 2 != 0) {
   sum = Integer.parseInt(args[number / 2]);
  }
  median = Integer.parseInt(args[number - 1]/2) + Integer.parseInt(args[number / 2]) / 2.0;
  System.out.println("Medain of Array Elements : " + median);

 }

 private static void meanofArrayElements(String[] args) {
  // TODO Auto-generated method stub
  int sum = 0;
  double mean = 0;
  for (int i = 0; i < args.length; i++) {
   sum += Integer.parseInt(args[i]);
  }
  mean = sum / args.length;
  System.out.println("Mean of Array Elements :" + mean);

 }

 private static void maxArrayElements(String[] args) {
  // TODO Auto-generated method stub
  int max = Integer.parseInt(args[0]);
  for (int i = 0; i < args.length; i++) {
   if (Integer.parseInt(args[i]) > max) {
    max = Integer.parseInt(args[i]);
   }
  }
  System.out.println("Maximum Elements in Array Elements " + max);
 }

 private static void minArrayElements(String[] args) {
  // TODO Auto-generated method stub
  int min = Integer.parseInt(args[0]);
  for (int i = 0; i < args.length; i++) {
   if (Integer.parseInt(args[i]) < min) {
    min = Integer.parseInt(args[i]);
   }
  }
  System.out.println("Minimum Element in Array Elements :" + min);

 }

 private static void averageOfArrayElements(String[] args) {
  int sum = 0;
  double avg = 0;
  int length = args.length;
  for (int i = 0; i < args.length; i++) {
   sum += Integer.parseInt(args[i]);
  }
  avg = sum / length;
  System.out.println("Average of Array Elements : " + avg);
 }

 private static void sumofArrayElements(String[] args) {
  int sum = 0;
  for (int i = 0; i < args.length; i++) {
   sum += Integer.parseInt(args[i]);
  }
  System.out.println("Sum of Array Elements : " + sum);
 }

}