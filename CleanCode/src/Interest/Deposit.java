package Interest;

public class Deposit implements SimpleInterest, CompoundInterest {
    private double principleAmount;
    private int timeInterval;
    private double rateOfInterest;


    Deposit(double principleAmount, int timeInterval, double rateOfInterest){
        this.principleAmount = principleAmount;
        this.timeInterval = timeInterval;
        this.rateOfInterest = rateOfInterest;
    }


    public double comPoundInterest() {
        return (principleAmount * Math.pow(( 1 + rateOfInterest/100.0 ), timeInterval));
    }

    public double simpleInterest() {
        return (this.principleAmount*this.timeInterval*this.rateOfInterest)/100;
    }
}