package Rent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
public class RentInput extends HttpServlet {
  private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RentInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().write("Hello, World!");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=UTF-8");

		String outHTML = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>RentInput</title>";
		outHTML += "</head><body><center><h1>貸し出し入力画面</h1></center><form action=\"RentCheck\" method=\"post\">";
		outHTML += "<table align=\"center\">";
		for (int i = 1; i <= 5; i++) {
			outHTML += "<tr><td>貸し出し番号：<input type=\"text\" name=\"kashidasinumber" + i + "\"></td>";
			outHTML += "<td>貸出期間：<select name=\"kashidashi"+ i + "\"><option value=\"1\">当日</option><option value=\"3\">2泊3日</option>";
			outHTML += "<option value=\"8\">一週間</option></select></td></tr>";
		}
		outHTML += "</table><center><input type=\"submit\" value=\"送信\"><input type=\"reset\" value=\"リセット\"></center></form></body></html>";

		response.getWriter().write(outHTML);

	}

}
