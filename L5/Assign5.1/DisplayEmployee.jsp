<!-- Begin: DisplayEmployeeName.jsp -->
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>

<html:html>
    <BODY>
	<TABLE>
	    <TR>
		<TD>First Name:</TD>
		<TD><bean:write name="EmployeeForm"
					    property="firstName"/></TD>
	    </TR>

	    <TR>
		<TD>Last Name:</TD>
		<TD><bean:write name="EmployeeForm"
					    property="lastName"/></TD>
	    </TR>
	    <TR>
		<TD>Full Name:</TD>
		<TD><bean:write name="EmployeeForm"
					    property="fullName"/></TD>
	    </TR>
	    <TR>
		<TD>Age:</TD>
		<TD><bean:write name="EmployeeForm"
					    property="age"/></TD>
	    </TR>
	    <TR>
		<TD>Salary:</TD>
		<TD><bean:write name="EmployeeForm"
					    property="salary"/></TD>
	    </TR>

	</TABLE>
    </BODY>
</html:html>
<!-- End: DisplayEmployeeName.jsp -->