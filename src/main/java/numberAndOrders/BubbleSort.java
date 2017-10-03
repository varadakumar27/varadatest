package numberAndOrders;

public class BubbleSort {
	 // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
 
   private static void swapNumbers(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
 
    }
}
/* 
static void bubbleSort(int[] arr) {  
    int n = arr.length;  
    int temp = 0;  
     for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(arr[j-1] > arr[j]){  
                             //swap elements  
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
                     }  
                      
             }  
     }  

}  
public static void main(String[] args) {  
            int arr[] ={3,60,35,2,45,320,5};  
             
            System.out.println("Array Before Bubble Sort");  
            for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
            }  
            System.out.println();  
              
            bubbleSort(arr);//sorting array elements using bubble sort  
             
            System.out.println("Array After Bubble Sort");  
            for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
            }  

    }*/
