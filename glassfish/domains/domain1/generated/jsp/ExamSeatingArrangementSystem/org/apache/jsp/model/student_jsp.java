package org.apache.jsp.model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.*;
import java.util.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	Student student = new Student();
	String emp_id = "0";
	if((request.getParameter("act")).equals("Save"))
	{
		HashMap results = new HashMap();
		
		results.put("student_course_id",request.getParameter("student_course_id"));
		results.put("student_rollno",request.getParameter("student_rollno"));
		results.put("student_name",request.getParameter("student_name"));
		results.put("student_father_name",request.getParameter("student_father_name"));
		results.put("student_dob",request.getParameter("student_dob"));
		results.put("student_mobile",request.getParameter("student_mobile"));
		results.put("student_details",request.getParameter("student_details"));
		results.put("student_id",request.getParameter("student_id"));	
                results.put("student_belief",request.getParameter("student_belief"));
		
						
		if((request.getParameter("student_id")).equals(""))
		{
			out.println(student.saveStudent(results));
			response.sendRedirect("../report-student.jsp?msg=Student Saved Successfully");
		}
		else
		{
			results.put("student_id",request.getParameter("student_id"));
			out.println(student.updateStudent(results));
			response.sendRedirect("../report-student.jsp?msg=Student Updated Successfully");
		}			
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
