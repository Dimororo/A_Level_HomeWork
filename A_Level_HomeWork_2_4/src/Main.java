public class Main {
    public static void main(String[] args) {
        int min = 0;
        int hour = 0;
        int am,bm,ah,bh;
        int result = 0;
        while (min<60&&hour<24){
                am = min/10;
                bm = min%10;
                ah = hour/10;
                bh = hour%10;
                if (am==bh&&bm==ah){
                    result++;
                }
                ++min;
                if (min==60){
                    min = 0;
                    hour++;
                }


        }
        System.out.println(result);
    }
}
