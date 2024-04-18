package Java;

import java.util.Arrays;
import java.util.Comparator;

//There is an integer array of elements [5,23,90] we have to return a array such that if that array considered as a single integer it should be largest like [90,5,23] = 90523 > 90235
//We should not sort array in descending order which will not give us the expected answer
//Solution
//Step1-> Convert the integer array into string arr using string.valueOf()
//Step2-> Sort the array along with the comparator
//Step3->Make 2 orders a+b(order1) b+a(order2) return the big one into the sorted array
public class CreateLargestNumber {
    public static void main(String[] args) {
        int[] arr = {23,90,5};
        String[] a = new String[arr.length];
        //Step1
        for (int i = 0; i < arr.length; i++) {
            a[i] = String.valueOf(arr[i]);
        }
        //Step2
        Arrays.sort(a,new Comparator<String>() {
            //Step3
            //Let's take the first comparison between a and b as ("23", "90").
            // Concatenating a and b gives us "2390" and "9023".
            // Now, order2.compareTo(order1) is performed, where order2 = "9023" and order1 = "2390".
            // Since "9023" comes before "2390" lexicographically, compareTo returns a negative value.
            // This indicates that b should come before a in the sorted array.
            // Therefore, ("90", "23") would be the correct order after this comparison.
            public int compare(String a,String b){
                String order1 = a+b;
                String order2 = b+a;
                return order2.compareTo(order1);
            }
        });
        System.out.println(Arrays.toString(a));
    }
    
}
