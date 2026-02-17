package PRACTISE;

public class Reverse_ARRAY_PRAC {
    static void REV_1(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }

    static void REV_2(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,3,5,4};;
        REV_1(arr);
        REV_2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
