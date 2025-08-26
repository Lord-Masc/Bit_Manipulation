public class Count_1 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        while(num!= 0 ){
            if ((num&1)==1) {
               sum++; 
            }
            num = num>>1;
        }
        System.out.println(sum);
    }
}
