package leetcode;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeString {
    public String encode(List<String> strs) {
        var encodedString = "";
        if (strs.isEmpty()) {
            return "";
        }
        for (int i = 0; i < strs.size(); i++) {
            encodedString += strs.get(i) + "ENDL";
        }
        return encodedString;
    }
    
    public List<String> decode(String str) {
        List<String> listStrs = new ArrayList<>();
        if (str.isEmpty()) {
            return listStrs;
        }
        var decodedString = str.split("ENDL");
        for (String string : decodedString) {
            listStrs.add(string);
        }
        if (listStrs.isEmpty()) {
            listStrs.add("");
        }
        return listStrs;
    }
}