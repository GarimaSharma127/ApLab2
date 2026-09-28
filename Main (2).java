/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        int n=2;
        boolean isPrime=true;
        if (n<=1) {
            isPrime=false;
        } else {
            for (int i=2;i*i<=Math.sqrt(n);i++) {
                if (n% i==0) {
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("prime number");
        }else {
            System.out.println("not a prime number");
        }
    }
}
	    
