package arrays;

import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {

        int a[] = {10, 24, 34, 56, 78, 65};

        System.out.println(Arrays.toString(remove(a, 2)));

    }

    public static int[] remove(int[] a, int index) {
        if (index >= 0 && index < a.length) {
            int ans[] = new int[a.length - 1];
            for (int i = 0, j = 0; i < a.length; i++) {
                if (i != index) {
                    ans[j] = a[i];
                    j++;
                }
            }
            return ans;
        } else {
            System.out.println("Invalid index!");
            return a;
        }
    }

    public static int[] remove(int value, int[] a) {
        int i;

        for (i = 0; i < a.length; i++) {
            if (a[i] == value) {
                break;
            }
        }
        if (i != a.length) {
            return remove(a, i);
        } else {
            System.out.println("Value not found!");
            return null;
        }

    }
}