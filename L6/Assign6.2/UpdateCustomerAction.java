// ------------ Start: UpdateCustomerAction.java-------------

package salesdept;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import java.sql.*;

public class UpdateCustomerAction extends Action {

    public ActionForward execute (ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws  ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

	CustomerInfoActionForm form = (CustomerInfoActionForm) actionForm;
	String customerId = form.getCustomerId();
	String firstName  = form.getFirstName();
	String lastName  = form.getLastName();
	String age  = form.getAge();
	String orderValue  = form.getOrderValue();

	System.out.println ("InsertCustomerAction: " + customerId);

	//Copy to a cust object
	CustomerDBObject cust = new CustomerDBObject();
	cust.setCustomerId(Integer.parseInt(customerId));
	cust.setFirstName (firstName);
	cust.setLastName (lastName);
	cust.setAge (Integer.parseInt(age));
	cust.setOrderValue (Double.parseDouble(orderValue));

	//Update the DB
	CustomerDBProcess custDBProcess = new CustomerDBProcess();
	custDBProcess.updateCustomer(cust);

	return mapping.findForward("success");

    }
}
// ------------ End: UpdateCustomerAction.java-------------