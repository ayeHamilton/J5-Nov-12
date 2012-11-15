// -------------- Begin: CustomerNameTag.java --------------------------
package salesdept;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class CustomerNameTag extends TagSupport
{
    int nameType;

    public int getNameType() {return nameType;}
    public void setNameType(int nt) { this.nameType = nt;}
    
    public int doStartTag() throws JspException
    {
        JspWriter out = pageContext.getOut();
	ServletRequest request = pageContext.getRequest();
	String fname = request.getParameter("fName");
	String lname = request.getParameter("lName");
	
        try 
        {

	    switch(nameType){
	    case 1:
		out.print (fname);
		break;
	    case 2:
		out.print (lname);
		break;
	    case 3:
    		out.print (fname + " " + lname);
	    }
        }
        catch ( IOException ex )
        {
            throw new JspTagException ("CustomerNameTag: " + ex.getMessage() );
        }
        return SKIP_BODY;
    }
}