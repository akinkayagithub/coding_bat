package coding_bat;

public class WarmUp1 {
    //1
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    //2
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    //3
    public int sumDouble(int a, int b) {
        if(a == b) return 2 * (a + b);
        return a + b;
    }

    //4
    public int diff21(int n) {
        if(n > 21) return 2 * (Math.abs(n - 21));
        return Math.abs(21 - n);
    }

    //5
    public boolean parrotTrouble(boolean talking, int hour) {
        return !(7 <= hour && hour <= 20) && talking;
    }

    //6
    public boolean makes10(int a, int b) {
        if( a == 10 || b == 10 || (a+b) == 10) return true;
        return false;
    }

    //7
    public boolean nearHundred(int n) {
        if(Math.abs(n - 200) <= 10 || Math.abs(n - 100) <= 10) return true;
        return false;
    }

    //8
    public boolean posNeg(int a, int b, boolean negative) {
        if((negative && a < 0 && b < 0) || ((!negative) && (a < 0 && b >= 0) || (!negative) && (a >= 0 && b < 0))) return true;
        return false;
    }

    //9
    public String notString(String str) {
        if(str.startsWith("not")) return str;
        return "not " + str;
    }

    //10
    public String missingChar(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(i != n) newStr += str.charAt(i);
        }
        return newStr;
    }

    //11
    public String frontBack(String str) {
        if(str.length() > 1) return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
        return str;
    }

    //12
    public String front3(String str) {
        if(str.length() < 4) return str + str + str;
        String first3 = str.substring(0,3);
        return  first3 + first3 + first3;
    }

    //13
    public String backAround(String str) {
        if(str.length() != 0)return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        return "";
    }

    //14
    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    //15
    public String front22(String str) {
        if(str.length() < 3) return str + str + str;
        String first2Chars = str.substring(0, 2);
        return first2Chars + str + first2Chars;
    }

    //16
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    //17
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    //18
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    //19
    public boolean hasTeen(int a, int b, int c) {
        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }

    //20
    public boolean loneTeen(int a, int b) {
        return (a > 12 && a < 20) && !(b > 12 && b < 20) || !(a > 12 && a < 20) && (b > 12 && b < 20);
    }

    //21
    public String delDel(String str) {
        if(str.length() > 3 && str.substring(1, 4).equalsIgnoreCase("del")) return str.charAt(0) + str.substring(4);
        return str;
    }

    //22
    public boolean mixStart(String str) {
        return str.length() > 2 && str.substring(1, 3).equalsIgnoreCase("ix");
    }

    //23
    public String startOz(String str) {
        if(str.length() == 0) return "";
        else if(str.equalsIgnoreCase("o")) return str;
        else{
            String s = "";
            if(str.toLowerCase().charAt(0) == 'o') s += str.charAt(0);
            if(str.toLowerCase().charAt(1) == 'z') s += str.charAt(1);
            return s;
        }
    }

    //24
    public int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //25
    public int close10(int a, int b) {
        if(Math.abs(a-10) == Math.abs(b-10)) return 0;
        else{
            if(Math.abs(a-10) > Math.abs(b-10)) return b;
            return a;
        }
    }

    //26
    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }

    //27
    public int max1020(int a, int b) {
        if (Math.max(a, b) >= 10 && Math.max(a, b) <= 20) return Math.max(a, b);
        else if (Math.min(a, b) >= 10 && Math.min(a, b) <= 20) return Math.min(a, b);
        return 0;
    }

    //28
    public boolean stringE(String str) {
        if(str.length() > 0){
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.toLowerCase().charAt(i) == 'e') count++;
            }
            return count >= 1 && count <= 3;
        }
        return false;
    }

    //29
    public boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    //30
    public String endUp(String str) {
        if(str.length() <= 3) return str.toUpperCase();
        else{
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
    }

    //31
    public String everyNth(String str, int n) {
        if(str.length() == 0) return "";
        else if(str.length() < n) return "" + str.charAt(0);

        String s = "" + str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(i % n == 0) s += str.charAt(i);
        }
        return s;
    }
}
