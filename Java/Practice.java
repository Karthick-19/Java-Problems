package Java;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = num*(num +1)/2;
        System.out.println(ans);        
        sc.close();
        System.out.println(Factorial(4));
        printnumwithoutLoop(10);
        int[] arr = {2,3,99,69,29,1};
        Arrays.sort(arr);
        findBiggest(arr);
        System.out.println(Arrays.toString(arr));
        binarySearch(arr, 69);
        TomandJerry();

    }
    public static int Factorial(int f){
        if(f ==1) return f;
        else{
            return f * Factorial(f-1);
        }
    }
    public static void printnumwithoutLoop(int n){
        if(n > 0){
            printnumwithoutLoop(n -1);
            System.out.println(n + " ");
        }
    }
    public static void findBiggest(int[] arr){
        int maxValue = arr[0];
        for(int i =1;i < arr.length;i++){
            if(arr[i] > maxValue){
                int temp = arr[i];
                arr[i] = maxValue;
                maxValue = temp;
            }
        }
        System.out.println("Max value: "+maxValue);
    }
    public static void binarySearch(int[] arr,int x){
        int l =0;
        int r = arr.length -1;
        while(l <= r){
            int m = l +(r - 1) / 2;

            if(arr[m] == x){
                System.out.println("Element found at index: "+ m); 
                break;
            }

            if(x > m){
                l +=1;
            }

            else{
                r -= 1;
            }
        }
    }
    public static void TomandJerry(){
        for(int i = 1;i <=100;i++){
            if(i % 5 == 0 && i % 7 == 0) System.out.println("Tom and Jerry");
            else if(i % 5 == 0) System.out.println("Tom");
            else if(i % 7 == 0) System.out.println("Jerry");
            else System.out.println(i);
        }
    }
}
