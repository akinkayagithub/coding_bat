package coding_bat;

public class String2 {
    public String doubleChar(String str) {
        // 1
        String s = "";
        for(char c: str.toCharArray()){
            s += "" + c + c;
        }
        return s;
    }

    //2
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("hi")) count++;
        }
        return count;
    }

    //3
    public boolean catDog(String str) {
        int dogCount = 0, catCount = 0;
        for(int i = 0; i < str.length()-2; i++){
            if(str.substring(i, i+3).equals("dog")) dogCount++;
            else if(str.substring(i, i+3).equals("cat")) catCount++;
        }
        return dogCount == catCount;
    }

    //4
    public int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-3; i++){
            String s = str.substring(i, i+4);
            if(s.startsWith("co") && s.endsWith("e")) count++;
        }
        return count;
    }

    //5
    public boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    //6
    public boolean xyzThere(String str) {
        if(str.contains(".xyz")) str = str.replace(".xyz", "");
        return str.contains("xyz");
    }

    //7
    public boolean bobThere(String str) {
        if(str.length() >= 3){
            for(int i = 0; i < str.length()-2; i++){
                if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
            }
        }
        return false;
    }

    //8
    public boolean xyBalance(String str) {
        if(!str.contains("x")) return true;
        else if(!str.contains("y")) return false;
        return !str.substring(str.lastIndexOf('y')).contains("x");
    }

    //9
    public String mixString(String a, String b) {
        String s = "";
        if(a.length() >= b.length()){
            for(int i = 0; i < b.length(); i++){
                s += "" + a.charAt(i) + b.charAt(i);
            }
            s += a.substring(b.length());
        }
        else{
            for(int i = 0; i < a.length(); i++){
                s += "" + a.charAt(i) + b.charAt(i);
            }
            s += b.substring(a.length());
        }
        return s;
    }

    //10
    public String repeatEnd(String str, int n) {
        String s = "";
        for(int i = 0; i < n; i++){
            s += str.substring(str.length() - n);
        }
        return s;
    }

    //11
    public String repeatFront(String str, int n) {
        String s = "";
        for(int i = n; i >= 0; i--){
            s += str.substring(0, n);
            n--;
        }
        return s;
    }

    //12
    public String repeatSeparator(String word, String sep, int count) {
        if(count <= 0) return "";
        else if(count == 1) return word;
        else{
            String s = "";
            for(int i = 0; i < count; i++){
                s += word + sep;
            }
            return s.substring(0, s.length()-sep.length());
        }
    }

    //13
    public boolean prefixAgain(String str, int n) {
        if(str.length() == 1) return false;
        else return str.substring(n).contains(str.substring(0, n));
    }

    //14
    public boolean xyzMiddle(String str) {
        if(str.length() > 2){
            if(str.equals("xyz")) return true;
            else if((str.startsWith("xyz") || str.endsWith("xyz")) && str.length() <= 4) return true;
            else{
                if(str.length() % 2 != 0) return str.substring(str.length()/2-1, str.length()/2+2).equals("xyz");
                else return str.substring(str.length()/2-2, str.length()/2+3).contains("xyz");
            }
        }
        return false;
    }

    //15
    public String getSandwich(String str) {
        if(str.contains("bread")) {
            String newStr = str.replace("bread", "");
            if(str.length() - newStr.length() > 5){
                return str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
            }
        }
        return "";
    }

    //16
    public boolean sameStarChar(String str) {
        if(str.contains("*")){
            for(int i = 1; i < str.length()-1; i++){
                if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) return false;
            }
        }
        return true;
    }

    //17
    public String oneTwo(String str) {
        String s = "";
        if(str.length() >= 3){
            if(str.length() % 3 != 0) str = str.substring(0, str.length() - (str.length() % 3));
            for(int i = 0; i < str.length(); i+=3){
                s += "" + str.charAt(i+1) + str.charAt(i+2) + str.charAt(i);
            }
        }
        return s;
    }

    //18
    public String zipZap(String str) {
        String s = "";
        if(str.length() >= 3){
            for(int i = 0; i < str.length()-2; i++){
                if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                    s += "" + str.charAt(i) + str.charAt(i+2);
                    i+=2;
                }
                else s += str.charAt(i);
            }
            if(str.charAt(str.length()-3) != 'z') s += str.substring(str.length()-2);
        }
        else return str;
        return s;
    }

    //19
    public String starOut(String str) {
        if(str.contains("*")){
            String s = "";
            for(int i = 0; i < str.length(); i++){
                if(i == 0){
                    if(str.charAt(i) != '*' && str.charAt(i+1) != '*') s += str.charAt(i);
                }
                else if(i == str.length()-1){
                    if(str.charAt(i) != '*' && str.charAt(i-1) != '*') s += str.charAt(i);
                }
                else {
                    if(str.charAt(i-1) != '*' && str.charAt(i) != '*' && str.charAt(i+1) != '*') s += str.charAt(i);
                }
            }
            return s;
        }
        return str;
    }

    //20
    public String plusOut(String str, String word) {
        String plus = "";
        for(int i = 0; i <= str.length()-word.length(); i++){
            if(str.substring(i, i + word.length()).equals(word)){
                plus += word;
                i += word.length()-1;
            }
            else plus += "+";
        }
        int diff = str.length()-plus.length();
        if(diff != 0){
            for(int i = 0; i < diff; i++){
                plus += "+";
            }
        }
        return plus;
    }

    //21
    public String wordEnds(String str, String word) {
        if(str.equals(word) || !str.contains(word)) return "";
        else{
            String s = "";
            for(int i = 0; i <= str.length()-word.length(); i++){
                if(str.startsWith(word, i)){
                    if(i != 0 && i + word.length() < str.length()){
                        s += "" + str.charAt(i-1) + str.charAt(i + word.length());
                    }
                    else if(i == 0)s += str.charAt(i + word.length());
                    else if(i + word.length() >= str.length()) s += str.charAt(i-1);
                }
            }
            return s;
        }
    }
}
