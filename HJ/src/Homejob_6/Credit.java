package Homejob_6;

public class Credit {
    double creditBody;
    double monthlyInterest;
    int period;
    int monthlyPayment;
    String creditorName;
    String lenderName;

    public Credit(double creditBody,int monthlyPayment,double monthlyInterest, int period, String creditorName, String lenderName) {
        this.creditBody = creditBody;
        this.monthlyInterest = monthlyInterest;
        this.period = period;
        this.creditorName = creditorName;
        this.lenderName = lenderName;
        this.monthlyPayment = monthlyPayment;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getCreditBody() {
        return creditBody;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public int getPeriod() {
        return period;
    }

    public String getCreditorName() {
        return creditorName;
    }



    public String getLenderName() {
        return lenderName;
    }

    public void setCreditBody(double creditBody) {
        this.creditBody = creditBody;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    public void setMonthlyInterest(double monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double calcRest(double monthlyInterest, double monthlyPayment, double creditBody) {
        double rest = (creditBody - monthlyPayment)+(creditBody - monthlyPayment)*monthlyInterest;
     return rest;
    }
}
