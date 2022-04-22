package Lab6;

import java.sql.*;

public class JDBC_server {

    public void run() {
    String connectionURL="jdbc:sqlite://C:/sqlite/SCUOLA.db";
        try{
            Connection connection=DriverManager.getConnection(connectionURL);
            Statement statement=connection.createStatement();
           ResultSet rr=statement.executeQuery("drop table alunni;");
             // ResultSet rs=statement.executeQuery("CREATE table ALUNNI(nome varchar(30),cognome varchar(30));");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JDBC_server a=new JDBC_server();
        a.run();
    }
}




