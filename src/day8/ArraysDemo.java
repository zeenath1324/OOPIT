package day8;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("\nElements in normal order:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\nElements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
