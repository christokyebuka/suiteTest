package ClassEndOfYearProject;

public class MonthlyIncome {
    public double january_income;
    public double february_income;
    private double march_income;
    private double april_income;

    public double getJanuary_income() {
        return january_income;
    }

    public void setJanuary_income(double january_income) {
        this.january_income = january_income;
    }

    public double getFebruary_income() {
        return february_income;
    }

    public void setFebruary_income(double february_income) {
        this.february_income = february_income;
    }

    public double getMarch_income() {
        return march_income;
    }

    public void setMarch_income(double march_income) {
        this.march_income = march_income;
    }

    public double getApril_income() {
        return april_income;
    }

    public void setApril_income(double april_income) {
        this.april_income = april_income;
    }
    public void display_income(){
        System.out.println("welcome to database and display of user monthly income");
    }
}
