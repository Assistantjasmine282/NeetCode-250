import java.util.Scanner;
public class Concatenation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array (n) ");
        int n=sc.nextInt();
        
        int nums[]=new int[n];
        System.out.print("enter"+n+"element of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        //call function to get cncatetaion

        int ans[]=getConcatenation(nums);

//print the output
System.out.print("concatenated array:");
for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+"");
}
sc.close();

    }

    public static int[]getConcatenation(int nums[]){
int n=nums.length;
int ans[]=new int[2*n];
for(int i=0;i<n;i++){
    ans[i]=nums[i];
    ans[i+n]=nums[i];
}
return ans;

    }
}