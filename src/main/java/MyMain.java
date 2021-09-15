import java.util.Scanner;
//How do people represent numbers?              How do computers represent numbers?
//People use decimal (base 10)                  Electrical circuits either 'off' or 'on'
//We have 10 digits 0-9                         So it's easier to use binary: 0 and 1
//                                              Base 2: two digits
// 0,1,2,3,4,5,6,7,8,9                          0,1,10,11,100,101,110,111,1000,1001
//Converting from binary to decimal:
//123: one ten hundred place(1*100+2*10+3*1)    11010 --> (1*16+1*8+0*4+1*2+0*1)--go right to left

//Convert Decimal to binary
//Keep dividing by 2
//26/2=13R0
//13/2=6R1
//6/2=3R0
//3/2=1R1
//2/1=0R1
//11010












public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int dec = Integer.parseInt(binary, 2);
//while dec/2!=0
//
        return dec;

    }



    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
