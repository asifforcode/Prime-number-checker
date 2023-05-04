import java.util.Scanner;


public class chap3Alpha {
    public static void main(String[] args) {


       // Check number is prime or not

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        if(num==2){
            System.out.println(num +"is a prime number");
        }
        else {
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(num);i++) {
                if (num % i == 0) {
                    isprime = false;
                }
            }


                    if (isprime == true) {
                        System.out.println(num + " is a prime number");
                    } else {

                        System.out.println(num + " is not a prime number");
                    }
                }
            }





    }

