package coding_bat;

public class WarmUp2 {
    // 1
    public String stringTimes(String str, int n) {
        String newStr = "";
        for(int i = 0; i < n; i++){
            newStr += str;
        }
        return newStr;
    }

    // 2
    public String frontTimes(String str, int n) {
        String newStr = "";
        if(str.length() > 2){
            str = str.substring(0,3);
        }
        for(int i = 0; i < n; i++){
            newStr += str;
        }
        return newStr;
    }

    // 3
    int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.toLowerCase().charAt(i) == 'x' && str.toLowerCase().charAt(i+1) == 'x') count++;
        }
        return count;
    }

    // 4
    boolean doubleX(String str) {
        if(!str.isEmpty() && str.toLowerCase().contains("x")){
            for(int i = 0; i < str.length()-1; i++){
                if(str.toLowerCase().charAt(i) == 'x') {
                    if(str.toLowerCase().charAt(i + 1) == 'x') return true;
                    break;
                }
            }
        }

        return false;
    }

    // 5
    public String stringBits(String str) {
        String newStr = "";

        if (!str.isEmpty()) {
            return newStr;
        }
        for(int i = 0; i < str.length(); i++){
            newStr += str.charAt(i);
            i++;
        }
        return newStr;
    }

    // 6
    public String stringSplosion(String str) {
        String newStr = "";
        for(int i = 0; i <= str.length()-1; i++){
            for(int j = 0; j <= i; j++){
                newStr += str.charAt(j);
            }
        }
        return newStr;
    }

    // 7
    public int last2(String str) {
        if(str.length() > 3){
            String last2 = str.substring(str.length()-2);
            int count = 0;
            for(int i = 0; i < str.length()-2; i++){
                if(("" + str.charAt(i) + str.charAt(i + 1)).equalsIgnoreCase(last2)) count++;
            }
            return count;
        }
        return 0;
    }

    // 8
    public int arrayCount9(int[] nums) {
        int count9 = 0;
        for(int i: nums){
            if(i == 9) count9++;
        }

        return count9;
    }

    // 9
    public boolean arrayFront9(int[] nums) {
        if(nums.length > 0){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 9) return true;
                if(i == 3) break;
            }
        }

        return false;
    }

    // 10
    public boolean array123(int[] nums) {
        if(nums.length > 2){
            for(int i = 0; i < nums.length - 2; i++){
                if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
            }
        }
        return false;
    }

    // 11
    public int stringMatch(String a, String b) {
        int length = Math.min(a.length(), b.length());
        int count = 0;
        for(int i = 0; i < length - 1; i++){
            if(a.substring(i, i + 2).equalsIgnoreCase(b.substring(i, i + 2))) count ++;
        }
        return count;
    }

    // 12
    public String stringX(String str) {
        String newStr = "";
        if(!str.isEmpty()){
            for(int i = 0; i < str.length(); i++){
                if(i == 0 || i == str.length() - 1 || str.charAt(i) != 'x') newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    // 13
    public String altPairs(String str) {
        String newStr = "";
        for(int i = 0; i <= str.length() - 1; i++){
            if(i != str.length() - 1) newStr += str.substring(i, i + 2);
            else newStr += str.charAt(i);
            i += 3;
        }
        return newStr;
    }

    // 14
    public String stringYak(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(i != str.length() - 2 && str.toLowerCase().charAt(i) == 'y' && str.toLowerCase().charAt(i + 2) == 'k') {
                i += 2;
            }
            else newStr += str.charAt(i);
        }
        return newStr;
    }

    // 15
    public int array667(int[] nums) {
        int count = 0;
        if(nums.length > 1){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) count++;
            }
        }
        return count;
    }

    // 16
    public boolean noTriples(int[] nums) {
        if(nums.length > 2){
            for(int i = 0; i < nums.length - 2; i++){
                if(nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) return false;
            }
        }
        return true;
    }

    // 17
    public boolean has271(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if((nums[i+1] == (nums[i] + 5)) && (Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)) return true;
        }
        return false;
    }
}
