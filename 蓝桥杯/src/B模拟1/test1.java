package B模拟1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class test1 {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
//		
//
//		 Calendar calendar = Calendar.getInstance();
//
//		 String time="2019-04-04 15:53:53" ;
//		 String time2="2019-04-04 14:53:52" ;
//		 Calendar cal=Calendar.getInstance();
//		 Date date=cal.getTime();
//		 System.out.println(date);
//		 
//		 SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//
//		 String now=sd.format(new Date());
//		 System.out.println(now);
//		 System.out.println(date);
//		 Date newdate=sd.parse(time);
//		 Date date2=sd.parse(time2);
//		 System.out.println((newdate.getTime()-date2.getTime())/1000/60);
       Calendar calendar=Calendar.getInstance();
       System.out.println(calendar.get(Calendar.MONTH));
       

       
	}

}
