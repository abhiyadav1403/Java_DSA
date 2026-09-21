package Array_Problem;
public class Practice {
//swipe the alternative element in an array
static void getswipeElement(int arr[]){
    for(int i=0; i<arr.length-1; i+=2){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}

//. Print Array Intersection Element
    static void getIntersection(int arr1[],int arr2[]){
    for(int i=0; i<arr1.length; i++){
        for(int j=0; j<arr1.length; j++){
            if(arr1[i]== arr2[j]){
                System.out.println(arr1[i]);
                break;
            }
        }
    }

    }

    public static void main(String[] args) {
        int arr1[]={1,2,4,5,6,7};
        int arr2[]={1,2,3,7,8,9};
        getIntersection(arr1,arr2);
//        System.out.println(getIntersection(arr1,arr2));

//        getswipeElement(arr);
//        for(int num:arr){
//            System.out.println(num+" ");
        }

    }

