package ClassEndOfYearProject;

public class Expenses {
    private double livingExpenses;
    private double mobility;
    private double health;
    private double otherExpenses;

    public double getLivingExpenses() {
        return livingExpenses;
    }

    public void setLivingExpenses(double livingExpenses) {
        this.livingExpenses = livingExpenses;
    }

    public double getMobility() {
        return mobility;
    }

    public void setMobility(double mobility) {
        this.mobility = mobility;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }
    public void printComment(){
        System.out.println("welcome to DataBase software and the monthly expenses");

    }
}
