import java.util.Scanner;

public class task6 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    double[] array = new double[l];
    for (int i = 0; i < l; i++) {
        array[i] = scanner.nextDouble();
        // array[i] = Math.random();
    }
    int count = 1;
    for (int i = 0; i < l - 1; i++) {
        if (array[i] > array[i + 1]) {
            count = 0;
            break;
        }
    }
    if (count==1) {
        System.out.println("возрастающая");
    }
    else {
        System.out.println("невозрастающая");
    }
}
}

