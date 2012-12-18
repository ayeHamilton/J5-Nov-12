// ------------ Begin: NameActionForm.java ----------------------
package salesdept;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class NameActionForm extends ActionForm
{
    private String firstName;
    private String lastName;
    private String fullName;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return fullName; }
    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }
    public void setLastName( String lastName ) {this.lastName = lastName;}
    public void setFullName()
    {
        fullName = firstName + " " + lastName;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
	ActionErrors errors = null;

	if ( firstName == null || firstName.trim().equals("") )
	    {
		if ( errors == null ) errors = new ActionErrors();
		errors.add("firstName", new ActionMessage("firstNameError"));
	    }
	if ( lastName == null || lastName.trim().equals("") )
	    {
		if ( errors == null ) errors = new ActionErrors();
		errors.add("lastName", new ActionMessage("lastNameError"));
	    }
	return errors;
    }
}
// ------------ End: NameActionForm.java ----------------------