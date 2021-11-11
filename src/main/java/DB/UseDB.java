package DB;

import java.sql.Connection;
import java.sql.Connection;
import java.lang.Thread;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class UseDB {
        public static void main(String[] args) throws InterruptedException {
            DBConnector dbc = new DBConnector();
            Connection conn = dbc.getMYSQLConnection("pauline", "Pauline1234", "gruppe4");
            ConnectionUser cu = new ConnectionUser(conn);
            String dato;

        }

}
