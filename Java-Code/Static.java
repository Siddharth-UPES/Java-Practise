import java.util.*;
class University {
    static class Faculty {
        void display() {
            System.out.println("Faculty data (Static Nested Class) does not depend on a University instance.");
        }
    }
    class InnerFaculty {
        void display() {
            System.out.println("Inner class requires an instance of University.");
        }
    }
}
public class Static {
    public static void main(String[] args) {
        University.Faculty faculty = new University.Faculty();
        faculty.display();

        System.out.println("Static Nested Class works fine. Inner Class demonstration is commented.");
    }
}
