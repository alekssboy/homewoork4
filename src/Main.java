import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int l = scanner.nextInt();
            double[] array = new double[l];
            for (int i = 0; i < l; i++) {
                array[i] = scanner.nextDouble();
                //array[i] = Math.rando3m();
            }
            for (int i = 0; i < l; i++) {
                System.out.println(array[i]);
            }
            for (int i = l - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
            int indexMax = 0;
            double max = array[indexMax];
            for (int i = 1; i < l; i++) {
                if (max < array[i]) {
                    max = array[i];
                    indexMax = i;
                }
            }
            System.out.println(max);
            System.out.println(indexMax);
            int indexMin = 0;
            double min = array[indexMin];
            for (int i = 1; i < l; i++) {
                if (array[i] < min) {
                    min = array[i];
                    indexMin = i;
                }
            }
            System.out.println(min);
            System.out.println(indexMin);
            int count = 0;
            for (int i = 0; i < l; i++) {
                if (array[i] == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println("Нулевых знчений нет");
            } else {
                System.out.println(count);
            }
        }
    }

