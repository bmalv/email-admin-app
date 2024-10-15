public class Email {

    private String firstName;
    private String lastName;
    private String departmentName;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
    }


}
