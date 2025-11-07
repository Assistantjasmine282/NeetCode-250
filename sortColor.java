//Version 1 — Dutch National Flag Algorithm (Best for 0,1,2 sorting)   t->o(n), space->o(1)

import java.util.*;

public class SortColorsDNF {

    // Logic function — Dutch National Flag algorithm
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums); // calling logic function

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}



/*heap sort  same time and space complexity but slower than dutch national 
flag algo  and this is general sorting and here we require only aorting 
for  arrays 0,1,2  so this is not require here */

import java.util.*;

public class SortColorsHeap {

    //  Logic function — Heap Sort
    public static void heapSort(int[] nums) {
        int n = nums.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i, 0);
        }
    }

    // Helper function — heapify subtree
    public static void heapify(int[] nums, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && nums[left] > nums[largest])
            largest = left;
        if (right < heapSize && nums[right] > nums[largest])
            largest = right;

        if (largest != i) {
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;
            heapify(nums, heapSize, largest);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        heapSort(nums); 

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
