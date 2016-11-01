import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = 5;
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            int num = (int) Math.floor(m / 2);
            m = num * 3;
            sum += num;
        }
        System.out.print(sum);
    }
}
