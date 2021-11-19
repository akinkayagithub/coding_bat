package coding_bat;

import java.util.Arrays;

public class Array3 {
    // 1
    public int maxSpan(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while (nums[i] != nums[j]) j--;
            int span = j - i + 1;
            if (span > max) max = span;
        }
        return max;
    }

    // 2
    public int[] fix34(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 3 && nums[i+1] != 4){
                for(int j = 1; j < nums.length; j++){
                    if(nums[j-1] != 3 && nums[j] == 4){
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    // 3
    public int[] fix45(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4 && nums[i+1] != 5){
                for(int j = 0; j < nums.length; j++){
                    if((j == 0 && nums[j] == 5) || (j != 0 && nums[j-1] != 4 && nums[j] == 5)){
                        int temp = nums[i+1];
                        nums[i+1] = 5;
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    // 4
    public boolean canBalance(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int leftSum = 0;
            int rigthSum = 0;
            for(int j = 0; j < i; j++){
                leftSum += nums[j];
            }
            for(int k = i; k < nums.length; k++){
                rigthSum += nums[k];
            }
            if(leftSum == rigthSum) return true;
        }
        return false;
    }

    // 5
    public boolean linearIn(int[] outer, int[] inner) {
        for (int j : inner) {
            if (Arrays.binarySearch(outer, j) < 0) return false;
        }
        return true;
    }

    // 6
    public int[] squareUp(int n) {
        int[] numbers = new int[n*n];
        if(n == 0) return numbers;

        for(int i = n - 1; i < numbers.length; i += n) {
            for(int j = i; j >= i - i / n; j--){
                numbers[j] = i - j + 1;
            }
        }
        return numbers;
    }

    // 7
    public int[] seriesUp(int n) {
        int[] numbers = new int[n*(n + 1)/2];
        int index = 0;

        for(int j = 0; j < n; j++){
            for(int k = 1; k < j+2; k++){
                numbers[index] = k;
                index++;
            }
        }
        return numbers;
    }

    // 8
    public int maxMirror(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if(nums[i + count] == nums[j]) {
                    count++;
                }
                else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    // 9
    public int countClumps(int[] nums) {
        int count = 0;
        boolean found = false;
        int foundNumber = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != foundNumber) found = false;
            if(nums[i] == nums[i+1] && !found){
                foundNumber = nums[i];
                found = true;
                count++;
            }
        }
        return count;
    }
}
