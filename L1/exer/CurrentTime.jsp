<!-- Begin: CurrentTime.jsp ----->

<jsp:useBean id="datetimebean" class="datetime.CurrentDateTimeBean" scope="page">
    <jsp:setProperty name="datetimebean" property="dateOnly" value="true"/>
</jsp:useBean>

<HTML>
<BODY>
    <TABLE>
        <TR>
            <TD>Today's date is: </TD>
            <TD><jsp:getProperty name="datetimebean" property="date"/></TD>
        </TR>
        <jsp:setProperty name="datetimebean" property="dateOnly" value="false"/>
        <TR>
            <TD>The current time-stamp is: </TD>
            <TD><jsp:getProperty name="datetimebean" property="date"/></TD>
        </TR>
    </TABLE>
</BODY>
</HTML>

<!-- End: CurrentTime.jsp ----->