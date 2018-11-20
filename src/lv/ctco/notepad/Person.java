package lv.ctco.notepad;

/**
 * Created by v.ustinovicha01 on 11/16/2018.
 */
public class Person {
    private static int counter = 0;
    private int id;
    //2. private int id = ++counter;
    private String firstName;
    private String latsName;
    private String email;

    public Person() {
        counter++;
        id = counter;
       // 1. System.out.println("i am here");
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", latsName='" + latsName + '\'' +
                ", email='" + email + '\'' +
                '}';
                //'}' + counter;
    }

    public int getId() {
        return id;
    }

     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatsName() {
        return latsName;
    }

    public void setLatsName(String latsName) {
        this.latsName = latsName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
