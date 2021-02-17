import java.util.Arrays;
import java.util.ArrayList;
public class LongestIncreasingSub {

    private int n;
    private int[] arr;

    public LongestIncreasingSub(int n) {
        this.n = n; //this is correct
    }

    public int[] randomArrayInt() {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = (int)(Math.random()*100 + 1);
        }
        return this.arr;
    }

    public void longest() {
        System.out.println("The random array is: " + Arrays.toString(arr));
        ArrayList list = new ArrayList();
        ArrayList longestList = new ArrayList();
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    list.add(arr[j]);
                    max = arr[j];
                }
            }

            if (count < list.size()) {
                count = list.size();
                longestList = new ArrayList(list);
            }
            list.clear();
        }

        System.out.println("The longest increasing subsequence is: ");
        System.out.print(longestList + "\n");
        System.out.println("The Length of the longest increasing subsequence is : " + count);
    }


}


