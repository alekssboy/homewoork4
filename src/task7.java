import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = scanner.nextInt();
        }
        String[] arrayString = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        String string = String.join("", arrayString);
        // System.out.println(string);
        int num = Integer.parseInt(string);
        int numCorr = num+1;
        String stringCorr = Integer.toString(numCorr);
        char[] charArray = stringCorr.toCharArray();
        System.out.println(charArray);

    }
}



