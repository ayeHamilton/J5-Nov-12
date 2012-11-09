// ------------ Begin: FlexibleDateTimeBean.java ----------------------

package datetime;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class FlexibleDateTimeBean
{
    private int selection; 
    public String getDate()
    { 
        SimpleDateFormat dateOnlyFormat = new SimpleDateFormat("MMM dd yyyy");
	SimpleDateFormat timeFormat = new SimpleDateFormat ("HH:mm:ss a");
        Date today = new Date();
	Calendar cal = Calendar.getInstance();
	
	switch (selection) {
	case 1:
	    return dateOnlyFormat.format(today);
	case 2:
	    return timeFormat.format(cal.getTime());
	case 3:
	    return (dateOnlyFormat.format(today) + "  " + timeFormat.format(cal.getTime()));
	}
	return today.toString();
    }
    public void setSelection(int sel){
	this.selection = sel;
    }
    public int getSelection(){
	return (this.selection);
    }
}
// ------------ End: FlexibleDateTimeBean.java ----------------------