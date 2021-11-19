package coding_bat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    // 1
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: strings){
            map.put(s, 0);
        }
        return map;
    }

    // 2
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: strings){
            map.put(s, s.length());
        }
        return map;
    }

    // 3
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String s: strings){
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length()-1)));
        }
        return map;
    }

    // 4
    public Map<String, Integer> wordCount(String[] strings) {
        Map <String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int count = 0;
            for (String string : strings) {
                if (s.equals(string)) {
                    count++;
                }
            }
            map.put(s, count);
        }
        return map;
    }

    // 5
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String key = string.charAt(0) + "";
            String value = "";
            for (String s : strings) {
                if (s.startsWith(key)) value += s;
            }
            map.put(key, value);
        }
        return map;
    }

    // 6
    public String wordAppend(String[] strings) {
        Map<String, Integer> map  = new HashMap<>();
        String s = "";

        for (String key : strings) {
            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) s += key;
                map.put(key, val);
            }
            else map.put(key, 1);
        }
        return s;
    }

    // 7
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            boolean duplicate = false;
            for(int j = 0; j < strings.length; j++){
                if(i != j && strings[i].equals(strings[j])) {
                    duplicate = true;
                    break;
                }
            }
            map.put(strings[i], duplicate);
        }
        return map;
    }

    // 8
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int index = map.get(key);
                String temp = strings[index];
                strings[index] = strings[i];
                strings[i] = temp ;
                map.remove(key);
            }
            else map.put(key, i);
        }
        return strings;
    }

    // 9
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int val = map.get(key);
                if (val == -1) continue;
                int index   = map.get(key);
                String temp   = strings[index];
                strings[index] = strings[i];
                strings[i]   = temp ;
                map.put(key, -1);
            }
            else map.put(key, i);
        }
        return strings;
    }
}
