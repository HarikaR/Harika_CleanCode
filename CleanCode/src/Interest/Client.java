package Interest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Client {
    public static void main(String[] args) {
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        Deposit deposit = new Deposit(20000.0, 5, 6.8);
        double simpleInterest = deposit.simpleInterest();
        double compoundInterest = deposit.comPoundInterest();
        out.println("Simple Interest is: " + simpleInterest);
        out.println("Compound Interest is: " + compoundInterest);
        out.close();
    }
}