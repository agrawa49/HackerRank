import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int temp;
        for (int i = 0; i < d; i++) {
            temp = a[0];
            for (int j = 0; j < n - 1; j++)
                a[j] = a[j + 1];
            a[n - 1] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
