package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Students_AL {
    public static void main(String[] args) {
        Student s1 = new Student("joy","1");
        Student s2 = new Student("joyce","2");
        Student s3 = new Student("mary","3");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();



    }
}
