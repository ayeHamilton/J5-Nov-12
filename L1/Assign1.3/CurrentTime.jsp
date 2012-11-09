<!-- Begin: CurrentTime.jsp ----->
<%@page import="datetime.FlexibleDateTimeBean" %>

<jsp:useBean id="datetimebean" class="datetime.FlexibleDateTimeBean" scope="page">
    <jsp:setProperty name="datetimebean" property="selection" value="1"/>
</jsp:useBean>

<HTML>
<BODY>
    <TABLE>
        <TR>
            <TD>Today's date is: </TD>
            <TD><jsp:getProperty name="datetimebean" property="date"/></TD>
        </TR>
        <jsp:setProperty name="datetimebean" property="selection" value="2"/>
        <TR>
            <TD>The current time is: </TD>
            <TD><jsp:getProperty name="datetimebean" property="date"/></TD>
        </TR>
        <jsp:setProperty name="datetimebean" property="selection" value="3"/>
        <TR>
            <TD>Today's data and time is: </TD>
            <TD><jsp:getProperty name="datetimebean" property="date"/></TD>
        </TR>
    </TABLE>
</BODY>
</HTML>

<!-- End: CurrentTime.jsp ----->