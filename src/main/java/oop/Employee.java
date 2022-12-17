package oop;

public abstract class Employee {
    String name;
    int id;
    String title;
    String dob;
    double salary;
    String address;



    public Employee(String name, int id, String title, String dob, double salary, String address){
        this.name=name;
        this.id=id;
        this.title=title;
        this.dob=dob;
        this.salary=salary;
        this.address=address;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDob() {
        return dob;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString(){
        String txt =String.format("name:%s,id:%d,title:%s,dob:%s,salary:%f,address%s",name,id,title,dob,salary,address);
        return txt;

    }public void receiveSalary(){
        System.out.println("The salary was received by the employer");
    }
}
