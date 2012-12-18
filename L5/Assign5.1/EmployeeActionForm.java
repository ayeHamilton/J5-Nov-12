// ------------ Begin: EmployeeActionForm.java ----------------------
package hrdept;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class EmployeeActionForm extends ActionForm
{
    private String firstName;
    private String lastName;
    private String fullName;
    private String age;
    private String salary;
    private String errorMessages=" ";

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return fullName; }
    public String getAge() { return age; }
    public String getSalary() { return salary; }
    //    public String getErrorMessages() { return errorMessages; }
    public void setFirstName( String firstName )
    {
	this.firstName = firstName;
    }
    public void setLastName( String lastName ) {this.lastName = lastName;}
    public void setFullName()
    {
	fullName = firstName + " " + lastName;
    }
    public void setAge(String age) { this.age = age; }
    public void setSalary(String sal) { this.salary = sal;}
    //    public void setErrorMessages(String errorMsg){ this.errorMessages += errorMsg; }

    public ActionErrors validate (ActionMapping mapping, HttpServletRequest request){
	ActionErrors errors = null;

	if (firstName == null || firstName.trim().equals("")){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("firstName", new ActionMessage("firstNameError"));
	}

	if (lastName == null || lastName.trim().equals("")){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("lastName", new ActionMessage("lastNameError"));
	}

	if (age == null || age.trim().equals("0") || age.length() == 0){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("age", new ActionMessage("ageError"));
	}

	if (salary == null || salary.trim().equals("0") || salary.length() == 0){
	    if (errors == null) errors = new ActionErrors();
	    errors.add("salary", new ActionMessage("salaryError"));
	}

	if (salary != null && salary.length() != 0) {
	    if (Double.parseDouble(salary) < 0.0){
		if (errors == null) errors = new ActionErrors();
		errors.add("salary", new ActionMessage("salaryError"));
	    }
	}
	
	return errors;
    }
}
// ------------ End: EmployeeActionForm.java ----------------------
