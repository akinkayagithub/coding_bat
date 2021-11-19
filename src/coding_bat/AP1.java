package coding_bat;

import java.util.*;

public class AP1 {

    // 1
    public boolean scoresIncreasing(int[] scores) {
        for(int i = 0; i < scores.length-1; i++){
            if(scores[i] > scores[i+1]) return false;
        }
        return true;
    }

    // 2
    public boolean scores100(int[] scores) {
        for(int i = 0; i < scores.length-1; i++){
            if(scores[i] == 100 && scores[i+1] == 100) return true;
        }
        return false;
    }

    // 3
    public boolean scoresClump(int[] scores) {
        for(int i = 0; i < scores.length-2; i++){
            if(scores[i]+2 >= scores[i+1] && scores[i]+2 >= scores[i+2]) return true;
        }
        return false;
    }

    // 4
    public int scoresAverage(int[] scores) {
        int first = 0;
        int second = 0;

        for(int i = 0; i < scores.length/2; i++){
            first += scores[i];
            second += scores[scores.length/2+i];
        }
        return Math.max(first/(scores.length/2), second/(scores.length/2));
    }

    // 5
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for(String s: words){
            if(s.length() == len) count++;
        }
        return count;
    }

    // 6
    public String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = words[i];
        }
        return arr;
    }

    // 7
    public List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for(String s: words){
            if(s.length() != len) list.add(s);
        }
        return list;
    }

    // 8
    public boolean hasOne(int n) {
        return String.valueOf(n).contains("1");
    }

    // 9
    public boolean dividesSelf(int n) {
        int[] digits = new int[String.valueOf(n).length()];

        for(int i = 0; i < digits.length; i++){
            digits[i] = Integer.parseInt(String.valueOf(n).substring(i, i+1));
            if(digits[i] == 0 || n % digits[i] != 0) return false;
        }
        return true;
    }

    // 10
    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;
        for(int i: nums){
            if(i % 2 == 0) {
                arr[index] = i;
                index++;
            }
            if(index == count) break;
        }
        return arr;
    }

    // 11
    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;
        for(int i: nums){
            if((0 <= i && i <= 10) || (90 <= i && i <= 100)) arr[index++] = i;
            if(index == count) break;
        }
        return arr;
    }

    // 12
    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) count++;
        }
        return count;
    }

    // 13
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for(int i = 0; i < key.length; i++){
            if(answers[i].equals("?")) continue;
            else{
                if(key[i].equals(answers[i])) score += 4;
                else score -= 1;
            }
        }
        return score;
    }

    // 14
    public String[] wordsWithout(String[] words, String target) {
        List<String> list = new ArrayList<>();
        for(String s: words){
            if(!s.equals(target)) list.add(s);
        }
        String[] arr = new String[list.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    // 15
    public int scoresSpecial(int[] a, int[] b) {
        return maxScore(a) + maxScore(b);
    }

    public int maxScore(int[] arr){
        int max = 0;
        for(int i: arr){
            if(i % 10 == 0 && i > max) max = i;
        }
        return max;
    }

    // 16
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for(int i = start; i < end; i++){
            sum += Math.abs(heights[i] - heights[i+1]);
        }
        return sum;
    }

    // 17
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for(int i = start; i < end; i++){
            if(heights[i] < heights[i+1]) sum += 2*Math.abs(heights[i] - heights[i+1]);
            else sum += Math.abs(heights[i] - heights[i+1]);
        }
        return sum;
    }

    // 18
    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for(int i = start; i < end; i++){
            if(Math.abs(heights[i] - heights[i+1]) >= 5) count++;
        }
        return count;
    }

    // 19
    public int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.equals(bName)){
            if(aId == bId) return 0;
            else if(aId < bId) return -1;
        }
        else if(aName.compareTo(bName) < 0) return -1;
        return 1;
    }

    // 20
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(!list.contains(a[i])) list.add(a[i]);
            if(!list.contains(b[i])) list.add(b[i]);
        }

        Collections.sort(list);

        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    // 21
    public int commonTwo(String[] a, String[] b) {
        String[] shortOne = a.length <= b.length ? a : b;
        String[] longOne = a.length > b.length ? a : b;

        int count = 0;
        for(String s: new HashSet<>(Arrays.asList(shortOne))){
            if(Arrays.binarySearch(longOne, s) >= 0) count++;
        }
        return count;
    }
}
