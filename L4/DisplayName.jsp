<!-- Begin: DisplayName.jsp -->
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>

<html:html>
    <BODY>
        <TABLE>
            <TR>
                <TD>First Name:</TD>
                <TD><bean:write name="NameForm"
                                            property="firstName"/></TD>
            </TR>
            <TR>
                <TD>Last Name:</TD>
                <TD><bean:write name="NameForm"
                                            property="lastName"/></TD>
            </TR>
            <TR>
                <TD>Full Name:</TD>
                <TD><bean:write name="NameForm"
                                            property="fullName"/></TD>
            </TR>
        </TABLE>
    </BODY>
</html:html>
<!-- End: DisplayName.jsp -->