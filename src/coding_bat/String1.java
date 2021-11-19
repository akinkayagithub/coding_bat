package coding_bat;

public class String1 {
    //1
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //2
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //3
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    //4
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    //5
    public String extraEnd(String str) {
        if(str.length() > 1) return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
        return "";
    }

    //6
    public String firstTwo(String str) {
        if(str.length() > 1) return str.substring(0, 2);
        return str;
    }

    //7
    public String firstHalf(String str) {
        if(str.length() > 1 && str.length() % 2 == 0) return str.substring(0, str.length()/2);
        return "";
    }

    //8
    public String withoutEnd(String str) {
        if(str.length() > 1) return str.substring(1, str.length()-1);
        return "";
    }

    //9
    public String comboString(String a, String b) {
        if(a.length() > b.length()) return b + a + b;
        return a + b + a;
    }

    //10
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    //11
    public String left2(String str) {
        if(str.length() > 2) return str.substring(2) + str.substring(0, 2);
        return str;
    }

    //12
    public String right2(String str) {
        if(str.length() > 2) return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        return str;
    }

    //13
    public String theEnd(String str, boolean front) {
        if(!str.isEmpty()){
            if(front) return str.substring(0,1);
            return str.substring(str.length()-1);
        }
        return "";
    }

    //14
    public String withouEnd2(String str) {
        if(str.length() > 1) return str.substring(1, str.length()-1);
        return "";
    }

    //15
    public String middleTwo(String str) {
        int mid = str.length()/2;
        if(str.length() > 1) return str.substring(mid-1, mid+1);
        return "";
    }

    //16
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    //17
    public String nTwice(String str, int n) {
        if(str.length() >= n) return str.substring(0, n) + str.substring(str.length()-n);
        return "";
    }

    //18
    public String twoChar(String str, int index) {
        if(index > 0 && (str.length()-index) >=2) return str.substring(index, index+2);
        return str.substring(0,2);
    }

    //19
    public String middleThree(String str) {
        int mid = str.length()/2;
        return str.substring(mid-1, mid+2);
    }

    //20
    public boolean hasBad(String str) {
        if(str.length()>3) return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
        else return str.equals("bad");
    }

    //21
    public String atFirst(String str) {
        if(str.isEmpty()) return "@@";
        else if(str.length() == 1) return str + "@";
        return str.substring(0,2);
    }

    //22
    public String lastChars(String a, String b) {
        if(a.isEmpty() && b.isEmpty()) return "@@";
        else if(a.isEmpty()) return "@" + b.charAt(b.length()-1);
        else if(b.isEmpty()) return a.charAt(0) + "@";
        return "" + a.charAt(0) + b.charAt(b.length()-1);
    }

    //23
    public String conCat(String a, String b) {
        if(!a.isEmpty() && !b.isEmpty() && a.endsWith("" + b.charAt(0))) return a + b.substring(1);
        return a + b;
    }

    //24
    public String lastTwo(String str) {
        String newStr = "";
        if(str.length() == 1) return str;
        else if(str.length() >= 2) newStr = str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        return newStr;
    }

    //25
    public String seeColor(String str) {
        if(str.startsWith("red")) return "red";
        else if(str.startsWith("blue")) return "blue";
        return "";
    }

    //26
    public boolean frontAgain(String str) {
        if(str.length() >= 2) return str.endsWith(str.substring(0,2));
        return false;
    }

    //27
    public String minCat(String a, String b) {
        if(a.isEmpty() || b.isEmpty()) return "";
        else{
            int minLength = Math.min(a.length(), b.length());
            return a.substring(a.length()-minLength) + b.substring(b.length()-minLength);
        }
    }

    //28
    public String extraFront(String str) {
        if(str.length() < 2) return str + str + str;
        return str.substring(0,2) + str.substring(0,2) +str.substring(0,2);
    }

    //29
    public String without2(String str) {
        if(str.length() >= 2 && str.endsWith(str.substring(0,2))) return str.substring(2);
        return str;
    }

    //30
    public String deFront(String str) {
        if(!str.isEmpty()){
            if(str.equals("a")) return str;
            else if(str.length() >=2){
                String newStr = "";
                if(str.charAt(0) == 'a') newStr += str.charAt(0);
                if(str.charAt(1) == 'b') newStr += str.charAt(1);
                newStr += str.substring(2);
                return newStr;
            }
        }
        return "";
    }

    //31
    public String startWord(String str, String word) {
        if(!str.isEmpty() && str.substring(1).startsWith(word.substring(1))) return str.substring(0, word.length());
        return "";
    }

    //32
    public String withoutX(String str) {
        String s = "";
        if(!str.isEmpty()){
            if(str.equals("x")) return "";
            if(str.charAt(0) != 'x') s += str.charAt(0);
            s += str.substring(1, str.length()-1);
            if(str.charAt(str.length()-1) != 'x') s += str.charAt(str.length()-1);
            return s;
        }
        return "";
    }

    //33
    public String withoutX2(String str) {
        if(str.length() > 0){
            if(str.equals("x")) return "";
            else if (str.equals("xx")) return "";
            else{
                String sNew = "";
                if(str.charAt(0) != 'x') sNew += str.charAt(0);
                if(str.charAt(1) != 'x') sNew += str.charAt(1);
                if(str.length() > 2) sNew += str.substring(2);
                return sNew;
            }
        }
        return "";
    }
}
