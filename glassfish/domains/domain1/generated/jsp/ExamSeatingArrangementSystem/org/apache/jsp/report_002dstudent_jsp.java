package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.*;

public final class report_002dstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Exam Seating Arrangement System</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("        <script src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .ui-datepicker {\n");
      out.write("                font-family: \"Trebuchet MS\", \"Helvetica\", \"Arial\",  \"Verdana\", \"sans-serif\";\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("            .ui-datepicker select.ui-datepicker-month, .ui-datepicker select.ui-datepicker-year {\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            jQuery('document').ready(function () {\n");
      out.write("                jQuery(\"#Form\").validate();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        <div class=\"wrapper row0\">\n");
      out.write("            <div id=\"topbar\" class=\"clear\"> \n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        ");
 if (session.getAttribute("login_id") != null) { 
      out.write("\n");
      out.write("                        <li>Welcome ");
 out.print(session.getAttribute("login_name")); 
      out.write("</li>\n");
      out.write("                        <li><a href=\"model/login.jsp?act=logout\">Logout</a></li>\n");
      out.write("                            ");
 } else { 
      out.write("\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about-us.jsp\">About Us</a></li>\n");
      out.write("                        <li><a href=\"contact-us.jsp\">Contact Us</a></li>\n");
      out.write("                        <li><a href=\"login.jsp?title=Adminstrator\">Admin Login</a></li>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper row1\">\n");
      out.write("            <header id=\"header\" class=\"clear\"> \n");
      out.write("                <div id=\"logo\" class=\"fl_left\">\n");
      out.write("                    <div style=\"float:left; margin-top:-11px;\"><h1 style=\"font-size:27px;\"><a href=\"index.jsp\">Exam Seating Arrangement System</a></h1>\n");
      out.write("                        <p style=\"color:#ffffff\">A complete solution to manage seating plan of exam</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fl_right\">\n");
      out.write("                    <form class=\"clear\" method=\"post\" action=\"#\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Search:</legend>\n");
      out.write("                            <input type=\"text\" value=\"\" placeholder=\"Search Here\">\n");
      out.write("                            <button class=\"fa fa-search\" type=\"submit\" title=\"Search\"><em>Search</em></button>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper row2\">\n");
      out.write("            <div class=\"rounded\">\n");
      out.write("                <nav id=\"mainav\" class=\"clear\"> \n");
      out.write("                    <ul class=\"clear\">\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about-us.jsp\">About Us</a></li>\n");
      out.write("                        <!-- Menu System for Super Admin Login -->\n");
      out.write("                        ");
 if (session.getAttribute("login_level") != null && session.getAttribute("login_level").equals("1")) {
      out.write("\n");
      out.write("                        <li><a href=\"employee.jsp?employee_id=");
      out.print(session.getAttribute("login_emp_id"));
      out.write("\">My Account</a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"drop\" >Add New</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"room.jsp?room_id=0\">Add Room</a></li>\n");
      out.write("                                <li><a href=\"floor.jsp?floor_id=0\">Add Floor</a></li>\n");
      out.write("                                <li><a href=\"block.jsp?block_id=0\">Add Block</a></li>\n");
      out.write("                                <li><a href=\"seat.jsp?seat_id=0\">Add Seat</a></li>\n");
      out.write("                                <li><a href=\"student.jsp?student_id=0\">Add Student</a></li>\n");
      out.write("                                <li><a href=\"student_seat.jsp?ss_id=0\">Assing Seat</a></li>\n");
      out.write("                                <li><a href=\"employee.jsp?employee_id=0\">Add User</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\" class=\"drop\" >Reports</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"report-room.jsp\">Rooms Reports</a></li>\n");
      out.write("                                <li><a href=\"report-floor.jsp\">Floor Report</a></li>\n");
      out.write("                                <li><a href=\"report-block.jsp\">Block Report</a></li>\n");
      out.write("                                <li><a href=\"report-seat.jsp\">Seat Report</a></li>\n");
      out.write("                                <li><a href=\"report-student.jsp\">Student Report</a></li>\n");
      out.write("                                <li><a href=\"report-student-seat.jsp\">Assign Seat</a></li>\n");
      out.write("                                <li><a href=\"report-employee.jsp\">Users Reports</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        <!-- End of the Super Admin Menu Section -->\n");
      out.write("\n");
      out.write("                        ");
 if (session.getAttribute("login_level") == null) { 
      out.write("\n");
      out.write("                        <li><a href=\"search-seat.jsp\">Search Seat</a></li><!--ok-->\n");
      out.write("                        <li><a href=\"login.jsp?title=Adminstrator \">User Login</a></li>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                            ");
 if (session.getAttribute("login_level") != null) { 
      out.write("\n");
      out.write("                        <li><a href=\"change-password.jsp\">Change Password</a></li>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        <li><a href=\"contact-us.jsp\">Contact Us</a></li>\n");
      out.write("                            ");
 if (session.getAttribute("login_level") != null) { 
      out.write("\n");
      out.write("                        <li><a href=\"model/login.jsp?act=logout\">Logout</a></li>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	Student studentDetails = new Student();
	ArrayList allStudent = studentDetails.getAllStudent();

      out.write("\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <main class=\"container clear\"> \n");
      out.write("      <!-- main body --> \n");
      out.write("      <div class=\"scrollable\">\n");
      out.write("        <h2>Student Report</h2>\n");
      out.write("\t\t");
 if(request.getParameter("msg") != null) { 
      out.write("\n");
      out.write("\t\t<div class=\"msg\">");
      out.print(request.getParameter("msg") );
      out.write("</div>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("        <table>\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>Roll No</th>\n");
      out.write("              <th>Name</th>\n");
      out.write("              <th>Father Name</th>\n");
      out.write("              <th>Mobile</th>\n");
      out.write("              <th>Date of Birth</th>\n");
      out.write("              <th>Religious belief</th>\n");
      out.write("              <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody>\n");
      out.write("\t\t\t");
 for(int i=0;i<allStudent.size();i++) 
			{ 
				HashMap StudentDetails = new HashMap();
				StudentDetails = (HashMap)allStudent.get(i);
			
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t  <td style=\"text-align:center;\">");
 out.print(StudentDetails.get("student_rollno")); 
      out.write("</td>\n");
      out.write("\t\t\t\t  <td>");
 out.print(StudentDetails.get("student_name")); 
      out.write("</td>\n");
      out.write("\t\t\t\t  <td>");
 out.print(StudentDetails.get("student_father_name")); 
      out.write("</td>\n");
      out.write("\t\t\t\t  <td>");
 out.print(StudentDetails.get("student_mobile")); 
      out.write("</td>\n");
      out.write("\t\t\t\t  <td>");
 out.print(StudentDetails.get("student_dob")); 
      out.write("</td>\n");
      out.write("                                  <td>");
 out.print(StudentDetails.get("student_belief")); 
      out.write("</td>\n");
      out.write("\t\t\t\t  <td>\n");
      out.write("\t\t\t\t  <a href=\"student.jsp?student_id=");
 out.print(StudentDetails.get("student_id")); 
      out.write("\">Edit</a></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- JAVASCRIPTS --> \n");
      out.write("<script src=\"layout/scripts/jquery.fitvids.min.js\"></script> \n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script> \n");
      out.write("<script src=\"layout/scripts/tabslet/jquery.tabslet.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
