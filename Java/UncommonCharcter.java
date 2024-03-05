package Java;

public class UncommonCharcter {
    public static void main(String[] args) {
        String one = "cbdea";
        String two = "ebdfac";
        char ans = 0;
        for(int i = 0; i < one.length();i++){
            ans ^= one.charAt(i);
        }
        for(int i = 0; i < two.length();i++){
            ans^= two.charAt(i);
        }
        System.out.println(ans);
        int[] arr = {1,4,2,1,3,2,3};
        System.out.println(SingleCharacterinArray(arr));
    }
    public static int SingleCharacterinArray(int[] arr){
        char res = 0;
        for(int i = 0;i < arr.length;i++){
            res ^= arr[i];
        }
        return res;
    }
}
