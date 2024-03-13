package Java;

public class PrintEvenWords {
    public static void main(String[] args) {
        String sentence = "sky is vast and beautiful. Colour is blue";
        String[] wordsArray = sentence.split(" ");//Splits and stores each words as a elements of array
        for (String word : wordsArray) {
            if(word.length() %2 == 0){
                System.out.println(word);
            }
        }
    }
}
