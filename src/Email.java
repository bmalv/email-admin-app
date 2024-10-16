import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String departmentName;
    private String password;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String email;
    private String companySuffix = "aeycompany.com";

    public Email(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;

        //call a method asking for the department and returns the department
        this.departmentName = setDepartment();

        //call a method to generate a random password
        this.password = genRandomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departmentName + "." + companySuffix;
    }

    //Ask for department
    private String setDepartment(){
        System.out.print("New worker: " + this.firstName + ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "sales";
        }else if(departmentChoice == 2){
            return "dev";
        }else if(departmentChoice == 3){
            return "acct";
        }
        return "";
    }

    //Generate a random password
    private String genRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i = 0; i < length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }


}
