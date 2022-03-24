import java.util.Scanner;

public class User_Authentication 

{

    public static void main(String args[])

    {

        String username, password;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter username:");//username:user

        username = s.nextLine();

        System.out.print("Enter password:");//password:user

        password = s.nextLine();

<<<<<<< HEAD
        if(username.equals("admin9845") && password.equals("user"))
=======
        if(username.equals("admin") && password.equals("admin"))
>>>>>>> branch 'master' of https://github.com/Dubeyshagun29/Group1.git

        {

            System.out.println("Authentication Successful");

        }

        else

        {

            System.out.println("Authentication Failed");

        }

    }

}
