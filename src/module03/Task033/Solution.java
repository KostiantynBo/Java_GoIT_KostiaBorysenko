package module03.Task033;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Course course1 = new Course(new Date(),"GoJava1");
        Course course2 = new Course(new Date(),"GoJava2");
        Course course3 = new Course(new Date(),"GoJava3");
        Course course4 = new Course(4,"Костя");
        Course course5 = new Course(5,"Юля");
        Student student = new Student("Костя", "Борисенко", 3);
        Student student1 = new Student("Juli", "Pen", 4, new Course[4], 30);
        Student collegeStudent = new CollegeStudent("Koly","Ivanov", 6);
        Student collegeStudent1 = new CollegeStudent("Koly","Ivanov", 6, new Course[9], 47);
        Student collegeStudent2 = new CollegeStudent("Koly","Ivanov", 6, new Course[9], 47, "Bristol", 1, 122345);
        SpecialStudent specialStudent = new SpecialStudent("Kostia","Kotesto",8);
        SpecialStudent specialStudent1 = new SpecialStudent("Lima", "Feldman", 9, new Course[10], 67);
        SpecialStudent specialStudent2 = new SpecialStudent("Koly","Ivanov", 6, new Course[9], 47, "Bristol", 1, 122345, 678);

    }
}
