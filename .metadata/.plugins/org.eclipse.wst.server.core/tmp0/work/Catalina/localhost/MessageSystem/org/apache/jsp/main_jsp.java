/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.100
 * Generated at: 2020-03-08 10:01:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.MemberDTO;
import java.util.ArrayList;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Forty by HTML5 UP</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\r\n");
      out.write("<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		MemberDTO info = (MemberDTO) session.getAttribute("info");
	
      out.write("\r\n");
      out.write("\t<!-- Wrapper -->\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t<header id=\"header\" class=\"alt\"> <a href=\"index.html\"\r\n");
      out.write("\t\t\tclass=\"logo\"><strong>Forty</strong> <span>by HTML5 UP</span></a> <nav>\r\n");
      out.write("\r\n");
      out.write("\t\t");

			if (info == null) {
				out.print("<a href=#menu>로그인</a>");
			} else {
				out.print("<a href=update.jsp>회원정보수정</a>");
				out.print("<a href=LogoutService>로그아웃</a>");
			}
		
      out.write(" <!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오. -->\r\n");
      out.write("\t\t</nav> </header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Menu -->\r\n");
      out.write("\t\t<nav id=\"menu\">\r\n");
      out.write("\t\t<ul class=\"links\">\r\n");
      out.write("\t\t\t<li><h5>로그인</h5></li>\r\n");
      out.write("\t\t\t<form action=\"loginService.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t<li><input name=\"email\" type=\"text\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("\t\t\t\t<li><input name=\"pw\" type=\"password\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"submit\" value=\"LogIn\" class=\"button fit\"></li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"actions vertical\">\r\n");
      out.write("\t\t\t<li><h5>회원가입</h5></li>\r\n");
      out.write("\t\t\t<form action=\"joinService.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t<li><input name=\"email\" type=\"text\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("\t\t\t\t<li><input name=\"pw\" type=\"password\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("\t\t\t\t<li><input name=\"tel\" type=\"text\" placeholder=\"전화번호를 입력하세요\"></li>\r\n");
      out.write("\t\t\t\t<li><input name=\"address\" type=\"text\" placeholder=\"집주소를 입력하세요\"></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"submit\" value=\"JoinUs\" class=\"button fit\"></li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!-- Banner -->\r\n");
      out.write("\t\t<section id=\"banner\" class=\"major\">\r\n");
      out.write("\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t<header class=\"major\"> ");

 	if (info == null) {
 		out.print("<h1>로그인을 해주세요</h1>");
 	} else {
 		out.print("<h1>" + info.getEmail() + "님 환영합니다~</h1>");
 	}
 
      out.write(" </header>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t아래는 지금까지 배운 웹 기술들입니다.<br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#one\" class=\"button next scrolly\">확인하기</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- One -->\r\n");
      out.write("\t\t\t<section id=\"one\" class=\"tiles\"> <article> <span\r\n");
      out.write("\t\t\t\tclass=\"image\"> <img src=\"images/pic01.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</span> <header class=\"major\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"link\">HTML</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>홈페이지를 만드는 기초 언어</p>\r\n");
      out.write("\t\t\t</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"images/pic02.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</span> <header class=\"major\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"link\">CSS</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>HTML을 디자인해주는 언어</p>\r\n");
      out.write("\t\t\t</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"images/pic03.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</span> <header class=\"major\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"link\">Servlet/JSP</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>\r\n");
      out.write("\t\t\t</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"images/pic04.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</span> <header class=\"major\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"link\">JavaScript</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>\r\n");
      out.write("\t\t\t</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"images/pic05.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</span> <header class=\"major\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"link\">MVC</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>\r\n");
      out.write("\t\t\t</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"images/pic06.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</span> <header class=\"major\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"link\">Web Project</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>\r\n");
      out.write("\t\t\t</header> </article> </section>\r\n");
      out.write("\t\t\t<!-- Two -->\r\n");
      out.write("\t\t\t<section id=\"two\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t<header class=\"major\">\r\n");
      out.write("\t\t\t\t<h2>나에게 온 메세지 확인하기</h2>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t\t\t<li>로그인을 하세요.</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"button next scrolly\">전체삭제하기</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Contact -->\r\n");
      out.write("\t\t<section id=\"contact\">\r\n");
      out.write("\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<div class=\"field half first\">\r\n");
      out.write("\t\t\t\t\t<label for=\"name\">Name</label> <input type=\"text\" id=\"name\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"보내는 사람 이름\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"field half\">\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email</label> <input type=\"text\" id=\"email\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"보낼 사람 이메일\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t<label for=\"message\">Message</label>\r\n");
      out.write("\t\t\t\t\t<textarea id=\"message\" rows=\"6\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t\t\t<li><input type=\"submit\" value=\"Send Message\" class=\"special\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><input type=\"reset\" value=\"Clear\" /></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section class=\"split\"> <section>\r\n");
      out.write("\t\t\t<div class=\"contact-method\">\r\n");
      out.write("\t\t\t\t<span class=\"icon alt fa-envelope\"></span>\r\n");
      out.write("\t\t\t\t<h3>Email</h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">로그인 한 사람의 이메일을 출력</a>\r\n");
      out.write("\t\t\t\t<!-- 로그인 한 사용자의 이메일을 출력하시오 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</section> <section>\r\n");
      out.write("\t\t\t<div class=\"contact-method\">\r\n");
      out.write("\t\t\t\t<span class=\"icon alt fa-phone\"></span>\r\n");
      out.write("\t\t\t\t<h3>Phone</h3>\r\n");
      out.write("\t\t\t\t<span>로그인 한 사람의 전화번호를 출력</span>\r\n");
      out.write("\t\t\t\t<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</section> <section>\r\n");
      out.write("\t\t\t<div class=\"contact-method\">\r\n");
      out.write("\t\t\t\t<span class=\"icon alt fa-home\"></span>\r\n");
      out.write("\t\t\t\t<h3>Address</h3>\r\n");
      out.write("\t\t\t\t<span>로그인 한 사람의 집주소를 출력</span>\r\n");
      out.write("\t\t\t\t<!-- 로그인 한 사용자의 집주소를 출력하시오 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</section> </section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Footer -->\r\n");
      out.write("\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t<ul class=\"icons\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-twitter\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"label\">Twitter</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-facebook\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"label\">Facebook</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-instagram\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"label\">Instagram</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-github\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"label\">GitHub</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon alt fa-linkedin\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"label\">LinkedIn</span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"copyright\">\r\n");
      out.write("\t\t\t\t<li>&copy; Untitled</li>\r\n");
      out.write("\t\t\t\t<li>Design: <a href=\"https://html5up.net\">HTML5 UP</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\r\n");
      out.write("\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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