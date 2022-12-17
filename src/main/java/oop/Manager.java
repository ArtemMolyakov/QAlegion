package oop;

public class Manager extends Employee {
    public Manager(String name, int id, String dob, String address) {
        super(name, id,Const.MANAGER_TITLE, dob, Const.MANAGER_SALARY, address);
    }public void hired(){
        System.out.println("The employee "+ name+ " hired Bob");}
        public void fired(){
        System.out.println("The employee "+ name+ " fired Sara");
    }
}
