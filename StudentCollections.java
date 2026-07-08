import java.util.*;

public class StudentCollections {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        // HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // HashSet
        HashSet<String> courses = new HashSet<>();

        try {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Student age must be 18 or above.");
            }

            System.out.print("Enter Marks: ");
            int score = sc.nextInt();
            sc.nextLine();

            students.add(name);
            marks.put(name, score);

            courses.add("Java");
            courses.add("Python");
            courses.add("Java");   // Duplicate won't be added

            System.out.println("\n===== Student List =====");
            System.out.println(students);

            System.out.println("\n===== Student Marks =====");
            System.out.println(marks);

            System.out.println("\n===== Courses =====");
            System.out.println(courses);

        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter valid numeric values.");
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        finally {
            System.out.println("\nProgram Finished.");
        }

        sc.close();
    }
}