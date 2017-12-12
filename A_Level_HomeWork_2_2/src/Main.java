public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c;
        for (int i=0;i<11;i++){
            System.out.println(a);
            c = a + b;
            b = a;
            a = c;
        }
    }
}
