<!-- Begin: CustomerInfo.jsp -->
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>

<html:html>
<BODY>

<logic:equal name="mode" value="input"> 
    <FONT COLOR=red>
    <html:errors/>
    </FONT>

    <html:form action="/Assign6.1/insertcustomer">
	<TABLE>
	    <TR>
		<TD>Customer Inp ID:</TD>
		<TD><html:text property="customerId" size="16" readonly="true"/></TD>
	    </TR>
	    <TR>
		<TD>First Name:</TD>
		<TD><html:text property="firstName" size="16"/></TD>
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
</logic:equal>

<logic:equal name="mode" value="displayOnly">
	<TABLE>
            <TR> <TD> Added a new customer with following: <TD> </TR>
	    <TR>
		<TD COLSPAN=2>Customernot ID:</TD>
		<TD><bean:write name="CustomerInfoForm"  property="customerId"/></TD>
	    </TR>
	    <TR>
		<TD>First Name:</TD>
		<TD><bean:write name="CustomerInfoForm"  property="firstName"/></TD>
		<TD>Last Name:</TD>
		<TD><bean:write name="CustomerInfoForm"  property="lastName"/></TD>

	    </TR>
	    <TR>
		<TD>Age:</TD>
		<TD><bean:write name="CustomerInfoForm"  property="age"/></TD>
		<TD>Order Value ($):</TD>
		<TD><bean:write name="CustomerInfoForm"  property="orderValue"/></TD>
	    </TR>
            <TR>
               <TD>
                <html:link page="/Assign6.1/inputcustomer.do">Add a new customer</html:link>
               </TD>
            </TR>
            <TR>
               <TD>
                  <html:link page="/exer/customerlist.do">List all customers</html:link>
               </TD>
            </TR>
         </TABLE>

</logic:equal>
</BODY>
</html:html>
<!-- End: CustomerInfo.jsp -->