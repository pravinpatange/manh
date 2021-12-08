class emp {



    int id;
    String name;
    int salary;

    public emp() {

        this.id=10;
        this.name= "shubham";
        this.salary=5000;

    }
    public emp(int id,String name,int salary)
    {
        this. id =id;
        this.name= name;
        this.salary= salary;
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


    class salesman extends emp{
        int incentive;

        public salesman() {
            super();// intiliztion
            this.incentive =500;
            System.out.println("the moon");



            // TODO Auto-generated constructor stub
        }

        public salesman(int id, String name, int salary,int inc) {
            super(id, name, salary);
            this.incentive=inc;
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
    }





    void display() {
        System.out.println("emp id"+id);
        System.out.println("name is "+name);
        System.out.println("sal"+salary);
    }
    public static void main(String[] args)
    {
        emp s1 =new emp();
        s1.display();
        salesman s2 =new salesman();





    }
}