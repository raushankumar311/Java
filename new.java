import java.util.*;

class Alphabet {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int countUpper = 0, countLower = 0, countSpace = 0, countDigit = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90)
				countUpper++;
			else if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122)
				countLower++;
			else if(str.charAt(i) == ' ')
				countSpace++;
			else
				countDigit++;
		}
		System.out.println("Count of upper character is " + countUpper);
		System.out.println("Count of lower character is " + countLower);
		System.out.println("Count of space is " + countSpace);
		System.out.println("Count of digit  is " + countDigit);
	}

}