package Java;
//Panagram all letters from a to z is present in the given string
public class CheckPangram {
    public static void main(String[] args) {
        String input = "Quick Brown fox jumps over the lazy dog";
        System.out.println("The given String is Panagram: "+isPangram(input));
    }
    static boolean isPangram(String s){
        s = s.toLowerCase();
        if(s.length() < 26){
            return false;
        }
        for(char i = 'a';i <= 'z';i++){
            if(s.indexOf(i) < 0){//Which mean the letter is not present in string, it will return -1
                return false;
            }
        }
        return true;
    }
}
