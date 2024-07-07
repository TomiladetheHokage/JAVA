import java.util.Scanner;
public class checkWordsIsPalindrome{

public static void main(String [] args){



String word = input("enter anything to check if palindrome: ");


String result = isPalindrome(word);

System.out.print(result);

}

public static String isPalindrome(String word){

String reverse = "";

for (int i = word.length() - 1; i >= 0; i --){

reverse += word.charAt(i);

}

if (reverse.equals(word)){

return "is palindrome";

}

else {
return "Not a palindrome";
}
}

public static void print(String userInput){
System.out.print(userInput);
}

public static String input(String prompt){
Scanner sc = new Scanner(System.in);

print(prompt);

return sc.nextLine();
}

}