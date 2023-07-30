public class Main {
    public static void main(String[] args) {

        Student student = new Student("Serhii", "Riabovol", 30);
        Teacher teacher = new Teacher("Vasyl", "Petrov", 30, student);

        //Change the teacher's age
        teacher.setAge(100);
// Print the result
        System.out.println("Student:");
        System.out.println("Fitstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());
        System.out.println("Age: " + student.getAge());

        System.out.println("\nTeacher:");
        System.out.println("Firstname: " + teacher.getFirstName());
        System.out.println("Lastname: " + teacher.getLastName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Student: " + teacher.getStudent().getFirstname() + " " + teacher.getStudent().getLastname());




    }
}