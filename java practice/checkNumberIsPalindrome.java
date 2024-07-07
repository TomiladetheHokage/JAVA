public class checkNumberIsPalindrome{

public static void main(String[] args){

int palindrome = 11111;

boolean result = pal(palindrome);

print(Boolean.toString(result));

}


public static boolean pal(int number){

int reverse = 0;
int originalNumber = number;

while(number != 0){

int remainder = number % 10;

reverse = reverse * 10 + remainder;

number = number / 10;
}
return originalNumber == reverse;

}

public static void print(String prompt){
System.out.print(prompt);
}
}