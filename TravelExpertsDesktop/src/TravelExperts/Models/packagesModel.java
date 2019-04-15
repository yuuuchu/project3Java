package TravelExperts.Models;
import TravelExperts.DBLoginConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.ParseException;
import  java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
/*
packageModel class manage the packages(add, update and delete the packages).
Author: Muhammad Islam
Created: April, 2019

 */

public class packagesModel {
    //Declare Instance Variables
    int PackageId;
    String PkgName;
    String PkgStartDate;
    String PkgEndDate;
    String PkgDesc;
    double PkgBasePrice;
    double AgencyComm;


    //Non parameterized constructor
    public packagesModel(){}

    public packagesModel(int packageId){
        this.PackageId=packageId;
    }

    //Parameterized constructor
    public packagesModel(int PackageId, String pkgName,String pkgStartDate,String pkgEndDate,String pkgDesc,
                         double pkgBasePrice,double agencyComm)
    {
        this.PackageId=PackageId;
        this.PkgName=pkgName;
        this.PkgStartDate=pkgStartDate;
        this.PkgEndDate=pkgEndDate;
        this.PkgDesc=pkgDesc;
        this.PkgBasePrice=pkgBasePrice;
        this.AgencyComm=agencyComm;
    }

    public int getPackageId() {
        return PackageId;
    }

    public void setPackageId(int packageId) {
        PackageId = packageId;
    }

    // All the setters and getters functions go here
    public String getPkgName() {
        return PkgName;
    }

    public void setPkgName(String pkgName) {
        PkgName = pkgName;
    }

    public String getPkgStartDate() {
        return PkgStartDate;
    }

    public void setPkgStartDate(String pkgStartDate) {
        PkgStartDate = pkgStartDate;
    }

    public String getPkgEndDate() {
        return PkgEndDate;
    }

    public void setPkgEndDate(String pkgEndDate) {
        PkgEndDate = pkgEndDate;
    }

    public String getPkgDesc() {
        return PkgDesc;
    }

    public void setPkgDesc(String pkgDesc) {
        PkgDesc = pkgDesc;
    }

    public double getPkgBasePrice() {
        return PkgBasePrice;
    }

    public void setPkgBasePrice(double pkgBasePrice) {
        PkgBasePrice = pkgBasePrice;
    }

    public double getAgencyComm() {
        return AgencyComm;
    }

    public void setAgencyComm(double agencyComm) {
        AgencyComm = agencyComm;
    }

    public void getPackageData(String id){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelexperts","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM PACKAGES WHERE PACKAGEID= '"+id+"'");

            while(rs.next()) {
                setPkgName(rs.getString(1));
                setPkgStartDate(rs.getString(2));
                setPkgEndDate(rs.getString(3));
                setPkgDesc(rs.getString(4));
                setPkgBasePrice(Double.parseDouble(rs.getString(5)));
                setPkgBasePrice(Double.parseDouble(rs.getString(6)));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public boolean insertPackage(){
        boolean updated=false;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelexperts", "root", "");
            String query = "INSERT INTO packages(PkgName,PkgStartDate,PkgEndDate,PkgDesc,PkgBasePrice,PkgAgencyCommission) VALUES(?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, getPkgName());
            preparedStmt.setString(2, getPkgStartDate());
            preparedStmt.setString(3, getPkgEndDate());
            preparedStmt.setString(4, getPkgDesc());
            preparedStmt.setDouble(5,getPkgBasePrice());
            preparedStmt.setDouble(6,getAgencyComm());

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
           // alert.showAndWait();
            System.out.println(e);
        }

        return  updated;

    }

    //Method to update Package
public boolean updatePackage(int pkgId){
    boolean updated=false;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/travelexperts", "root", "");
        String query = "UPDATE packages SET PkgName=?,PkgStartDate=?,PkgEndDate=?,PkgDesc=?,PkgBasePrice=?," +
                "PkgAgencyCommission=? where PackageId= '"+pkgId+"'";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1,getPkgName());
        preparedStmt.setString(2,getPkgStartDate());
        preparedStmt.setString(3,getPkgEndDate());
        preparedStmt.setString(4, getPkgDesc());
        preparedStmt.setDouble(5, getPkgBasePrice());
        preparedStmt.setDouble(6,getAgencyComm());

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

public boolean deletePackage(int pkgId)
{
    boolean deleted=false;

    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/travelexperts", "root", "");
        String query = "Delete From packages where PackageId=?";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt(1,pkgId);

        // execute the java preparedstatement
        preparedStmt.executeUpdate();
        deleted=true;

        con.close();
    }
    catch(Exception e)
    {
        deleted=false;
        // Alert alert = new Alert(Alert.AlertType.INFORMATION);
        // alert.setTitle("Information Dialog");
        // alert.setHeaderText(null);
        // alert.setContentText("No Such Agent Id exists");
        //  alert.showAndWait();
        System.out.println(e);
    }


    return deleted;
}



    //Function get date and convert to compatible format with databas
    public static String  getDate(Date date) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String strDate = sdf.format(date);
        return strDate;
    }

    public ObservableList<packagesModel> loadPackageID() {
        // Observable list for agent data
        ObservableList<packagesModel> data = FXCollections.observableArrayList();
        // Getting the connection
        DBLoginConnection db = new DBLoginConnection();
        Connection Con = db.getConnection();

        try {
            // Getting the agent information
            Statement stmt = Con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PACKAGES");
            // Getting all the information until we are done
            while(rs.next()) {
                data.add(new packagesModel(rs.getInt(1)));
            }
            // Closing the connection
            Con.close();
        } catch (SQLException ex) {
            // Outputting the errors for any error
            ex.printStackTrace();
        }
        return data;
    }

    @Override
    public String toString() {
        return PackageId + "";
    }
}
