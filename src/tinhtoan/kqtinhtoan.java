package tinhtoan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class kqtinhtoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public kqtinhtoan() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String a=request.getParameter("numbera");
		String b=request.getParameter("numberb");
		
		if(request.getParameter("cong")!=null)
		{
			 out.print(Double.parseDouble(a) + Double.parseDouble(b));
		}
		else
			if(request.getParameter("tru")!=null)
			{
				out.print(Double.parseDouble(a) - Double.parseDouble(b));
			}
			else
				if(request.getParameter("nhan")!=null)
				{
					out.print(Double.parseDouble(a) * Double.parseDouble(b));
				}
				else
				{
					out.print(Double.parseDouble(a) / Double.parseDouble(b));
				}
		
	}

}
