package coding_bat;

import java.util.Arrays;

public class Array1 {
    // 1
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }

    // 2
    public boolean sameFirstLast(int[] nums) {
        return nums.length >=1 && (nums[0] == nums[nums.length-1]);
    }

    // 3
    public int[] makePi() {
        int[] arr = {3, 1, 4};
        return arr;
    }

    // 4
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }

    // 5
    public int sum3(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        return sum;
    }

    // 6
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    // 7
    public int[] reverse3(int[] nums) {
        int[] reversedArr = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i--){
            reversedArr[nums.length-1-i] = nums[i];
        }
        return reversedArr;
    }

    // 8
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        for(int i = 0; i < nums.length; i++){
            nums[i] = max;
        }
        return nums;
    }

    // 9
    public int sum2(int[] nums) {
        if(nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }

    // 10
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    // 11
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length-1]};
    }

    // 12
    public boolean has23(int[] nums) {
        Arrays.sort(nums);
        return Arrays.binarySearch(nums, 2) >= 0 || Arrays.binarySearch(nums, 3) >= 0;
    }

    // 13
    public boolean no23(int[] nums) {
        Arrays.sort(nums);
        return Arrays.binarySearch(nums, 2) < 0 && Arrays.binarySearch(nums, 3) < 0;
    }

    // 14
    public int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length*2];
        arr[arr.length-1] = nums[nums.length-1];
        return arr;
    }

    // 15
    public boolean double23(int[] nums) {
        int count2 = 0, count3 = 0;

        for(int i: nums){
            if(i == 2) count2++;
            else if(i == 3) count3++;
        }
        return count2 == 2 || count3 == 2;
    }

    // 16
    public int[] fix23(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
        }
        return nums;
    }

    // 17
    public int start1(int[] a, int[] b) {
        if(a.length > 0 && b.length > 0 && a[0] == 1 && b[0] == 1) return 2;
        else if((a.length > 0 && a[0] == 1) || (b.length > 0 && b[0] == 1)) return 1;
        return 0;
    }

    // 18
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0, sumB = 0;
        for(int i: a){
            sumA+=i;
        }
        for(int i: b){
            sumB+=i;
        }
        if(sumA >= sumB) return a;
        return b;
    }

    // 19
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length/2 - 1], nums[nums.length/2]};
    }

    // 20
    public int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            arr[i + a.length] = b[i];
        }
        return arr;
    }

    // 21
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

    // 22
    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2+1]};
    }

    // 23
    public int maxTriple(int[] nums) {
        return Math.max(Math.max(nums[0], nums[nums.length/2]), nums[nums.length-1]);
    }

    // 24
    public int[] frontPiece(int[] nums) {
        if(nums.length <= 2) return nums;
        return new int[]{nums[0], nums[1]};
    }

    // 25
    public boolean unlucky1(int[] nums) {
        if(nums.length >=2) return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3);
        return false;
    }

    // 26
    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if(a.length >= 2){
            arr[0] = a[0];
            arr[1] = a[1];
        }
        else if(a.length == 1){
            arr[0] = a[0];
            arr[1] = b[0];
        }
        else{
            arr[0] = b[0];
            arr[1] = b[1];
        }
        return arr;
    }

    // 27
    public int[] front11(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0){
            return new int[0];
        }
        else if(a.length != 0 && b.length != 0){
            int[] arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[0];
            return arr;
        }
        else if(a.length == 0){
            int[] arr = new int[1];
            arr[0] = b[0];
            return arr;
        }
        int[] arr = new int[1];
        arr[0] = a[0];
        return arr;
    }
}
