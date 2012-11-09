
public class TestBean{
    public static void main (String[] args){
	FlexibleDateTimeBean  ftime = new FlexibleDateTimeBean();
	String str;

	ftime.setSelect(1);
	str = ftime.getDate();
	System.out.println (str);

	ftime.setSelect(2);
	str = ftime.getDate();
	System.out.println (str);

	ftime.setSelect(3);
	str = ftime.getDate();
	System.out.println (str);
    }
}