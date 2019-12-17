package sql_pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

public class MySqlClass implements ActionListener {
    Date dt;
    public MySqlClass() {}

    public void getDbSysdate() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "iizergin", "iizergin");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select 2 from dual");
            while (rs.next())
                System.out.println(rs.getInt(1));
            con.close();

        } catch (Exception e) {
            System.out.println("err " + e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("q "+ new Date());
    }
}
