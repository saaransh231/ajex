package Basics;

public class ArrayCommon {

    public static void main(String[] args) {
        int arr[] = {23,34,56,76};
        int arr2[] = {32,23,56,87};

        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
