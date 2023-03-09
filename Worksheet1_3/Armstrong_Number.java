package Worksheet1_3;

public class Armstrong_Number {
    int num;

    public Armstrong_Number(int x) {
        num = x;
    }
    
    public void Checking_Num() {
        int temp = num;
        int p = 0;
 
        //function to calculate the sum of individual digits
        while (num > 0) {
 
            int rem = num % 10;
            p = (p) + (rem * rem * rem);
            num = num / 10;
        }
 
        /* condition to check whetherf
           the value of P equals
           to user input or not. */
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
    }
    
    
}
