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

	form.setFullName();
	return mapping.findForward("success");
    }
}
// ------------ End: DisplayEmployeeAction.java --------------