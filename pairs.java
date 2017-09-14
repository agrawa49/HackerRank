import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 0, i = 0;
        s.nextLine();
        String str = s.nextLine();
        String temp[] = str.split(" ");
        int nums[] = new int[temp.length];
        for (String t:temp)
            nums[i++] = Integer.parseInt(t);
        Arrays.sort(nums);
        for (i = 0; i < n; ++i) {
            int f = Arrays.binarySearch(nums, k + nums[i]);
            if (f >= 0)
                count++;
        }
        System.out.print(count);
    }
}
