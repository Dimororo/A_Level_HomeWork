import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a;
        int c = 0;
        int index = 0;
        int[][] array = new int[7][4];
        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < 4; k++) {
                array[i][k] = (int) (Math.random() * 10 - 5);
            }
        }
        for (int i = 0; i < 7; i++) {
            String arraystring = Arrays.toString(array[i]);
            System.out.println(arraystring);
        }
        for (int i = 0; i < 7; i++){
            a = array[i][0] *array[i][1]*array[i][2]*array[i][3];
            if (a < 0){
                a *= -1;
            }
            if (a > c){
                c = a;
                index = i;
            }
            
        }
        System.out.println(index);
    }
}
