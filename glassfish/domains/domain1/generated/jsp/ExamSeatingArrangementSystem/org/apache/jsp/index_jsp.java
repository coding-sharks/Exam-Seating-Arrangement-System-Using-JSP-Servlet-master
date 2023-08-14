package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/slider.jsp");
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
      out.write('\n');
      out.write("<div class=\"wrapper\" style=\"margin-top:-18px\">\n");
      out.write("  <div id=\"slider\">\n");
      out.write("    <div id=\"slide-wrapper\" class=\"rounded clear\"> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <figure id=\"slide-1\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/1.jpg\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-2\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/2.jpg\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-3\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/3.jpg\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-4\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/4.jpg\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <figure id=\"slide-5\"><a class=\"view\" href=\"#\"><img src=\"images/demo/slider/5.png\" alt=\"\"></a>\n");
      out.write("      </figure>\n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <ul id=\"slide-tabs\">\n");
      out.write("        <li><a href=\"#slide-1\">Manage Rooms</a></li>\n");
      out.write("        <li><a href=\"#slide-2\">Manage Floors</a></li>\n");
      out.write("        <li><a href=\"#slide-3\">Manage Seating Plan</a></li>\n");
      out.write("        <li><a href=\"#slide-4\">Manage Students</a></li>\n");
      out.write("        <li><a href=\"#slide-5\">Manage Blocks</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <main class=\"container clear\"> \n");
      out.write("      <!-- main body --> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <div class=\"group btmspace-30\"> \n");
      out.write("        <!-- Left Column -->\n");
      out.write("        <div class=\"one_quarter first\"> \n");
      out.write("          <!-- ################################################################################################ -->\n");
      out.write("          <ul class=\"nospace\">\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">MANAGE ROOMS</em> \n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/1.jpg\" alt=\"\"></a></li>\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">MANAGE BLOCKS</em> \n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/2.jpg\" alt=\"\"></a></li>\n");
      out.write("            <li class=\"btmspace-15\"><a href=\"#\"><em class=\"heading\">MANAGE STUDENTS</em> \n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/3.jpg\" alt=\"\"></a></li>\n");
      out.write("            <li><a href=\"#\"><em class=\"heading\">MANAGE SYSTEM USERS</em> \n");
      out.write("\t\t<img class=\"borderedbox\" src=\"images/demo/slider/4.jpg\" alt=\"\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("          <!-- ################################################################################################ --> \n");
      out.write("        </div>\n");
      out.write("        <!-- / Left Column --> \n");
      out.write("        <!-- Middle Column -->\n");
      out.write("        <div class=\"one_half\" style=\"width:70%\"> \n");
      out.write("          <!-- ################################################################################################ -->\n");
      out.write("          <h2>EXAM SEATING MANAGEMENT SYSTEM</h2>\n");
      out.write("          <ul class=\"nospace listing\">\n");
      out.write("            <li class=\"clear\">\n");
      out.write("              <div class=\"imgl borderedbox\"><img src=\"images/demo/main2.jpg\" alt=\"\"></div>\n");
      out.write("              <p class=\"nospace btmspace-15\"><a href=\"#\">USER MANAGEMENT SYSTEM</a></p>\n");
      out.write("              <p>Today people are accustomed to accessing meaningful information from a huge array of sources. The reality is that workplace learning happens continuously in lots of different ways.</p>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"clear\">\n");
      out.write("              <div class=\"imgl borderedbox\"><img src=\"images/demo/main1.jpg\" alt=\"\"></div>\n");
      out.write("              <p class=\"nospace btmspace-15\"><a href=\"#\">STUDENTS MANAGEMENT SYSTEM</a></p>\n");
      out.write("              <p>The Room Management System runs online, which allows you to access any information from anywhere in the world at any given time, as long as you have Internet access. Manage your employees from anywhere.</p>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"clear\">\n");
      out.write("              <div class=\"imgl borderedbox\"><img src=\"images/demo/main3.jpg\" alt=\"\"></div>\n");
      out.write("              <p class=\"nospace btmspace-15\"><a href=\"#\">SEATS MANAGEMENT SYSTEM</a></p>\n");
      out.write("              <p>Many users have multiple records in this database, either because they hold more than one job title or because their salary is paid out of multiple funding sources.</p>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <!-- ################################################################################################ --> \n");
      out.write("        </div>\n");
      out.write("        <!-- / Middle Column --> \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      \n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("      <!-- / main body -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
