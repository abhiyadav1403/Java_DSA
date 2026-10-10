package Sorting;

public class Bubble_Sort {

    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){ // round
            for(int j=0; j<n-i-1; j++){  // neighbouring element ke compersion
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {6,5,1,3};
        bubbleSort(arr);
        System.out.println("Printing the array");
        for(int value: arr){
            System.out.print(value + " " );
        }
    }
}
