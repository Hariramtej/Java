package School_management_system;

public class Student {

    private int id;
    private String name;
    private int feesPaid;
    private int feesTotal;
    private int grade;

    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    public void updateFeesPaid(int fees){
        feesPaid = fees;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    public String toString(){
        return "Student's name : " + name + "\nTotal fees paid so far $" + feesPaid;
    }
}