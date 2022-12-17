package oop;

public class MainOop {
    public static void main(String[] args) {
        Manager manager=new Manager("John Doe",1,"1983","Toronto");
        System.out.println(manager.toString());
        manager.receiveSalary();
        manager.fired();
        manager.hired();
    }
}
