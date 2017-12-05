package kata5p2.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class MailListReaderDDBB {
    public static List<String> read () throws IOException, ClassNotFoundException, SQLException{
        List<String> mailList = new ArrayList();
        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        
        Statement statement = connection.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM mail;");
        while (rs.next()){
            mailList.add(rs.getString("mail"));
        }
        
        return mailList;
    }

}