package GestioneUtenti;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;

public class userModel {
    private List<User> users = new ArrayList();
    static Connection connection=null;
    public static String JDBC_Driver = null;
    public static String JDBC_URL = null;

/*
    public void selectAll(){
        try{
            String sql="SELECT * from users;";
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            System.out.println(rs.getString(4));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }*/

    public void info(){
        try{
        System.out.println(connection.getClientInfo().toString());
    }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void setConnection(String Driver, String Url) {
        JDBC_Driver = Driver;
        JDBC_URL = Url;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null) {
            if (JDBC_URL == null || JDBC_Driver == null)
                throw new IllegalStateException("Illegale request! Call setConnection before!");
            try {
                Class.forName(JDBC_Driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(JDBC_URL);
            }
        return connection;
    }

    public void close() throws SQLException{
        if(connection!=null)
            connection.close();
    }

    public void insertUser(User user){

        try{
            Statement statement=connection.createStatement();
            String sql=String.format("INSERT INTO users (name,cognome,phonenumber,fiscalcode,nascita) VALUES ('%s','%s','%s','%s','%s');",
                    user.getName(),
                    user.getCognome(),
                    user.getPhoneNumber(),
                    user.getFiscalCode(),
                    user.getNascita().toString());
            statement.executeUpdate(sql);
            statement.close();
            users.add(user);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }




    public String getName(int index) {
        return users.get(index).getName();
    }

    public void setName(String name,int index) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("UPDATE users SET name='%s' where FiscalCode='%s'",name,users.get(index).getFiscalCode()));
            users.get(index).setName(name);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public String getCognome(int index) {
        return users.get(index).getCognome();
    }

    public void setCognome(String cognome, int index) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("UPDATE users SET cognome='%s' where FiscalCode='%s'",cognome,users.get(index).getFiscalCode()));
            users.get(index).setCognome(cognome);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public String getPhoneNumber(int index) {
        return users.get(index).getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber,int index) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("UPDATE users SET phoneNumber='%s' where FiscalCode='%s'",phoneNumber,users.get(index).getFiscalCode()));
            users.get(index).setPhoneNumber(phoneNumber);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public String getFiscalCode(int index) {
        return users.get(index).getFiscalCode();
    }

    public void setFiscalCode(String fiscalCode,int index) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("UPDATE users SET fiscalcode='%s' where FiscalCode='%s'",fiscalCode,users.get(index).getFiscalCode()));
            users.get(index).setFiscalCode(fiscalCode);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public Date getNascita(int index) {
        return users.get(index).getNascita();
    }

    public void setNascita(Date nascita, int index) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("UPDATE users SET nascita='%s' where FiscalCode='%s'",nascita,users.get(index).getFiscalCode()));
            users.get(index).setNascita(nascita);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
