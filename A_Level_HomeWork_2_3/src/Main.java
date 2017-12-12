public class Main {
    public static void main(String[] args) {
        int a,b,c,d;
        int result = 0;
        for (int i=1;i<=999999;i++){
            b = i%1000;
            a = (b%10) + ((b/10)%10) +(b/100);
            c = i/1000;
            d = (c%10) + ((c/10)%10) +(c/100);
            if (a==d){
                result++;
                System.out.println(i);            }
        }
        System.out.println(result);
    }
}