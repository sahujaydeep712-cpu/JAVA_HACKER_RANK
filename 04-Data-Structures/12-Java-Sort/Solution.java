import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Problem: Java Sort
 * Domain: Java / Data Structures
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Sort student records according to rules:
 * 1. CGPA in descending order.
 * 2. If CGPA is equal, first name alphabetically.
 * 3. If first names are also equal, ID in ascending order.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
class Student {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();

            Student student = new Student(id, fname, cgpa);
            studentList.add(student);

            testCases--;
        }
        scanner.close();

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Primary: CGPA descending
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }
                // Secondary: Name alphabetically
                if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                }
                // Tertiary: ID ascending
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
