package Java;
import java.lang.Math;

public class BinarytoDecimal {

    public static void main(String[] args) {
        int binary = 1011;
        int decimal = 0;
        int n = 0;
        while(true){
            if (binary == 0) break;
            int temp = binary % 10; //To get the least significant bit of binary
            decimal += temp * Math.pow(2,n);//Adding the decimal with 2 power of the binary bit power
            binary = binary/10;//This step clear the current bit and moves to next bit
            n++;
        }
        System.out.println(decimal);
        String bin = "1011";
        ParseIntmethod(bin);
        int dec = 11;
        DectoBin(dec);
    }
    public static void ParseIntmethod(String bin){
        int dec = Integer.parseInt(bin,2);
        System.out.println(dec);
    }
    public static void DectoBin(int dec){
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
    }
}