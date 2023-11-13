package Basics;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num= 5451;
        int temp=num;
        int s = 0,r=0;

        while(num>0){

            s=s*10+(num%10);
            num=num/10;

        }
        if (s==temp){
            System.out.println("palindrom");
        }
        else
            System.out.println("not palin");
    }
}
