// ------------ Begin: CustomerDBProcess.java ----------------------
package salesdept;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
public class CustomerDBProcess
{
    private ResultSet rs;
    private Statement statement;
    // constructor
    public CustomerDBProcess() throws ClassNotFoundException,
                                                        InstantiationException,
                                                        IllegalAccessException,
                                                        SQLException
    {
	String username="root";
	String password="sesame";
	String dbURL="jdbc:mysql://localhost:3306/testdatabase";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection(dbURL, username, password);
        statement = connection.createStatement();
        rs = null;
    }
    // Get all customers' data
    public List<CustomerDBObject> getCustomerList() throws SQLException
    {
        List<CustomerDBObject> custList = null;
        rs = statement.executeQuery("select * from customer");
	String rowClass = "tableEvenRow";
        while (rs.next())
        {
            CustomerDBObject cust = new CustomerDBObject();
            cust.setCustomerId (rs.getInt("customer_id"));
            cust.setAge(rs.getInt("age"));
            cust.setOrderValue(rs.getDouble("order_value"));
            cust.setFirstName(rs.getString("first_name"));
            cust.setLastName(rs.getString("last_name"));
	     // Toggle the CSS style sheet class
        if (rowClass.equals("tableEvenRow"))
        {
            rowClass = "tableOddRow";
        }
        else
        {
            rowClass = "tableEvenRow";
        }
        cust.setRowClass(rowClass);
	    
            if (custList == null) custList = new ArrayList<CustomerDBObject>();
            custList.add(cust);
        }
        return custList;
    }
}
// ------------ End: CustomerDBProcess.java ----------------------
