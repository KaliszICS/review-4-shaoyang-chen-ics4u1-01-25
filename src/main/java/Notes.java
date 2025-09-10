
class Notes {
	public static void main(String[] args) {
		//Converting data types
		//typecasting - converting between compatible types

		int num;
		num = 4;
		//int -> double
		System.out.println((double)num); //cannot alter the original
		System.out.println(num);
		System.out.println(num + 0.0);

		num = 105;
		//int -> char
		System.out.println((char)num); //converts based on ASCII(unicode) values

		//int -> boolean - can't convert to booleans
		// System.out.println((boolean)num);

		double num2 = 4.9;
		//double -> int
		System.out.println((int)num2); //any after the decimal is removed
		//this does not round

		num2 = 65.9;
		//double -> char
		System.out.println((char)num2); //use the whole number for the conversion

		//double -> boolean - doesn't exist

		char c;
		c = 'A';
		//char -> int
		System.out.println((int)c); //outputs ASCII number

		//char -> double
		System.out.println((double)c);

		//char -> boolean - doesn't exist

		int num3 = 5;
		String word5 = num3 + "";
		System.out.println(word5 + 5); //concatenation
		System.out.println(5 + 10 + "Hello" + 5 + 10); //
		//System.out.println(15 + "Hello" + 5 + 10);
		//System.out.println("15Hello" + 5 + 10);
		//System.out.println("15Hello5" + 10);
		//System.out.println("15Hello510");

		//parsing - coverting from a String to a primitive type
		//parsing must be a valid value

		String word = "34534";

		//int
		System.out.println(word + 5); //concatenation
		System.out.println(Integer.parseInt(word) + 5); //addition
		num = Integer.parseInt(word);

		//double
		System.out.println(word + 5); //concatenation
		System.out.println(Double.parseDouble(word) + 5); //addition
		num2 = Double.parseDouble(word);

		word = "TRue"; //is not case sensitive
		//boolean
		System.out.println(Boolean.parseBoolean(word)); //addition
		boolean flag = Boolean.parseBoolean(word); //if the string is "true" you get true
		//other you get false
	}
}
