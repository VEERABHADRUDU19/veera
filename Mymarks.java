import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Mymarks extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Mymarks() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String htno=request.getParameter("htno");
		String name=request.getParameter("name");
		int maths=Integer.parseInt(request.getParameter("maths"));
		int phys=Integer.parseInt(request.getParameter("phys"));
		int chem=Integer.parseInt(request.getParameter("chem"));
		int result =(maths+phys+chem)*100/300;
		out.println(htno);
		out.println(name);
		out.println(result);
		
		
	}

}
