//bruit force approach
import java.util.*;

public class BruteForceGroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strs));
    }
}


//2nd approach(sorting+hashmap)
import java.util.*;

public class GroupAnagramsSort {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strs));
    }
}

// third apparoch (frequeny count)

import java.util.*;

public class GroupAnagramsCount {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // Key = unique frequency signature
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strs));
    }
}


//prime number mulitiplication trick(unique encoding)
import java.util.*;

public class GroupAnagramsPrime {
    static int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,
                           43,47,53,59,61,67,71,73,79,83,89,97,101};

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, List<String>> map = new HashMap<>();

        for (String s : strs) {
            long key = 1;
            for (char c : s.toCharArray()) {
                key *= primes[c - 'a'];
            }
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        System.out.println(groupAnagrams(strs));
    }
}
