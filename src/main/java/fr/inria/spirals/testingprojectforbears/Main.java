package fr.inria.spirals.testingprojectforbears;

public class Main {

	public static int anything(int a, int b) {
		if (a <= 10) {
			return a + b;
		} else {
			return a - b;
		}
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int sum = anything(a, b);
		System.out.println(sum);
		
		a = 10;
		b = 2;
		sum = anything(a, b);
		System.out.println(sum);
	}

}


