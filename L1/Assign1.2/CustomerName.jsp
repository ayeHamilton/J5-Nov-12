<!-- Begin: CustomerName.jsp -->
<jsp:useBean id="customernamebean" class="salesdept.CustomerNameBean" scope="page"/>
<jsp:setProperty name="customernamebean" property="firstName" />
<jsp:setProperty name="customernamebean" property="lastName" />
<HTML>
<BODY>
    <TABLE>
        <TR>
            <TD>First Name:</TD>
            <TD><jsp:getProperty name="customernamebean" property="firstName"/></TD>
        </TR>
        <TR>
            <TD>Last Name:</TD>
            <TD><jsp:getProperty name="customernamebean" property="lastName"/></TD>
        </TR>
        <TR>
            <TD>Full Name:</TD>
            <TD><jsp:getProperty name="customernamebean" property="name"/></TD>
        </TR>
    </TABLE>
</BODY>
</HTML>
<!-- End: CustomerName.jsp -->