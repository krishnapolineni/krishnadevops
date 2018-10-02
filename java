public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }
}
When you run the program, the output will be:

G.C.D of 81 and 153 is 9
Here, two numbers whose GCD are to be found are stored in n1 and n2 respectively.

Then, a for loop is executed until i is less than both n1 and n2. This way, all numbers between 1 and smallest of the two numbers are iterated to find the GCD.

If both n1 and n2 are divisble by i, gcd is set to the number. This goes on until it finds the largest number (GCD) which divides both n1 and n2 without remainder.

We can also solve this problem using a while loop as follows:

Example 2: Find GCD of two numbers using while loop and if else statement
public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153;

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        System.out.println("G.C.D = " + n1);
    }
}
