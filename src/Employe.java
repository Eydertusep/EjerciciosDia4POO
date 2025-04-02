public class Employe {
    String name;
    String jobTitle;
    double salary;

    public Employe (String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(" The employe " + name + " is still working in the position " + jobTitle + " with the salary " + salary + "$" + " hours");
    }
}
