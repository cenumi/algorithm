package sword;

import java.util.LinkedHashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {
    /**
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
     * 中找到第一个只出现一次的字符,
     * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
     */

    public static void main(String[] args) {
        System.out.println(new 第一个只出现一次的字符().FirstNotRepeatingChar("googgle"));

    }

    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        int count = 0;
        for (char c :chars){
            if (map.get(c) == 1){
                return count;
            }
            count++;
        }
        if (count > chars.length || count < 1)
            return -1;
        return count;
    }
}
