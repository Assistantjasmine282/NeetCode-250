import java.util.*;
import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagramUsingSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine().toLowerCase();

        System.out.println("Enter second string:");
        String t = sc.nextLine().toLowerCase();

        boolean result = isAnagramUsingSort(s, t);

        System.out.println("Are the two strings anagrams? " + result);
    }
}




//2ND LOGIC OFHIS PROBLEM (FREQUENCY COUNT)

import java.util.*;
public class ValidAnagram{
    public static boolean isAnagramUsingSort(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }

        // Step 2: Frequency array for 26 lowercase letters

        int count[]= new int[26];
                // Step 3: Increment for s, decrement for t
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:t.toCharArray()){
            count[c-'a']--;
        }
        for(int n:count){
            if(n!=0){
                return false;
            }
            return true;
        }
        public class static void main(String args[] ){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter first string:");
            String s=sc.nextLine().toLowerCase();

            System.out.println("enetr second string:");
            String t=sc.nextLine().toLowerCase();

            boolean result=isAnagramUsingSort(s,t);
            System.out.println("are the strins are anagram?"+result);

        }


    }