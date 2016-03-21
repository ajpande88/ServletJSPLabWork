

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.Data;

/**
 * Servlet implementation class Testing
 */

public class Testing extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
    //	request.getRequestDispatcher("jsp1.jsp").forward(request, response);
    //	MessageBo message=new MessageBo("Today is Monday");
    //	RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher("/jsp1.jsp");
    //	request.setAttribute("message",message);
    //	requestDispatcher.forward(request, response);
    
    Data d1=new Data("name1",new Date(),"Description1",1,1);
    
    
    Data d2=new Data("name2",new Date(),"Description1",2,2);
   
    
    Data d3=new Data("name3",new Date(),"Description1",3,3);
    
    Data d4=new Data("name4",new Date(),"Description4",4,4);
   ArrayList<Data> list=new ArrayList<Data>();
    list.add(d1);
    list.add(d2);
    list.add(d3);
    list.add(d4);
    RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher("/jsp1.jsp");
    request.setAttribute("list",list);
    requestDispatcher.forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("username");  
	    String p=request.getParameter("userpass");  
	          
	    if(validate(n, p)){  
		//	response.getWriter().append("Welcome ").append(a);
            out.println("Welcom "+n);
	    }  
	    else{  
	        out.print("Bad Login");  
	        
	    }  
	          
	    out.close();  
	    }

	private boolean validate(String n, String p) {
		// TODO Auto-generated method stub
		return n.equals("ajay")&&p.equals("ajay");
	}  
}
