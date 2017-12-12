import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write your number");
        int user_input = scanner.nextInt();
        int result = user_input/10 + user_input%10;
        System.out.println(result);
    }
}
