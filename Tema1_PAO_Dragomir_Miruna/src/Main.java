import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
    }

    public static void Ex1() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduceti numarul de elemente: ");
            n = scanner.nextInt();
        } while (n < 0 || n > 5);

        int[] v = new int[n];
        System.out.println("Introduceti " + n + " elemente:");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        reverseArray(v);
    }

    public static void reverseArray(int[] v) {
        int left = 0, right = v.length - 1;
        while (left < right) {
            int temp = v[left];
            v[left] = v[right];
            v[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed v: ");
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void Ex2() {
        int[] v1 = {1, 7, 4, 3, 9, 1};
        int[] v2 = {6, 4, 2, 8};

        System.out.print("v1 initial: ");
        printArray(v1);
        System.out.print("v2 initial: ");
        printArray(v2);

        bubbleSort(v1);
        bubbleSort(v2);

        System.out.print("v1 sortat: ");
        printArray(v1);
        System.out.print("v2 sortat: ");
        printArray(v2);

        int[] mergedv = mergeSortedArrays(v1, v2);
        System.out.print("Merged sorted v: ");
        printArray(mergedv);
    }

    public static void bubbleSort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static int[] mergeSortedArrays(int[] v1, int[] v2) {
        int[] merged = new int[v1.length + v2.length];
        int i = 0, j = 0, k = 0;

        while (i < v1.length && j < v2.length) {
            if (v1[i] < v2[j]) {
                merged[k++] = v1[i++];
            } else {
                merged[k++] = v2[j++];
            }
        }

        while (i < v1.length) {
            merged[k++] = v1[i++];
        }
        while (j < v2.length) {
            merged[k++] = v2[j++];
        }

        return merged;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
