/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-12-11 06:46:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadProgress_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>上传文件进度条</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-progress layui-progress-big\" lay-filter=\"demo\" lay-showPercent=\"true\">\r\n");
      out.write("    <div class=\"layui-progress-bar\" lay-percent=\"0%\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-upload\">\r\n");
      out.write("    <button type=\"button\" class=\"layui-btn layui-btn-normal\" id=\"test8\">选择文件</button>\r\n");
      out.write("    <button type=\"button\" class=\"layui-btn\" id=\"test9\">开始上传</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['jquery', 'upload', 'element', 'layer'], function () {\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        var upload = layui.upload;\r\n");
      out.write("        var element = layui.element;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("\r\n");
      out.write("        //选完文件后不自动上传\r\n");
      out.write("        upload.render({\r\n");
      out.write("            elem: '#test8'\r\n");
      out.write("            ,url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/upload.action' //改成您自己的上传接口\r\n");
      out.write("            ,auto: false\r\n");
      out.write("            ,progress: function(n, elem){\r\n");
      out.write("                alert();\r\n");
      out.write("                var percent = n + '%' //获取进度百分比\r\n");
      out.write("                element.progress('demo', percent); //可配合 layui 进度条元素使用\r\n");
      out.write("\r\n");
      out.write("                //以下系 layui 2.5.6 新增\r\n");
      out.write("                console.log('好子'); //得到当前触发的元素 DOM 对象。可通过该元素定义的属性值匹配到对应的进度条。\r\n");
      out.write("                alert();\r\n");
      out.write("            }\r\n");
      out.write("            ,field: 'mf'\r\n");
      out.write("            ,accept: 'file'\r\n");
      out.write("            ,bindAction: '#test9'\r\n");
      out.write("            ,done: function(res){\r\n");
      out.write("                layer.msg('上传成功');\r\n");
      out.write("                console.log(res)\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
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
