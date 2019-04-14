public class Person  // this is a class
{
    private String name;
    private int age;
    private double salary;

    public void saidHello(String n) 
    {
        System.out.println("Hello"+n);
    }
//setter
    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge (int age)
    {
        this.age=age;
    }

    public void setSalary(double)
    {
        this.salary=salary;
    }

    public String getName ()
    {
        return this.name;
    }

    public int getAge ()
    {
        return this.age;
    }

    public double getSalary()
    {
        return this.salary;
    }
}

