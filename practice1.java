public class practice1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ "-> "+(i>>1));
        }
        
        // System.out.println(5>>1);
        // System.out.println(6>>1);
        // System.out.println(7>>1);
        // System.out.println(8>>1);
        System.out.println(0 ^ 1 ^ 3 ^ 3);
        int x = 121;
        int rev = 0;
        while(x!=0){
            int k = x%10;
            rev = rev*10+k;
            x/=10;
        }
        System.out.println(rev);
    }
}
