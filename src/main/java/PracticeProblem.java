import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		System.out.print("Input an integer: ");
        Scanner sc = new Scanner(System.in);
        String newInt = sc.nextLine();
        newInt = "5" + newInt;
        int tempInt = Integer.parseInt(newInt);
        tempInt = tempInt + 5;
        System.out.println(tempInt);
	}

	public static void q2() {
		//Write question 2 code here
		System.out.print("Input an number: ");
        Scanner sc = new Scanner(System.in);
        String newNum = sc.nextLine();
        newNum = "4" + newNum + "3";
        double newNumDouble = Double.parseDouble(newNum);
        newNumDouble += 3.4;
        System.out.println(newNumDouble);
	}

	public static void q3() {
		//Write question 3 code here
		System.out.print("Input an boolean: ");
        Scanner sc = new Scanner(System.in);
        String newBoolean = sc.nextLine();
        boolean bool = Boolean.parseBoolean(newBoolean);
        System.out.println(!bool);
	}

	public static void q4() {
		//Write question 4 code here
		System.out.print("Input an integer: ");
        Scanner sc = new Scanner(System.in);
        String newInt = sc.nextLine();
        newInt = newInt + "3";
        int temp = Integer.parseInt(newInt);
        temp += 2;
        char tempChar = (char)temp;
        System.out.println(tempChar);
	}

	public static void q5() {
		//Write question 5 code here
		System.out.print("Input an integer: ");
        Scanner sc = new Scanner(System.in);
        String newInt = sc.nextLine();
        newInt = newInt + "1";
        int temp = Integer.parseInt(newInt);
        temp = temp/2;
        String temp2 = Integer.toString(temp);
        double temp3 = Double.parseDouble(temp2);
        System.out.println(temp3);
	}

	public static void q6() {
		//Write question 6 code here
		System.out.print("Input an number: ");
        Scanner sc = new Scanner(System.in);
        String newInt = sc.nextLine();
        newInt = "1" + newInt;
        Double newDouble = Double.parseDouble(newInt);
        int output = newDouble.intValue();
        System.out.println(output);

	}

}
