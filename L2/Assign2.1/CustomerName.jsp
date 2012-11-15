<!-- Begin: CustomerName.jsp -->
<%@ taglib uri="/WEB-INF/tlds/salesdept.tld" prefix="customer" %>

<HTML>
<BODY>
    <TABLE>
        <TR>
          <TD> First Name: </TD>
          <TD> <customer:customernametag nameType="1"/> </TD
        </TR>
        <TR>
          <TD> Last Name:</TD>
          <TD> <customer:customernametag nameType="2"/> </TD
        </TR>
        <TR>
          <TD> Full Name:</TD>
          <TD> <customer:customernametag nameType="3"/> </TD
        </TR>

    </TABLE>
</BODY>
</HTML>
<!-- End: CustomerName.jsp -->
