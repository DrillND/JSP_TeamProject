/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-08-12 05:50:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.St_005fJoin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class st_005fuserJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("        <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Warm Place_main</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <form action=\"./st_userJoinAction.jsp\"method=\"post\">\r\n");
      out.write("   ");

	// ?????? ?????? ????????? ????????????
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("        <!-- Responsive navbar-->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("            <div class=\"container px-5\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"../St_Join/main.jsp\">Warm Place</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                 <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                 ");

					// ????????? ?????? ????????? ??? ???????????? ??????
					if(userID == null){
				
      out.write("\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"../St_board/login.jsp\">?????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Join/st_userJoin.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Reservation/map.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_board/bbs.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">???????????????</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("				");

				// ???????????? ?????? ?????? ???????????? ???????????? ??????
					}else{
				
      out.write("\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"../St_board/logoutAction.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Join/st_userJoin.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Reservation/map.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_board/bbs.jsp\">????????????</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">???????????????</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    ");

				}
			
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("	    <!-- ???????????? ??????-->       \r\n");
      out.write("       <section class=\"bg-light py-5\">\r\n");
      out.write("            <div class=\"container px-5 my-5 px-5\">\r\n");
      out.write("                <div class=\"text-center mb-5\">\r\n");
      out.write("                    <h2 class=\"fw-bolder\">Warm Place??? ?????? ?????? ???????????????!</h2>\r\n");
      out.write("                    <p class=\"lead mb-0\">??????????????? ?????????????????????.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row gx-5 justify-content-center\">\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                        <!-- * * * * * * * * * * * * * * *-->\r\n");
      out.write("                        <!-- * * SB Forms Contact Form * *-->\r\n");
      out.write("                        <!-- * * * * * * * * * * * * * * *-->\r\n");
      out.write("                        <!-- This form is pre-integrated with SB Forms.-->\r\n");
      out.write("                        <!-- To make this form functional, sign up at-->\r\n");
      out.write("                        <!-- https://startbootstrap.com/solution/contact-forms-->\r\n");
      out.write("                        <!-- to get an API token!-->\r\n");
      out.write("                        <form id=\"contactForm\" data-sb-form-api-token=\"API_TOKEN\">\r\n");
      out.write("                            <!-- userID input-->\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                 <input class=\"form-control\" name=\"userID\" id=\"userID\" type=\"text\" placeholder=\"Enter your ID...\" data-sb-validations=\"required\" />\r\n");
      out.write("                                 <label for=\"userID\">?????????</label>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"userID:required\">A userID is required.</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- userPassword input-->\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input class=\"form-control\" name=\"userPassword\" id=\"userPassword\" type=\"password\" placeholder=\"Enter your password...\" data-sb-validations=\"required,email\" />\r\n");
      out.write("                                <label for=\"userPassword\">????????????</label>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"password:required\">A password is required.</div>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"password:password\">Password is not valid.</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Name input-->\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input class=\"form-control\" name=\"name\" id=\"name\" type=\"text\" placeholder=\"Enter your name...\" data-sb-validations=\"required\" />\r\n");
      out.write("                                <label for=\"name\">??????</label>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"name:required\">A name is required.</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Email address input-->\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input class=\"form-control\" name=\"email\" id=\"email\" type=\"email\" placeholder=\"name@example.com\" data-sb-validations=\"required,email\" />\r\n");
      out.write("                                <label for=\"email\">????????? ??????</label>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"email:required\">An email is required.</div>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"email:email\">Email is not valid.</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                         \r\n");
      out.write("                            <!-- Phone number input-->\r\n");
      out.write("                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                <input class=\"form-control\" name=\"number\" id=\"phonenumber\" type=\"phonenumber\" placeholder=\"(123) 456-7890\" data-sb-validations=\"required\" />\r\n");
      out.write("                                <label for=\"phonenumber\">?????????</label>\r\n");
      out.write("                                <div class=\"invalid-feedback\" data-sb-feedback=\"phonenumber:required\">A phone number is required.</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("                            <!-- ?????? ????????? ?????? ?????????-->\r\n");
      out.write("                            <!---->\r\n");
      out.write("                            <!-- This is what your users will see when the form-->\r\n");
      out.write("                            <!-- has successfully submitted-->\r\n");
      out.write("                            <div class=\"d-none\" id=\"submitSuccessMessage\">\r\n");
      out.write("                                <div class=\"text-center mb-3\">\r\n");
      out.write("                                    <div class=\"fw-bolder\">Form submission successful!</div>\r\n");
      out.write("                                    To activate this form, sign up at\r\n");
      out.write("                                    <br />\r\n");
      out.write("                                    <a href=\"https://startbootstrap.com/solution/contact-forms\">https://startbootstrap.com/solution/contact-forms</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- ?????? ?????? ?????????-->\r\n");
      out.write("                            <!---->\r\n");
      out.write("                            <!-- This is what your users will see when there is-->\r\n");
      out.write("                            <!-- an error submitting the form-->\r\n");
      out.write("                            <div class=\"d-none\" id=\"submitErrorMessage\"><div class=\"text-center text-danger mb-3\">Error sending message!</div></div>\r\n");
      out.write("                            <!--????????? ??????!  -->\r\n");
      out.write("                            <div class=\"d-grid gap-3 d-sm-flex justify-content-sm-center\">\r\n");
      out.write("							<input class=\"btn btn-outline-primary\" type=\"submit\" value=\"????????????\">\r\n");
      out.write("							<input class=\"btn btn-outline-primary\" type=\"reset\" value=\"????????????\"></div>\r\n");
      out.write("			\r\n");
      out.write("		</form>\r\n");
      out.write("		\r\n");
      out.write("                 \r\n");
      out.write("                     \r\n");
      out.write("                       <div><br></div>\r\n");
      out.write("        \r\n");
      out.write("     <!-- ??????????????? ?????? -->   \r\n");
      out.write("     <form action=\"./UseStunDB.jsp\" method=\"post\">\r\n");
      out.write("     <div class=\"d-grid gap-3 d-sm-flex justify-content-sm-center\">\r\n");
      out.write("     <input class=\"btn btn-outline-primary\" type=\"submit\" value=\"??????????????????\"></div>\r\n");
      out.write("	 </form>\r\n");
      out.write("  <div><br></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- ????????????r-->\r\n");
      out.write("    \r\n");
      out.write("        <footer class=\"py-5 bg-dark\">\r\n");
      out.write("            <div class=\"container px-5\"><p class=\"m-0 text-center text-white\">Copyright &copy; Worm Place 2021</p></div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- Bootstrap core JS-->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"js/scripts.js\"></script>\r\n");
      out.write("        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\r\n");
      out.write("        <!-- * *                               SB Forms JS                               * *-->\r\n");
      out.write("        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->\r\n");
      out.write("        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\r\n");
      out.write("        <script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\r\n");
      out.write("    </body>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
