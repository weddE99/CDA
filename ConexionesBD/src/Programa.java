import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Programa {
	public static void main(String[] args) {
		Connection con = null;
		ControladorBD metodospool = new ControladorBD();
		
		String SSQL1 = "SELECT avg(s.salary), t.title FROM salaries AS s \r\n" + 
				"		INNER JOIN employees AS e ON e.emp_no = s.emp_no\r\n" + 
				"		INNER JOIN titles AS t ON e.emp_no = t.emp_no \r\n" + 
				"       WHERE t.title = \"Senior Engineer\"";
		 
            try {
				con = metodospool.dataSource.getConnection();
				PreparedStatement lectura = con.prepareStatement(SSQL1);
	            ResultSet leer = lectura.executeQuery();
	            
	            System.out.println("Connection OK!\n");
	            while(leer.next()) {
	            	System.out.println("Promedio de sueldos: $"+leer.getString(1)+" - "+leer.getString(2));	
	            }
	            lectura.close();
			} catch (SQLException e) {
				System.out.println("ERROR Connection!\n");
				e.printStackTrace();
			}
    }
}
