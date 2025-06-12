/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comments;
import java.sql.*;

/**
 *
 * @author semih
 */
public class sqlConnection {
    private String dbUrl = "jdbc:sqlserver://A\\MSSQLSERVER01:52916;databaseName=db_Comments;encrypt=true;trustServerCertificate=true";//1433
    private String userName = "user";
    private String pass = "user123";
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,pass);
    }
    
    public void showErrorMessage(SQLException e){
        System.err.print("Hata : ".concat(e.getMessage()).concat("\n".concat(e.getErrorCode() + "")));
    }
}
