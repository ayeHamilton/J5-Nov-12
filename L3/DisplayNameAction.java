// ------------ Begin: DisplayNameAction.java -------------
package salesdept;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class DisplayNameAction extends Action
{
    public ActionForward execute (ActionMapping mapping,
                                                ActionForm actionForm,
                                                HttpServletRequest request,
                                                HttpServletResponse response)
    {
        NameActionForm form = (NameActionForm)actionForm;
        form.setFullName();
        return mapping.findForward("success");
    }
}
// ------------ End: DisplayNameAction.java --------------