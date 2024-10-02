package Practice;

public class Employee {
    private  String name;

    private int retirementAge;


    Employee(String name,int retirementAge){
        this.name = name;
        this.retirementAge= retirementAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRetirementAge() {
        return retirementAge;
    }

    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    @Override
    public String toString(){
        return "name " + name + " retirementAge " + retirementAge;
    }

}
