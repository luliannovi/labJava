package GestioneUtenti;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        userModel model=new userModel();
        model.setConnection("org.sqlite.JDBC","jdbc:sqlite://C:/sqlite/UTENTI.db");
        try {
            model.getConnection();
            //model.selectAll();
        }catch(SQLException e){
            e.printStackTrace();
        }

        Date nascita = null;
        User user=new User("Luigi","Annovi","3490098076","NNVLMT011I462Y", nascita);
        model.insertUser(user);
    }
}
