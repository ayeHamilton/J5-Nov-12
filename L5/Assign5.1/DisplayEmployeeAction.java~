// ------------ Begin: DisplayEmployeeAction.java -------------
package hrdept;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class DisplayEmployeeAction extends Action
{
    public ActionForward execute (ActionMapping mapping,
						ActionForm actionForm,
						HttpServletRequest request,
						HttpServletResponse response)
    {
	String errorMsg = "";
	EmployeeActionForm form = (EmployeeActionForm)actionForm;
	if (form.getFirstName().equals ("")){
	    form.setErrorMessages("  First Name cannot be empty");
	}
	
	if (form.getLastName().equals ("")){
	    form.setErrorMessages("  Last Name cannot be empty");
	}

	if (form.getSalary().equals ("0")){
	    form.setErrorMessages("  Salary must be greater than zero");
	}

	if (form.getAge().equals ("0")){
	    form.setErrorMessages("  Age cannot be zero");
	}
	form.setFullName();
	return mapping.findForward("success");
    }
}
// ------------ End: DisplayEmployeeAction.java --------------