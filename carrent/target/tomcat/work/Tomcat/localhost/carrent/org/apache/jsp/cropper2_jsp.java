/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-01-04 12:01:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cropper2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>头像截取上传demo</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui_ext/easyCropper/cropper.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/downloadShowFile.action?path=/default/defaultUserFaceImg.jpg\" id=\"preFace\">\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">头像</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("        <input type=\"text\" name=\"head\" lay-verify=\"required\" id=\"inputimgurl\" placeholder=\"图片地址\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("        <div class=\"layui-upload-list\" style=\"margin:0\">\r\n");
      out.write("            <img src=\"123.jpg\" id=\"srcimgurl\" class=\"layui-upload-img\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-input-inline layui-btn-container\" style=\"width: auto;\">\r\n");
      out.write("        <button class=\"layui-btn layui-btn-primary\" id=\"editimg\">修改图片</button >\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-mid layui-word-aux\">头像的尺寸限定150x150px,大小在50kb以内</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    layui.extend({\r\n");
      out.write("        croppers: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui_ext/cropper/cropper' //layui自定义layui组件目录\r\n");
      out.write("    }).use(['form','croppers'], function () {\r\n");
      out.write("        var $ = layui.jquery\r\n");
      out.write("            ,form = layui.form\r\n");
      out.write("            ,croppers = layui.croppers\r\n");
      out.write("            ,layer= layui.layer;\r\n");
      out.write("\r\n");
      out.write("        //创建一个头像上传组件\r\n");
      out.write("        croppers.render({\r\n");
      out.write("            elem: '#editimg'\r\n");
      out.write("            ,saveW:150     //保存宽度\r\n");
      out.write("            ,saveH:150\r\n");
      out.write("            ,mark:1/1    //选取比例\r\n");
      out.write("            ,area:'900px'  //弹窗宽度\r\n");
      out.write("            ,url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/uploadUserFace.action'  //图片上传接口返回和（layui 的upload 模块）返回的JOSN一样\r\n");
      out.write("            ,fixed: 'mf'\r\n");
      out.write("            ,done: function(url){ //上传完毕回调\r\n");
      out.write("                $(\"#inputimgurl\").val(url);\r\n");
      out.write("                $(\"#srcimgurl\").attr('src',url);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
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