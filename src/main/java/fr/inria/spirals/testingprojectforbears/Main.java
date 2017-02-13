package fr.inria.spirals.testingprojectforbears;

public class Main {

	public static int add(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int sum = add(a, b);
		System.out.println(sum);
	}
}