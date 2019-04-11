package TravelExperts.DB;

import java.sql.*;

/* customerModel class search and update customer based on specific criteria.
* Author: Muhammad Islam
* Created: April, 2019
* */
public class customerModel {
    //Declare Instance variables
    private int CustomerId;
    private String CustFirstName;
    private String CustLastName;
    private String CustAddress;
    private String CustCity;
    private String CustProv;
    private String CustPostal;
    private String CustCountry;
    private String CustHomePhone;
    private String CustBussPhone;
    private String CustEmail;
    private int CustAgent;
    // Constructor with no parameter for search purposes
    public customerModel(){}
    //Parameterized constructor to update specific customer, based on a criteria
    public customerModel(String custFirstName, String custLastName, String custAddress, String custCity, String custProv,
                         String custPostal, String custCountry, String custHomePhone, String custBussPhone, String custEmail, int custAgent)
    {
        //Initialize instance variables
        this.CustFirstName=custFirstName;
        this.CustLastName=custLastName;
        this.CustAddress=custAddress;
        this.CustCity=custCity;
        this.CustProv=custProv;
        this.CustPostal=custPostal;
        this.CustCountry=custCountry;
        this.CustHomePhone=custHomePhone;
        this.CustBussPhone=custBussPhone;
        this.CustEmail=custEmail;
        this.CustAgent=custAgent;
    }
    //All the getters and setters functions go here
    public int getCustAgent() {
        return CustAgent;
    }

    public void setCustAgent(int custAgent) {
        CustAgent = custAgent;
    }

    public String getCustFirstName() {
        return CustFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        CustFirstName = custFirstName;
    }

    public String getCustLastName() {
        return CustLastName;
    }

    public void setCustLastName(String custLastName) {
        CustLastName = custLastName;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String custAddress) {
        CustAddress = custAddress;
    }

    public String getCustCity() {
        return CustCity;
    }

    public void setCustCity(String custCity) {
        CustCity = custCity;
    }

    public String getCustProv() {
        return CustProv;
    }

    public void setCustProv(String custProv) {
        CustProv = custProv;
    }

    public String getCustPostal() {
        return CustPostal;
    }

    public void setCustPostal(String custPostal) {
        CustPostal = custPostal;
    }

    public String getCustCountry() {
        return CustCountry;
    }

    public void setCustCountry(String custCountry) {
        CustCountry = custCountry;
    }

    public String getCustHomePhone() {
        return CustHomePhone;
    }

    public void setCustHomePhone(String custHomePhone) {
        CustHomePhone = custHomePhone;
    }

    public String getCustBussPhone() {
        return CustBussPhone;
    }

    public void setCustBussPhone(String custBussPhone) {
        CustBussPhone = custBussPhone;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    //Method to search a customer based on the criteria
    public void getCustomerData(int id){


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelexperts","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM customers where CustomerId= '"+id+"'");

            while(rs.next())
            {
                setCustFirstName(rs.getString(2));
                setCustLastName(rs.getString(3));
                setCustAddress(rs.getString(4));
                setCustCity(rs.getString(5));
                setCustProv(rs.getString(6));
                setCustPostal(rs.getString(7));
                setCustCountry(rs.getString(8));
                setCustHomePhone(rs.getString(9));
                setCustBussPhone(rs.getString(10));
                setCustEmail(rs.getString(11));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    //Method to update customer based on a criteria
    boolean updateCustData(int custId)
    {
        boolean updated=false;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelexperts", "root", "");
            String query = "UPDATE customers SET CustFirstName=?,CustLastName=?,CustAddress=?,CustCity=?,CustProv=?," +
                    "CustPostal=?,CustCountry=?,CustHomePhone=?,CustBusPhone=?,CustEmail=?"+
           ",AgentId=? where CustomerId= '"+custId+"'";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, getCustFirstName());
            preparedStmt.setString(2, getCustLastName());
            preparedStmt.setString(3, getCustAddress());
            preparedStmt.setString(4, getCustCity());
            preparedStmt.setString(5, getCustProv());
            preparedStmt.setString(6,getCustPostal());
            preparedStmt.setString(7,getCustCity());
            preparedStmt.setString(8,getCustHomePhone());
            preparedStmt.setString(9,getCustBussPhone());
            preparedStmt.setString(10,getCustEmail());
            preparedStmt.setInt(11,getCustAgent());

            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            updated=true;

            con.close();
        }
        catch(Exception e)
        {
            updated=false;
           // Alert alert = new Alert(Alert.AlertType.INFORMATION);
           // alert.setTitle("Information Dialog");
           // alert.setHeaderText(null);
           // alert.setContentText("No Such Agent Id exists");
          //  alert.showAndWait();
            System.out.println(e);
        }

        return  updated;

    }
}

