import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] array = new int[8][5];
        for (int i=0;i<8;i++){
            for (int k=0;k<5;k++){
                array[i][k] = 10+ (int) (Math.random()*89);
            }
        }
        for (int i=0;i<8;i++){
        String arraystring = Arrays.toString(array[i]);
        System.out.println(arraystring);
        }
    }
}
