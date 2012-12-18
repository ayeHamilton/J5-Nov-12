
// ------------ Begin: CustomerDBObject.java ----------------------
package salesdept;
public class CustomerDBObject
{
    private int customerId;
    private String firstName;
    private String lastName;
    private int age;
    private double orderValue;
    private String rowClass; // CSS style class for current customer  

    public int getCustomerId() { return customerId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public double getOrderValue() { return orderValue; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getRowClass() { return rowClass; }
 
    public void setCustomerId( int customerId ) {this.customerId = customerId;}
    public void setFirstName( String firstName ) {this.firstName = firstName;}
    public void setLastName( String lastName ) { this.lastName = lastName; }
    public void setAge( int age ) { this.age = age; }
    public void setOrderValue( double orderValue )
    {
        this.orderValue = orderValue;
    }
    public void setRowClass( String rowClass ) { this.rowClass = rowClass; }

}
// ------------ End: CustomerDBObject.java ----------------------