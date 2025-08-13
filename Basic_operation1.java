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

    public static int iThBit(int n , int i){
        int bitmap = 1<<i;
        if((n&bitmap)==0){
            return 0;
        }else return 1;
    }

    public static int setIthBit(int n, int i ){
        int bitMap = 1<<i;
        return n|bitMap;
    }

    public static int  clearBit(int n, int i){
        int bitMap = ~(1<<i);
        return n&bitMap;
    }

    public static void main(String[] args) {
        PrintNumber(6);
        System.out.println(iThBit(7, 1));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearBit(10, 1));
        
    }
}
