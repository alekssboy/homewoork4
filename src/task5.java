import java.util.Scanner;

public class task5 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int m = l - 1;
    double[] array = new double[l];
    for (int i = 0; i < l; i++) {
        array[i] = scanner.nextDouble();
        //array[i] = Math.random();
    }
    for (int i = 0; i < array.length; i++) {
        if (i < m) {
            double temp = array[i];
            array[i] = array[m];
            array[m] = temp;
            m = m - 1;
        } else {
            break;
        }
    }
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}
}

