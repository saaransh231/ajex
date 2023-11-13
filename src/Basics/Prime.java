package Basics;

public class Prime {
    public static void main(String[] args) {
        int prime = 22;
        int c =0;

        if(prime<=1){
            System.out.println("not prime");
        }

            for(int i = 1; i<=prime/2 ;i++ ) {
                if (prime % i == 0) {
                    c++;
                }
            }

            if(c>1){
                System.out.println("notprime");

        }
            else {
                System.out.println("prime");
            }
        }
    }