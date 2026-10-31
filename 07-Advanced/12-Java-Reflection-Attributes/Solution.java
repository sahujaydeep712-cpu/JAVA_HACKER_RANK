import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem: Java Reflection - Attributes
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Use Java Reflection API to inspect the Student class, extract all declared
 * method names, sort them alphabetically, and print them.
 *
 * Time Complexity: O(m log m) where m is number of methods
 * Space Complexity: O(m)
 */
class Student {
    private String name;
    private String id;
    private String email;

    public String getName() { return name; }
    public String getId() { return id; }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
}

public class Solution {

    public static void main(String[] args) {
        Class<?> studentClass = Student.class;
        Method[] methods = studentClass.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
