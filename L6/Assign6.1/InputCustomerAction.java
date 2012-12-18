// ------------ Start: InsertCustomerAction.java-------------

package salesdept;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import java.sql.*;

public class InputCustomerAction extends Action {

    public ActionForward execute (ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws  ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

	String customerId = "";
	CustomerInfoActionForm form = (CustomerInfoActionForm) actionForm;
	CustomerDBProcess custDBProcess = new CustomerDBProcess();
	customerId = custDBProcess.getMaxCustomerId();
	int custid = Integer.parseInt(customerId) + 1;
	customerId = Integer.toString(custid);
	System.out.println ("InputCustomerAction: Sending now" + customerId);
	form.setCustomerId (customerId);
	request.setAttribute("mode", "input");
	return mapping.findForward("success");
    }
}
// ------------ End: InputCustomerAction.java-------------
