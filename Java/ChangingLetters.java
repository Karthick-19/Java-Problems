package Java;
//Suppose the given input string is "aaBc" the number of keys change is 2 
//Same letter with different cases will not be updated as a count
public class ChangingLetters {
    public static void main(String[] args) {
        String input = "aaBc";
        String s = input.toLowerCase();
        int x = 0;
        int count  = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(x) != s.charAt(i)){
                count+=1;
                x+=1;
            }
        }
        System.out.println(count);
    }
    
}
