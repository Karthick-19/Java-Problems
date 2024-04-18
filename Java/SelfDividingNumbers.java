package Java;
//A number is said to be a self dividing number when individual elements in the number can able to divide the whole number
// for example 128 
// gets divided by 1 and 2 and 8
// And also self diving number will not have 0 
public class SelfDividingNumbers {
    public static void main(String[] args) {
        int q = 128;
        int q2 = 1280;
        String s = String.valueOf(q);
        String s2 = String.valueOf(q2);
        char[] arr = s.toCharArray();
        char[] arr2 = s2.toCharArray();
        boolean ans = true;
        // System.out.println(digit);
        //Important step which converts char element into int 
        // char c = arr[i]
        //int n = (int) c - (int) '0';
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int digit = (int) c - (int) '0';
            if(q % digit != 0){
                ans = false;
            }
        }
        System.out.println(ans);
        System.out.println(isSelfDividing(q, arr));
        System.out.println(isSelfDividing(q2, arr2));//To check the 0 case
    }
    static boolean isSelfDividing(int q,char[] arr){
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(c == '0') return false;
            int num = (int) c - (int) '0';//Important step which converts cahr element into string
            if(q % num != 0){
                return false;
            }
        }
        return true;
    }

    
}
