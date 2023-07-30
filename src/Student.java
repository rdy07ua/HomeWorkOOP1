public class Student {

    private String firstName;

    private String lastName;

    private int age;

    public Student(String firstname, String lastname, int age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    //getters
    public String getFirstname() {

        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //setters

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
