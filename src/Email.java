import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String departmentName;
    private String password;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //call a method asking for the department and returns the department
        this.departmentName = setDepartment();
        System.out.println("Department: " + this.departmentName);

        //call a method to generate a random password
        this.password = genRandomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    //Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
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

    //Set the alternate email

    //Change the password


}
