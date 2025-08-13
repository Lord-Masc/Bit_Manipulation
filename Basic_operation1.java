public class Basic_operation1 {

    //Even or Odd
    public static void PrintNumber(int n) {
        int bitmap = 1;
        if ((n & bitmap) == 0) {
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        PrintNumber(6);
        
    }
}
