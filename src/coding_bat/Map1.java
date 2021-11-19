package coding_bat;

import java.util.Map;

public class Map1 {
    //1
    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.get("a") != null){
            String aValue = map.get("a");
            map.put("b", aValue);
            map.put("a", "");
        }
        return map;
    }

    //2
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.get("a") != null){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    //3
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") != null){
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    //4
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.get("ice cream") != null) map.put("ice cream", "cherry");
        map.put("bread", "butter");
        return map;
    }

    //5
    public Map<String, String> topping2(Map<String, String> map) {
        if(map.get("ice cream") != null) map.put("yogurt", map.get("ice cream"));
        if(map.get("spinach") != null) map.put("spinach", "nuts");
        return map;
    }

    //6
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.get("potato") != null) map.put("fries", map.get("potato"));
        if(map.get("salad") != null) map.put("spinach", map.get("salad"));
        return map;
    }

    //7
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") != null && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    //8
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") == null) map.put("b", map.get("a"));
        else if(map.get("a") == null && map.get("b") != null) map.put("a", map.get("b"));
        return map;
    }

    //9
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") != null){
            if(map.get("a").length() != map.get("b").length()){
                String c = map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b");
                map.put("c", c);
            }
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
