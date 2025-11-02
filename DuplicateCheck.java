import java.util.*;
public class DuplicateCheck{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter sixe of aray");
        int n= sc.nextInt();
        int nums[]=new int[n];

        System.out.print("enetr " + n + "element of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        //ceck for duplicate

        boolean result=hasDuplicate(nums);

        //output

        if(result){
            System.out.println("Output: true (Duplicate exists)");

        }else{
            System.out.println("Output: false (No duplicates)");
        }
        sc.close();
    }

    public static boolean hasDuplicate(int nums[]){
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}   





//LOGIC 2(bruitforce)

public static boolean hashDuplicate(int nums[]){
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
}



//LOGIC 3(sorting)

public static  boolean hashDuplicate(int nums[]){
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
    }
    return false;
}


//LOGIC 4(USING STREAMS) morden java

public static boolean hasDuplicate(int[] nums) {
    return Arrays.stream(nums).distinct().count()!=nums.length;
}

