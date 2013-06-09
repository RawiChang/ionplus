import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Cal {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			cal.setTime(new Date());
			System.out.println(sdf.format(cal.getTime()));
			cal.add(Calendar.DATE, 30);
			System.out.println(sdf.format(cal.getTime()));
	}
}
