/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.khaiBaoLopVaDoiTuong;
import java.util.*;
/**
 *
 * @author Admin
 */
public class danhSachMonThi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCourses = scanner.nextInt();
        scanner.nextLine();
        
        List<Course> courses = new ArrayList<>();
        
        for (int i = 0; i < numCourses; i++) {
            String courseCode = scanner.nextLine();
            String courseName = scanner.nextLine();
            String examType = scanner.nextLine();

            Course course = new Course(courseCode, courseName, examType);
            courses.add(course);
        }

        Collections.sort(courses);

        for (Course course : courses) {
            System.out.println(course.toString());
        }
        
        
    }

    private static class Course implements Comparable<Course>{
        private String courseCode;
        private String courseName;
        private String examType;

        public Course(String courseCode, String courseName, String examType) {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.examType = examType;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getExamType() {
            return examType;
        }

        @Override
        public String toString() {
            return courseCode + " " + courseName + " " + examType;
        }

        @Override
        public int compareTo(Course otherCourse) {
            return this.courseCode.compareTo(otherCourse.getCourseCode());
        }
    }
}
