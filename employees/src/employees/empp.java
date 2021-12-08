package employees;
class empp {

    int id;
    String name;
    int salary;

    public empp() {

        this.id = 10;
        this.name = "shubham";
        this.salary = 5000;

    }

    public empp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("emp id" + id);
        System.out.println("name is " + name);
        System.out.println("sal" + salary);
    }



}

class salesman extends empp {
    int incentive;

    public salesman() {
        super();// intiliztion
        this.incentive = 500;
        System.out.println("the moon");

        // TODO Auto-generated constructor stub
    }

    public salesman(int id, String name, int salary, int inc) {
        super(id, name, salary);
        this.incentive = inc;
        System.out.println("the sun");

        // TODO Auto-generated constructor stub
    }

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    void display() {
        super.display();
        System.out.println(this.incentive);
    }
    public static void main(String[] args) {
        empp s1 = new empp();
        s1.display();
        salesman s2 = new salesman();

    }


}