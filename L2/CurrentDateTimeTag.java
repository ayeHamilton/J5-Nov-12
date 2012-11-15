// -------------- Begin: CurrentDateTimeTag.java --------------------------
package datetime;

import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class CurrentDateTimeTag extends TagSupport
{
    public int doStartTag() throws JspException
    {
        JspWriter out = pageContext.getOut(); 
        Date today = new Date();
        try 
        {
            out.print( today.toString() );
        }
        catch ( IOException ex )
        {
            throw new JspTagException ("CurrentDateTimeTag: " + ex.getMessage() );
        }
        return SKIP_BODY;
    }
}
// -------------- End: CurrentDateTimeTag.java -------------------------- 