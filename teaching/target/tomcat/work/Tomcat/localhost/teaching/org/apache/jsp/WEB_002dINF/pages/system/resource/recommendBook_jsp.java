/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-02 13:57:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.system.resource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recommendBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>教学参考书推荐</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("<h2 style=\"text-align: center;padding: 20px;\">教学参考书推荐</h2>\r\n");
      out.write("<!-- 数据表格开始 -->\r\n");
      out.write("<table class=\"layui-hide\" id=\"classTable\" lay-filter=\"classTable\"></table>\r\n");
      out.write("<div  id=\"resourceBar\" style=\"display: none;\">\r\n");
      out.write("    <a class=\"layui-btn layui-btn-xs\" lay-event=\"download\">下载</a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 数据表格结束 -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var tableIns;\r\n");
      out.write("    layui.use([ 'jquery', 'layer', 'form', 'table' ,'upload'], function() {\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        var form = layui.form;\r\n");
      out.write("        var table = layui.table;\r\n");
      out.write("\r\n");
      out.write("        //渲染数据表格\r\n");
      out.write("        tableIns=table.render({\r\n");
      out.write("            elem: '#classTable'   //渲染的目标对象\r\n");
      out.write("            ,url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/loadRecommendBook.action' //数据接口\r\n");
      out.write("            ,title: '资料信息数据表'//数据导出来的标题\r\n");
      out.write("            ,height:'full-200'\r\n");
      out.write("            ,cellMinWidth:100 //设置列的最小默认宽度\r\n");
      out.write("            ,page: true  //是否启用分页\r\n");
      out.write("            ,cols: [[   //列表数据\r\n");
      out.write("                {type: 'numbers', fixed: 'left'}\r\n");
      out.write("                ,{field:'id', title:'ID',align:'center', hide: true}\r\n");
      out.write("                ,{field:'name', title:'资源名称',align:'center'}\r\n");
      out.write("                ,{field:'cname', title:'课程名称',align:'center'}\r\n");
      out.write("                ,{field:'sname', title:'分类名称',align:'center'}\r\n");
      out.write("                ,{fixed: 'right', title:'操作', toolbar: '#resourceBar', width:220,align:'center'}\r\n");
      out.write("            ]]\r\n");
      out.write("            ,done: function(res, curr, count) {\r\n");
      out.write("                // res：接口返回的信息\r\n");
      out.write("                // curr：当前页码数\r\n");
      out.write("                // count：数据总记录数\r\n");
      out.write("\r\n");
      out.write("                // 如果不是第一页，并且数据量为0的情况下，就返回上一页\r\n");
      out.write("                if(curr != 1 && res.data.length == 0) {\r\n");
      out.write("                    tableIns.reload({\r\n");
      out.write("                        page: {\r\n");
      out.write("                            curr: curr - 1\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        table.on('tool(classTable)', function(obj){\r\n");
      out.write("            var data = obj.data; //获得当前行数据\r\n");
      out.write("            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）\r\n");
      out.write("            if(layEvent === 'download') { //下载\r\n");
      out.write("                download(data);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //模糊查询\r\n");
      out.write("        $(\"#doSearch\").click(function(){\r\n");
      out.write("            var params=$(\"#searchFrm\").serialize();\r\n");
      out.write("            tableIns.reload({\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/fuzzyQueryResource.action?\"+params,\r\n");
      out.write("                page:{curr:1}\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var url;\r\n");
      out.write("        var mainIndex;\r\n");
      out.write("\r\n");
      out.write("        //保存\r\n");
      out.write("        form.on(\"submit(doSubmit)\",function(obj){\r\n");
      out.write("            //序列化表单数据\r\n");
      out.write("            var params=$(\"#dataFrm\").serialize();\r\n");
      out.write("            $.post(url,params,function(obj){\r\n");
      out.write("                layer.msg(obj.msg);\r\n");
      out.write("                //关闭弹出层\r\n");
      out.write("                layer.close(mainIndex);\r\n");
      out.write("                //刷新数据 表格\r\n");
      out.write("                tableIns.reload();\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function download(data) {\r\n");
      out.write("            console.log(data)\r\n");
      out.write("            // 文件下载不能使用异步请求\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/download.action?path=' + data.path + '&fileName=' + data.name;\r\n");
      out.write("        }\r\n");
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
