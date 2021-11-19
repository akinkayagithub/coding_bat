package coding_bat;

public class String3 {
    //1
    public int countYZ(String str) {
        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetter(str.charAt(i))) str = str.replace(str.charAt(i), ' ');
        }
        String[] arr = str.toLowerCase().split(" ");
        int count = 0;
        for(String s: arr){
            if(s.endsWith("y") || s.endsWith("z")) count++;
        }
        return count;
    }

    //2
    public String withoutString(String base, String remove) {
        if(base.length() < remove.length()) return base;
        String s = "";
        for(int i = 0; i < base.length(); i++){
            if(i <= base.length()-remove.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)){
                i += remove.length()-1;
            }
            else s += base.charAt(i);
        }
        return s;
    }

    //3
    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for(int i = 0; i < str.length(); i++){
            if(i <= str.length()-3 && str.substring(i, i+3).equals("not")) not++;
            if(i <= str.length()-2 && str.substring(i, i+2).equals("is")) is++;
        }
        return is == not;
    }

    //4
    public boolean gHappy(String str) {
        if(str.contains("g")){
            String s = "";
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'g') s += "g";
                else s += " ";
            }
            String[] arr = s.split(" ");
            for(String string: arr){
                if(string.equals("g")) return false;
            }
        }
        return true;
    }

    //5
    public int countTriple(String str) {
        int count = 0;
        if(str.length() >= 3){
            for(int i = 0; i < str.length()-2; i++){
                if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                    count++;
                }
            }
        }
        return count;
    }

    //6
    public int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt(""+str.charAt(i));
        }
        return sum;
    }

    //7
    public String sameEnds(String string) {
        String end = "";
        for(int i = 1; i <= string.length()/2; i++){
            if(string.substring(0, i).equals(string.substring(string.length()-i))) end = string.substring(0, i);
        }
        return end;
    }

    //8
    public String mirrorEnds(String string) {
        String end = "";
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == string.charAt(string.length()-1-i)) end += string.charAt(i);
            else break;
        }
        return end;
    }

    //9
    public int maxBlock(String str) {
        int greatest = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int count = 0;
            for(int j = i; j < str.length(); j++){
                if(str.charAt(j) == c) count++;
                else break;
            }
            if(count > greatest) greatest = count;
        }
        return greatest;
    }

    //10
    public int sumNumbers(String str) {
        int sum = 0;
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) s += str.charAt(i);
            else s += " ";
        }
        String[] arr = s.split(" ");
        for(String string: arr){
            if(!string.isEmpty()) sum += Integer.parseInt(string);
        }
        return sum;
    }

    //11
    public String notReplace(String str) {
        String result = "";
        str = " " + str + "  ";
        for(int i = 1; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))
                    && !Character.isLetter(str.charAt(i+2))){
                result += "is not";
                i++;
            }
            else result += str.charAt(i);
        }
        return result.trim();
    }
}
