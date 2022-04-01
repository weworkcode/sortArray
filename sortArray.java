import  java.util.Arrays;


public class sortArray {
    void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void sortInWave(int arr[], int n){
        Arrays.sort(arr);
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
    
    public static void main(String args[]){
        sortArray inp = new sortArray();
        int arr[] = {21, 4, 20, 6, 9, 80, 90};
        int n = arr.length;
        inp.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
