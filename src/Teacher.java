public class Teacher {

    private String firstName;
    private String lastName;
    private int age;

    private Student student;


    public Teacher(String firstName, String lastName, int age, Student student) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.student = student;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Student getStudent() {
        return student;
    }

    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}
