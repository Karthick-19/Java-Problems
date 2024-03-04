package Java;
//Incorrect Logic need to work on it
public class Merge2Sortedarray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,7};
        int[] arr2 = {2,3,6};
        int a = 0;
        int b = 0;
        while(b < arr2.length){
            if(arr1[a] > arr2[b]){
                int temp = arr1[a];
                arr1[a] = arr2[b];
                arr2[b] = temp;  
                a+=1;
                b+=1;         
            }
            else{
                a+=1;
            }
        }
        for (int i : arr1) {
            System.out.println(i);
        }
        // for (int i : arr2){
        //     System.out.println(i);
        // }
    }
}
