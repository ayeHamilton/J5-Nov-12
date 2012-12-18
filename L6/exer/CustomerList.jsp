<!-- Begin: CustomerList.jsp -->
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<html>
    <head>
        <style>
            .defaultText{font-family:Helvetica,Arial;font-size:9pt;}
            .tableOddRow{font-family:Helvetica,Arial;font-size:9pt;background-color:#E6E6E6}
            .tableEvenRow{font-family:Helvetica,Arial;font-size:9pt;background-color:#FFFFFF}
        </style>
    </head>
    <body>
        <table>
            <tr class="defaultText">
                <td>Customer ID</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Age</td>
                <td>Order Value</td>
            </tr>
            <logic:iterate id="customer" name="customerList">
                <tr class="<bean:write name="customer" property="rowClass"/>">
                    <td><bean:write name="customer" property="customerId"/></td>
                    <td><bean:write name="customer" property="firstName"/></td>
                    <td><bean:write name="customer" property="lastName"/></td>
                    <td><bean:write name="customer" property="age"/></td>
                    <td><bean:write name="customer" property="orderValue"/></td>
                </tr>
            </logic:iterate>
        </table>
    </body>
</html>
<!-- End: CustomerList.jsp -->