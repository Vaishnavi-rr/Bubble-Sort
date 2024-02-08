Algorithm for Bubble Sort in Java:

Step1: Repeat step 1 to 4 for i=0 to n
Step2: For j=0 to n
Step3: if(arr[j]>arr[j+1]
Step4: swap(arr[j],arr[j+1])
Step5: End
  
code:
  
import java.util.Scanner;
public class Main {
   public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr); //calling the bubbleSort function

        System.out.println("Sorted array:");

        printArray(arr); //calling the printArray function

    } 
}
//Time Complexity	O(n2)
//Best Case	O(n)
//Worst Case	O(n2)
//Space Complexity	O(1)
//Avg. Comparisons	n(n-1)/2
