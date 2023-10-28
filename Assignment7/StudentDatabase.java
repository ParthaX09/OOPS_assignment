import java.util.Scanner;

class DateOfBirth {
    int day;
    int month;
    int year;

    public DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Student {
    int id;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    DateOfBirth dob;
    int[] marks;

    public Student(int id, String firstName, String middleName, String lastName, String gender, DateOfBirth dob, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.marks = marks;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + getFullName() + "\nGender: " + gender + "\nDOB: " + dob.toString() + "\nTotal Marks: " + getTotalMarks();
    }
}

public class StudentDatabase 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("First Name: ");
            String firstName = scanner.next();
            System.out.print("Middle Name: ");
            String middleName = scanner.next();
            System.out.print("Last Name: ");
            String lastName = scanner.next();
            System.out.print("Gender: ");
            String gender = scanner.next();
            System.out.print("Date of Birth (day month year): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            DateOfBirth dob = new DateOfBirth(day, month, year);
            int[] marks = new int[3];
            System.out.print("English Marks: ");
            marks[0] = scanner.nextInt();
            System.out.print("Mathematics Marks: ");
            marks[1] = scanner.nextInt();
            System.out.print("Computer Science Marks: ");
            marks[2] = scanner.nextInt();

            students[i] = new Student(id, firstName, middleName, lastName, gender, dob, marks);
        }

        // Search for a student by ID or name
        System.out.print("Enter ID or name to search: ");
        String searchKey = scanner.next();

        boolean found = false;

        for (Student student : students) {
            if (searchKey.equalsIgnoreCase(String.valueOf(student.id)) || searchKey.equalsIgnoreCase(student.getFullName())) {
                System.out.println("Student found:\n" + student);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
