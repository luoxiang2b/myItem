/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-11-07 02:25:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html;UTF-8;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"loginHtml\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>登录</title>\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("\t<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/favicon.ico\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui/css/layui.css\" media=\"all\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/public.css\" media=\"all\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"loginBody\">\n");
      out.write("\t<form class=\"layui-form\">\n");
      out.write("\t\t<div class=\"login_face\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/face.jpg\" class=\"userAvatar\"></div>\n");
      out.write("\t\t<div class=\"layui-form-item input-item\">\n");
      out.write("\t\t\t<label for=\"userName\">用户名</label>\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"请输入用户名\" autocomplete=\"off\" id=\"userName\" class=\"layui-input\" lay-verify=\"required\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"layui-form-item input-item\">\n");
      out.write("\t\t\t<label for=\"password\">密码</label>\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"请输入密码\" autocomplete=\"off\" id=\"password\" class=\"layui-input\" lay-verify=\"required\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"layui-form-item input-item\" id=\"imgCode\">\n");
      out.write("\t\t\t<label for=\"code\">验证码</label>\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"请输入验证码\" autocomplete=\"off\" id=\"code\" class=\"layui-input\">\n");
      out.write("\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/code.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t<button class=\"layui-btn layui-block\" lay-filter=\"login\" lay-submit>登录</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"layui-form-item layui-row\">\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"seraph icon-qq layui-col-xs4 layui-col-sm4 layui-col-md4 layui-col-lg4\"></a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"seraph icon-wechat layui-col-xs4 layui-col-sm4 layui-col-md4 layui-col-lg4\"></a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"seraph icon-sina layui-col-xs4 layui-col-sm4 layui-col-md4 layui-col-lg4\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui/layui.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"login.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/cache.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
