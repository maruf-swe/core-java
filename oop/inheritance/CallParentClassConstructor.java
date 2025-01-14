package javaoop.inheritance;

class Department {
    String depName;
    int totalFacultyMembers;

    Department(String depName, int totalFacultyMembers) {
        this.depName = depName;
        this.totalFacultyMembers = totalFacultyMembers;
    }

    public void printParentClassObjectDetails() {
        System.out.println("Department name is: " + depName + " and total Faculty Members " + totalFacultyMembers);
    }


}

class Student extends Department {
    String studentName;
    int studentAge;

    Student(String depName, int totalFaculty, String studentName, int studentAge) {
        super(depName, totalFaculty);
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void studentInfo() {
        System.out.println("Student name is " + studentName + " and his age is " + studentAge +
                ". his Department was " + depName + " and their is total faculty " + totalFacultyMembers);
    }
}


public class CallParentClassConstructor {
    public static void main(String[] args) {
        Student st1 = new Student("Software Engineering", 40, " Marufur Rahman", 26);
        st1.studentInfo();

    }
}
