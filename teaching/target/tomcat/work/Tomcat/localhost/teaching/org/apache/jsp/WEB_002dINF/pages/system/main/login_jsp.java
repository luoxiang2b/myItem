/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-01-28 05:50:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.system.main;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"loginHtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>登录页面</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/favicon.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"loginBody\">\r\n");
      out.write("<form class=\"layui-form\" id=\"loginForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login.action\" method=\"post\">\r\n");
      out.write("    <div class=\"layui-form-item input-item\" style=\"margin-top: 40px\">\r\n");
      out.write("        <label for=\"userName\">用户名</label>\r\n");
      out.write("        <input type=\"text\" placeholder=\"请输入用户名\" autocomplete=\"off\" id=\"userName\" name=\"username\" class=\"layui-input\" lay-verify=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-item input-item\">\r\n");
      out.write("        <label for=\"password\">密码</label>\r\n");
      out.write("        <input type=\"password\" placeholder=\"请输入密码\" autocomplete=\"off\" id=\"password\" name=\"password\" class=\"layui-input\" lay-verify=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-item input-item\" id=\"imgCode\">\r\n");
      out.write("        <label for=\"code\">验证码</label>\r\n");
      out.write("        <input type=\"text\" placeholder=\"请输入验证码\" name=\"code\" autocomplete=\"off\" id=\"code\" lay-verify=\"required\" lay-verType=\"msg\" class=\"layui-input\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/getCode.action\" onclick=\"this.src=this.src+'?'\">\r\n");
      out.write("    </div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <button class=\"layui-btn layui-block\" lay-filter=\"login\" lay-submit>登录</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"layui-form-item layui-row\">\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/cache.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form','layer','jquery'],function(){\r\n");
      out.write("        var form = layui.form,\r\n");
      out.write("            layer = parent.layer === undefined ? layui.layer : top.layer\r\n");
      out.write("        $ = layui.jquery;\r\n");
      out.write("\r\n");
      out.write("        // 验证不清楚的提示\r\n");
      out.write("        layer.tips('验证码看不清？点击切换', '#code');\r\n");
      out.write("\r\n");
      out.write("        //登录按钮\r\n");
      out.write("        form.on(\"submit(login)\",function(data){\r\n");
      out.write("            $(this).text(\"登录中...\").attr(\"disabled\",\"disabled\").addClass(\"layui-disabled\");\r\n");
      out.write("            setTimeout(function(){\r\n");
      out.write("                $('#loginForm').submit();\r\n");
      out.write("            },1000);\r\n");
      out.write("            return false;\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        //表单输入效果\r\n");
      out.write("        $(\".loginBody .input-item\").click(function(e){\r\n");
      out.write("            e.stopPropagation();\r\n");
      out.write("            $(this).addClass(\"layui-input-focus\").find(\".layui-input\").focus();\r\n");
      out.write("        })\r\n");
      out.write("        $(\".loginBody .layui-form-item .layui-input\").focus(function(){\r\n");
      out.write("            $(this).parent().addClass(\"layui-input-focus\");\r\n");
      out.write("        })\r\n");
      out.write("        $(\".loginBody .layui-form-item .layui-input\").blur(function(){\r\n");
      out.write("            $(this).parent().removeClass(\"layui-input-focus\");\r\n");
      out.write("            if($(this).val() != ''){\r\n");
      out.write("                $(this).parent().addClass(\"layui-input-active\");\r\n");
      out.write("            }else{\r\n");
      out.write("                $(this).parent().removeClass(\"layui-input-active\");\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
