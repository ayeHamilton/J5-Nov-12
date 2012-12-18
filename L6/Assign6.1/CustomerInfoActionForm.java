// ------------ Begin: CustomerInfoActionForm.java ----------------------
package salesdept;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class CustomerInfoActionForm extends ActionForm
{
    private String firstName;
    private String lastName;
    private String fullName;
    private String customerId;
    private String age;
    private String orderValue;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return fullName; }
    public String getCustomerId() { return customerId; }
    public String getAge() { return age;}
    public String getOrderValue() { return orderValue;}

    public void setFirstName( String firstName )
    {
	this.firstName = firstName;
    }
    public void setLastName( String lastName ) {this.lastName = lastName;}
    public void setFullName()
    {
	fullName = firstName + " " + lastName;
    }
    public void setCustomerId( String customerId ) {this.customerId = customerId;}
    public void setAge( String age ) {this.age = age;}
    public void setOrderValue( String orderValue ) {this.orderValue = orderValue;}

    public void reset(ActionMapping mapping, HttpServletRequest request){
	this.firstName = "";
	this.lastName = "";
	this.fullName = "";
	this.customerId = "";
	this.age = "";
	this.orderValue = "";
    }

    public ActionErrors validate (ActionMapping mapping, HttpServletRequest request){
	ActionErrors errors= null;

	if (firstName == null || firstName.trim().equals("")){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("firstName", new ActionMessage("firstNameError"));
	    request.setAttribute("mode", "input");

	}

	if (lastName == null || lastName.trim().equals("")){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("lastName", new ActionMessage("lastNameError"));
	    request.setAttribute("mode", "input");

	}

	if (age == null || age.trim().equals("0") || age.length() == 0){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("age", new ActionMessage("ageError"));
	    request.setAttribute("mode", "input");

	}

	if (orderValue == null || orderValue.trim().equals("0") || orderValue.length() == 0){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("orderValue", new ActionMessage("orderValueError"));
	    request.setAttribute("mode", "input");

	}

	if (orderValue != null && orderValue.length() != 0) {
	    if (Double.parseDouble(orderValue) < 0.0){
		if (errors == null) errors = new ActionErrors();
		errors.add("orderValue", new ActionMessage("OrderValueError"));
		request.setAttribute("mode", "input");

	    }
	}
	return errors;
    }
}
// ------------ End: CustomerInfoActionForm.java ----------------------