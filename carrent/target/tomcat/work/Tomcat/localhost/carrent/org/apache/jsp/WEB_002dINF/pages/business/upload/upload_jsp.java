/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-12-22 11:42:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.business.upload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-upload\">\r\n");
      out.write("    <button type=\"button\" class=\"layui-btn layui-btn-normal\" id=\"testList\">选择多文件</button>\r\n");
      out.write("    <div class=\"layui-upload-list\">\r\n");
      out.write("        <table class=\"layui-table\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr><th>文件名</th>\r\n");
      out.write("                <th>大小</th>\r\n");
      out.write("                <th>状态</th>\r\n");
      out.write("                <th>操作</th>\r\n");
      out.write("            </tr></thead>\r\n");
      out.write("            <tbody id=\"demoList\"></tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button type=\"button\" class=\"layui-btn\" id=\"testListAction\">开始上传</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['upload', 'jquery'], function () {\r\n");
      out.write("        var upload = layui.upload;\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("\r\n");
      out.write("        var demoListView = $('#demoList')\r\n");
      out.write("            ,uploadListIns = upload.render({\r\n");
      out.write("            elem: '#testList'\r\n");
      out.write("            ,url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/uploadFiles.action' //改成您自己的上传接口\r\n");
      out.write("            ,accept: 'file'\r\n");
      out.write("            ,field: 'mfs'\r\n");
      out.write("            ,multiple: true\r\n");
      out.write("            ,auto: false\r\n");
      out.write("            ,bindAction: '#testListAction'\r\n");
      out.write("            ,choose: function(obj){\r\n");
      out.write("                var files = this.files = obj.pushFile(); //将每次选择的文件追加到文件队列\r\n");
      out.write("                //读取本地文件\r\n");
      out.write("                obj.preview(function(index, file, result){\r\n");
      out.write("                    var tr = $(['<tr id=\"upload-'+ index +'\">'\r\n");
      out.write("                        ,'<td>'+ file.name +'</td>'\r\n");
      out.write("                        ,'<td>'+ (file.size/1024).toFixed(1) +'kb</td>'\r\n");
      out.write("                        ,'<td>等待上传</td>'\r\n");
      out.write("                        ,'<td>'\r\n");
      out.write("                        ,'<button class=\"layui-btn layui-btn-xs demo-reload layui-hide\">重传</button>'\r\n");
      out.write("                        ,'<button class=\"layui-btn layui-btn-xs layui-btn-danger demo-delete\">删除</button>'\r\n");
      out.write("                        ,'</td>'\r\n");
      out.write("                        ,'</tr>'].join(''));\r\n");
      out.write("\r\n");
      out.write("                    //单个重传\r\n");
      out.write("                    tr.find('.demo-reload').on('click', function(){\r\n");
      out.write("                        obj.upload(index, file);\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    //删除\r\n");
      out.write("                    tr.find('.demo-delete').on('click', function(){\r\n");
      out.write("                        delete files[index]; //删除对应的文件\r\n");
      out.write("                        tr.remove();\r\n");
      out.write("                        uploadListIns.config.elem.next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    demoListView.append(tr);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("            ,done: function(res, index, upload){\r\n");
      out.write("                console.log(res);\r\n");
      out.write("                if(res.data.src){ //上传成功\r\n");
      out.write("                    var tr = demoListView.find('tr#upload-'+ index)\r\n");
      out.write("                        ,tds = tr.children();\r\n");
      out.write("                    tds.eq(2).html('<span style=\"color: #5FB878;\">上传成功</span>');\r\n");
      out.write("                    tds.eq(3).html(''); //清空操作\r\n");
      out.write("                    return delete this.files[index]; //删除文件队列已经上传成功的文件\r\n");
      out.write("                }\r\n");
      out.write("                this.error(index, upload);\r\n");
      out.write("            }\r\n");
      out.write("            ,error: function(index, upload){\r\n");
      out.write("                var tr = demoListView.find('tr#upload-'+ index)\r\n");
      out.write("                    ,tds = tr.children();\r\n");
      out.write("                tds.eq(2).html('<span style=\"color: #FF5722;\">上传失败</span>');\r\n");
      out.write("                tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传\r\n");
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
