
//optimal approach (hashmap)

import java.util.*;
public class twoSum{
    public static int[] twoSum(int nums[],int target){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.lenght,i++){
            int complement=target-nums[i];

            if map.containsKey(complement){
                return new int[]{map.get(complment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array:");
        int n=sc.nextInt();

        int nums[]=new int[n];

        System.out.println("enetr the target value:");
        int target=sc.nextInt();

        int result[]=twoSum(nums,target);

        if(result.length==0){
            System.out.println("no pir found!");
        }else{
            System.out.println("indeces:"+result[0]+"and"+result[1])   //result[1] this is wriiten so that her print bth indeces value ex-0,1
        }
    }

}


//2nd approach basic approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
         return new int[] {};
    }
}