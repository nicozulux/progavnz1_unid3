package borbuja;
import java.util.Arrays;
import java.util.Scanner;

public class borbuja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese el número %d: ", i + 1);
            nums[i] = input.nextInt();
        }

        System.out.printf("Arreglo original: %s\n", Arrays.toString(nums));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                System.out.printf("Paso %d: %s\n", i * (n - 1) + j + 1, Arrays.toString(nums));
            }
        }

        System.out.printf("Arreglo ordenado: %s\n", Arrays.toString(nums));
    }
}
