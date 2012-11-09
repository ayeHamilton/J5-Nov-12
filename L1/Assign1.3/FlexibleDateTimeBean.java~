// ------------ Begin: CurrentDateTimeBean.java ----------------------
package datetime;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class CurrentDateTimeBean
{
    private boolean dateOnly;
    public boolean isDateOnly() { return dateOnly; }
    public void setDateOnly( boolean dateOnly ) { this.dateOnly = dateOnly; }

    public String getDate()
    { 
        SimpleDateFormat dateOnlyFormat = new SimpleDateFormat("MMM dd yyyy");
        Date today = new Date();
        if ( dateOnly )
        {
            return dateOnlyFormat.format(today);
        }
        else return today.toString();
    }
}
// ------------ End: CurrentDateTimeBean.java ----------------------