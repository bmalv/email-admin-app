import java.util.Scanner;

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

        //call a method asking for the department and returns the department
        this.departmentName = setDepartment();
        System.out.println("Department: " + this.departmentName);

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

    //Set the mailbox capacity

    //Set the alternate email

    //Change the password


}
