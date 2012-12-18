<!-- Begin: EditCustomer.jsp -->
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>

<html:html>
<BODY>
    <html:form action="/Assign6.2/updatecustomer">
	<TABLE>
	    <TR>
		<TD>Customer ID:</TD>
		<TD><html:text property="customerId" size="16" readonly="true"/></TD>
		<TD><bean:write name="CustomerInfoForm"  property="customerId"/></TD>
	    </TR>
	    <TR>
		<TD>First Name:</TD>
		<TD><html:text property="firstName" size="16"/></TD>
		<TD><bean:write name="CustomerInfoForm"  property="firstName"/></TD>

		<TD>Last Name:</TD>
		<TD><html:text property="lastName" size="16"/></TD>
	    </TR>
	    <TR>
		<TD>Age:</TD>
		<TD><html:text property="age" size="16"/></TD>
		<TD>Order Value ($):</TD>
		<TD><html:text property="orderValue" size="16"/></TD>
	    </TR>
	    <TR>
		<TD ALIGN="CENTER" COLSPAN=2><html:submit/></TD>
	    </TR>
	</TABLE>
    </html:form>
</BODY>
</html:html>
<!-- End: EditCustomer.jsp -->