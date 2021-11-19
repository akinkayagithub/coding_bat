package coding_bat;

import java.util.Arrays;

public class Array2 {
    //1
    public int countEvens(int[] nums) {
        int evens = 0;

        for(int i: nums){
            if(i % 2 == 0) evens++;
        }
        return evens;
    }

    //2
    public int bigDiff(int[] nums) {
        int smallest = nums[0], greatest = nums[0];

        for(int i = 1; i < nums.length; i++){
            smallest = Math.min(smallest, nums[i]);
            greatest = Math.max(greatest, nums[i]);
        }
        return greatest - smallest;
    }

    //3
    public int centeredAverage(int[] nums) {
        int smallest = nums[0], greatest = nums[0], sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            smallest = Math.min(smallest, nums[i]);
            greatest = Math.max(greatest, nums[i]);
            sum += nums[i];
        }
        return (sum - smallest - greatest) / (nums.length-2);
    }

    //4
    public int sum13(int[] nums) {
        if(nums.length == 0) return 0;
        else{
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 13) i++;
                else sum += nums[i];
            }
            return sum;
        }
    }

    //5
    public int sum67(int[] nums) {
        int sum = 0;
        boolean six = false;

        if(nums.length > 0){
            for (int num : nums) {
                if (num == 6) six = true;
                if (num == 7 && six) {
                    six = false;
                    sum -= 7;
                }
                if (six) continue;
                sum += num;
            }
        }
        return sum;
    }

    //6
    public boolean has22(int[] nums) {
        if(nums.length >= 2){
            for(int i = 0; i < nums.length-1; i++){
                if(nums[i] == 2 && nums[i+1] == 2) return true;
            }
        }
        return false;
    }

    //7
    public boolean lucky13(int[] nums) {
        Arrays.sort(nums);
        return Arrays.binarySearch(nums, 1) < 0 && Arrays.binarySearch(nums, 3) < 0;
    }

    //8
    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i: nums){
            if(i == 2) sum += 2;
        }
        return sum == 8;
    }

    //9
    public boolean more14(int[] nums) {
        int ones = 0, fours = 0;
        for(int i: nums){
            if(i == 1) ones += 1;
            else if(i == 4) fours += 1;
        }
        return ones > fours;
    }

    //10
    public int[] fizzArray(int n) {
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
        }
        return nums;
    }

    //11
    public boolean only14(int[] nums) {
        boolean check = true;
        for(int i: nums){
            if(i != 1 && i != 4){
                check = false;
                break;
            }
        }
        return check;
    }

    //12
    public String[] fizzArray2(int n) {
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = "" + i;
        }
        return s;
    }

    //13
    public boolean no14(int[] nums) {
        Arrays.sort(nums);
        return Arrays.binarySearch(nums, 1) < 0 || Arrays.binarySearch(nums, 4) < 0;
    }

    //14
    public boolean isEverywhere(int[] nums, int val) {
        boolean check = true;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != val && nums[i+1] != val){
                check = false;
                break;
            }
        }
        return check;
    }

    //15
    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 2) two = true;
            else if(nums[i] == 4 && nums[i+1] == 4) four = true;
        }
        return two != four;
    }

    //16
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) count++;
        }
        return count;
    }

    //17
    public boolean has77(int[] nums) {
        boolean check = false;
        if(nums.length >= 2){
            for(int i = 0; i < nums.length-2; i++){
                if(nums[i] == 7 && (nums[i+1] == 7 || nums[i+2] == 7)) check = true;
            }
            if(nums[nums.length-1] == 7 && nums[nums.length-2] == 7) check = true;
        }
        return check;
    }

    //18
    public boolean has12(int[] nums) {
        boolean one = false;
        boolean two = false;

        for (int num : nums) {
            if (num == 1) one = true;
            if (one && num == 2) two = true;
        }
        return one && two;
    }

    //19
    public boolean modThree(int[] nums) {
        boolean check = false;
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2) check = true;
        }
        return check;
    }

    //20
    public boolean haveThree(int[] nums) {
        boolean check = true;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3) count++;
            if(i < nums.length - 1){
                if(nums[i] == 3 && nums[i+1] == 3){
                    check = false;
                    break;
                }
            }
        }
        return check && count == 3;
    }

    //21
    public boolean twoTwo(int[] nums) {
        if(nums.length == 0) return true;
        else if(nums.length == 1) {
            return nums[0] != 2;
        }
        else if(nums.length == 2) {
            return nums[0] == 2 && nums[1] == 2;
        }
        else{
            boolean check = true;
            for(int i = 1; i < nums.length-1; i++){
                if(nums[i] == 2 && (nums[i-1] != 2 && nums[i+1] != 2)) check = false;
            }
            if(nums[nums.length-1] == 2 && nums[nums.length-2] != 2) check = false;
            return check;
        }
    }

    //22
    public boolean sameEnds(int[] nums, int len) {
        boolean check = true;
        for(int i = 0; i < len; i++){
            if(nums[i] != nums[nums.length-len+i]){
                check = false;
                break;
            }
        }
        return check;
    }

    //23
    public boolean tripleUp(int[] nums) {
        boolean check = false;
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] == nums[i+1]-1 && nums[i] == nums[i+2]-2) check = true;
        }
        return check;
    }

    //24
    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end-start];
        for(int i = start; i < end; i++){
            arr[i-start] = i;
        }
        return arr;
    }

    //25
    public int[] shiftLeft(int[] nums) {
        if(nums.length > 0){
            int temp = nums[0];
            for(int i = 0; i < nums.length-1; i++){
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = temp;
        }
        return nums;
    }

    //26
    public int[] tenRun(int[] nums) {
        boolean multiple = false;
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 0) {
                temp = nums[i];
                multiple = true;
            }
            if(multiple) nums[i] = temp;
        }
        return nums;
    }

    //27
    public int[] pre4(int[] nums) {
        int[] arr = new int[0];
        for(int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == 4)
                arr = new int[i];
            else if (arr.length > 0)
                arr[i] = nums[i];
        }
        return arr;
    }

    //28
    public int[] post4(int[] nums) {
        int[] arr = new int[0];
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4){
                arr = new int[nums.length - i-1];
                j = 0;
            }
            else if(arr.length > 0){
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    //29
    public int[] notAlone(int[] nums, int val) {
        if(nums.length > 2){
            for(int i = 1; i < nums.length-1; i++){
                if(nums[i] == val && nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                    nums[i] = Math.max(nums[i-1], nums[i+1]);
                }
            }
        }
        return nums;
    }

    //30
    public int[] zeroFront(int[] nums) {
        int[] newArr = new int[nums.length];
        int count = 0;

        for(int i : nums){
            if(i == 0) count++;
        }
        for (int num : nums) {
            if (num != 0) newArr[count++] = num;
        }
        return newArr;
    }

    //31
    public int[] withoutTen(int[] nums) {
        int[] newArr = new int[nums.length];
        int index = 0;

        for(int i : nums){
            if(i != 10) newArr[index++] = i;
        }
        return newArr;
    }
}