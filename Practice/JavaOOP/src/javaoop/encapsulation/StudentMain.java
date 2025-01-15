package javaoop.encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setName("Marufur Rahman");
        obj1.setAge(26);
        System.out.println("Name is: "+ obj1.getName());
        System.out.println("Age is: "+ obj1.getAge());
    }
}
