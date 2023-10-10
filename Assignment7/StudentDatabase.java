import java.util.Scanner;

class Student {
    int id;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String dob;
    int[] marks;

    public Student(int id, String firstName, String middleName, String lastName, String gender, String dob, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.marks = marks;
    }

    
    public String toString() {
        return "ID: " + id + "\nName: " + firstName + " " + middleName + " " + lastName + "\nGender: " + gender + "\nDOB: " + dob.substring(0,2)+"/"+dob.substring(2,4)+"/"+dob.substring(4,8) + "\nMarks: [English=" + marks[0] + ", Mathematics=" + marks[1] + ", Computer Science=" + marks[2] + "]";
    }
}

public class StudentDatabase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Middle Name: ");
            String middleName = sc.nextLine();
            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Date of Birth (DD/MM/YYYY): ");
            String dob = sc.nextLine();
            System.out.print("Marks in English, Mathematics, Computer Science (space-separated): ");
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) 
                marks[j] = sc.nextInt();


            students[i] = new Student(id, firstName, middleName, lastName, gender, dob, marks);
        }

        System.out.println("\nStudent Database:");
        for (Student student : students) 
            System.out.println("\n" + student);

        sc.close();
    }
}
