package edu.xula.borticke;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Hello, XULA Parking Lot App\n");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(22) + 1;
            numbers.add(num);
        }

        System.out.println("Numbers: " + numbers);

        System.out.println( lessThan(  numbers, 5) + " less than 5 \n");

        System.out.println(notInRange(1,22,numbers) + " numbers are not in range \n");

        System.out.println(even(numbers) + " even numbers\n");

        System.out.println(smallestElement(numbers) + " is the smallest number\n");

        System.out.println(indexOfLargestElement(numbers) + " is the index with the largest element\n");

        boolean containts = numbers.contains(20);
        System.out.println(containts);

       // System.out.println("New Arraylist " + remove(numbers));

        System.out.println( swap(numbers));






    }

    private static ArrayList swap(ArrayList<Integer> numbers) {
        ArrayList<Integer> swapedValues = new ArrayList<>();
        for (int i = 0; i <numbers.size(); i++) {
            swapedValues.add(numbers.get(i));
        }
        int largestvalue = swapedValues.get(indexOfLargestElement(numbers));
        swapedValues.remove(9);
        swapedValues.add(9,largestvalue);
        swapedValues.remove(indexOfLargestElement(numbers));
        swapedValues.add(indexOfLargestElement(numbers),numbers.get(9));
        return swapedValues;
    }

    private static ArrayList remove(ArrayList<Integer> numbers) {
        ArrayList <Integer> smallerArrayList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            smallerArrayList.add(numbers.get(i));
        }
        smallerArrayList.remove(0);
        smallerArrayList.remove(4);
        smallerArrayList.remove(9);
        return smallerArrayList;
    }

    private static int indexOfLargestElement(ArrayList<Integer> numbers) {
        int indexOfLargestNum = -1;
        int largestNum = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largestNum){
                indexOfLargestNum = i;
            }

        }
        return indexOfLargestNum;
    }

    private static int smallestElement(ArrayList<Integer> numbers) {
        int smallestNum = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallestNum){
                smallestNum = numbers.get(i);
            }
        }
        return smallestNum;
    }

    private static int even(ArrayList<Integer> numbers) {
       int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) %2 == 0 ){
                counter ++;
            }
        }
        return counter;
    }

    private static int notInRange(int min, int max, ArrayList<Integer> numbers) {
       int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (!(numbers.get(i)>= min && numbers.get(i)<=max)){
                counter++;
            }
        }
        return counter;
    }

    private static int lessThan(ArrayList<Integer> numbers, int num) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 5) {
                counter++;
            }

        }
        return counter;
    }

}
