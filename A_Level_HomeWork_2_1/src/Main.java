import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Long user_input = scanner.nextLong();
        int result = 0;
        while (user_input>0)
        {
            result += user_input % 10;
            user_input /= 10;
        }
        System.out.println(result);
    }
}
