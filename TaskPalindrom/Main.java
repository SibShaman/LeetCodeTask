package TaskPalindrom;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        int rev=0;
        int i = 0;
        int originalNum = x;

        while(x!=0){
            rev = x % 10;
            i = i*10 + rev;
            x = x / 10;
        }

        if (originalNum>=0 && originalNum == i ){
            return true;
        } else
            return false;
    }
}
