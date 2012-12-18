// ------------ Begin: DisplayCustomerListAction.java ------------
package salesdept;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class DisplayCustomerListAction extends Action
{
    public ActionForward execute (ActionMapping mapping,
                                                ActionForm actionForm,
                                                HttpServletRequest request,
                                                HttpServletResponse response )
            throws ClassNotFoundException, InstantiationException,
                        IllegalAccessException, SQLException
    {
        CustomerDBProcess custDBProcess = new CustomerDBProcess();
        List custList = custDBProcess.getCustomerList();
        request.setAttribute("customerList", custList);
        return mapping.findForward("success");
    }
}
// ------------ End: DisplayCustomerListAction.java ----------------