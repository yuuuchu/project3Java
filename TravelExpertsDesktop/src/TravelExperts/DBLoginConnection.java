package TravelExperts;

import java.awt.*;
import  java.sql.*;
import java.util.concurrent.ExecutionException;

public class DBLoginConnection {
    Statement stmt;
    Connection con;
    public boolean connectDb(){

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelexperts", "jackie", "123456");
            stmt = con.createStatement();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return true;
    }

    public boolean loginUser(String userName, String pass){
        boolean userFound=false;
        int count=0;
        if(connectDb())
        {
            try {
                //Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT * from users where userName ='"+userName+"'"+" and userPassword ='"
                        +pass+"'");

                while (rs.next())
                {
                    count++;
                }
                con.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            if(count>0)
            {
                userFound=true;
            }

        }

        return userFound;
    }
}
