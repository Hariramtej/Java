package School_management_system;

public class Teacher{
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void recievedSalary(int salary){
    salaryEarned += salary;
    School.updateTotalMoneySpent(salary);
    }

    public String toString(){
        return "Name of the Teacher: " + name + "\nTotal salary earned so far $" + salaryEarned;
    }
}