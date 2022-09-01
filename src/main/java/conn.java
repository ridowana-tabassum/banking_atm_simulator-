import java.sql.*; //this a sql package, to connect mysql to java

public class conn {
    Connection c; // global variable
    Statement s;// also global var
    public conn(){ //constructor
        try {   //used try catch here. to catch exception in a program.
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","");
            s=c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
