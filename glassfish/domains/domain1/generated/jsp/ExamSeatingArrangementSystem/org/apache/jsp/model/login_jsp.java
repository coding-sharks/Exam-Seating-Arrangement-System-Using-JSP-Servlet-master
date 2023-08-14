package org.apache.jsp.model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

	Login login_obj = new Login();
	Employee employeeDetails = new Employee();
	
	if((request.getParameter("act")).equals("chk_login"))
	{
		if(login_obj.checkLogin(request.getParameter("login_user"),request.getParameter("login_password")))
		{
			HashMap Values =  login_obj.getLoginDetails(request.getParameter("login_user"),request.getParameter("login_password"));
			
			HashMap employeeValues =  employeeDetails.getEmployeeDetails(Integer.parseInt(Values.get("login_emp_id").toString()));
			session.setAttribute("login_id",Values.get("login_id"));
			session.setAttribute("login_emp_id",Values.get("login_emp_id"));
			session.setAttribute("login_user",Values.get("login_user"));
			session.setAttribute("login_level",Values.get("login_level"));
                        System.out.println("my level"+Values.get("login_level"));
			session.setAttribute("login_name",employeeValues.get("employee_first_name")+" "+employeeValues.get("employee_last_name"));
			response.sendRedirect("../login-home.jsp?msg=You are login successfully.");
		}
		else
		{
			response.sendRedirect("../login.jsp?msg=Invalid User/Password. Please try again.........");			
		}
	}
	if((request.getParameter("act")).equals("change_password"))
	{		
		if(login_obj.changePassword(request.getParameter("old_password"),request.getParameter("new_password"),Integer.parseInt((String) session.getAttribute("login_id"))))
		{
			response.sendRedirect("../change-password.jsp?msg=Your Password has been changed successfully.");
		}
		else
		{
			response.sendRedirect("../change-password.jsp?msg=Old Password doesnot match. Please try again......");			
		}
	}
	if((request.getParameter("act")).equals("logout"))
	{
		session.setAttribute("login_id",null);
		session.setAttribute("login_level",null);
		response.sendRedirect("../login.jsp?msg=You are logout successfully......");			
	}

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
