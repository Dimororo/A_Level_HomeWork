import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number");
        int unumb = scanner.nextInt();
        int cnumb1 = (int) (Math.random()*10);
        int cnumb2 = (int) (Math.random()*10);
        int cnumb3 = (int) (Math.random()*10);
        System.out.println(cnumb1);
        System.out.println(cnumb2);
        System.out.println(cnumb3);
        if (cnumb1==unumb||cnumb2==unumb||cnumb3==unumb)
        {
            System.out.println("You guess! Congratulations ^^");
        }
        else
        {
            System.out.println("You wrong, sorry.");
        }

    }
}
