/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-01 14:05:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.system.resource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadResourceManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>资源上传管理</title>\r\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui_ext/dtree/dtree.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui_ext/dtree/font/dtreefont.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("<!-- 搜索条件开始 -->\r\n");
      out.write("<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 20px;\">\r\n");
      out.write("    <legend>查询条件</legend>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<form class=\"layui-form\" method=\"post\" id=\"searchFrm\">\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <div class=\"layui-inline layui-col-md4\">\r\n");
      out.write("            <label class=\"layui-form-label\">上传标题:</label>\r\n");
      out.write("            <div class=\"layui-input-inline\">\r\n");
      out.write("                <input type=\"text\" name=\"name\"  autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-row\" style=\"padding-bottom: 20px;\">\r\n");
      out.write("        <div class=\"layui-col-md3 layui-col-md-offset5\">\r\n");
      out.write("            <button type=\"button\" class=\"layui-btn layui-btn-normal  layui-icon layui-icon-search\" id=\"doSearch\">查询</button>\r\n");
      out.write("            <button type=\"reset\" class=\"layui-btn layui-btn-warm  layui-icon layui-icon-refresh\">重置</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- 搜索条件结束 -->\r\n");
      out.write("\r\n");
      out.write("<!-- 数据表格开始 -->\r\n");
      out.write("<table class=\"layui-hide\" id=\"resourceTable\" lay-filter=\"resourceTable\"></table>\r\n");
      out.write("<div style=\"display: none;\" id=\"resourceToolBar\">\r\n");
      out.write("    <button type=\"button\" class=\"layui-btn layui-btn-sm\" lay-event=\"add\">上传</button>\r\n");
      out.write("</div>\r\n");
      out.write("<div  id=\"resourceBar\" style=\"display: none;\">\r\n");
      out.write("    <a class=\"layui-btn layui-btn-xs\" lay-event=\"edit\">编辑</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"del\">删除</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-normal layui-btn-xs\" lay-event=\"downloadResource\">下载</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-primary layui-btn-xs\" lay-event=\"recommend\">推荐</a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 数据表格结束 -->\r\n");
      out.write("\r\n");
      out.write("<!-- 添加弹出层开始 -->\r\n");
      out.write("<div style=\"display: none;padding: 20px\" id=\"addDiv\" >\r\n");
      out.write("    <form class=\"layui-form\">\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">资源分类:</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <select name=\"sId\" id=\"sid\"></select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">资源标题:</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"resourceName\" placeholder=\"请输入资源上传标题\" autocomplete=\"off\"\r\n");
      out.write("                       class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"button\" class=\"layui-btn layui-btn-normal\" id=\"selectFile\">选择文件</button>\r\n");
      out.write("        <button type=\"button\" class=\"layui-btn\" id=\"upload\">开始上传</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 添加弹出层结束 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"display: none;padding: 20px\" id=\"updateDiv\" >\r\n");
      out.write("    <form class=\"layui-form\" lay-filter=\"dataFrm\" id=\"dataFrm\">\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">资源分类:</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <select name=\"sId\" id=\"sid2\"></select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">资源标题:</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"hidden\" id=\"hiddenId\" name=\"rId\">\r\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"resourceName2\" placeholder=\"请输入资源上传标题\" autocomplete=\"off\"\r\n");
      out.write("                       class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\" style=\"text-align: center;\">\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <button type=\"button\" class=\"layui-btn layui-btn-normal layui-btn-sm layui-icon layui-icon-release\" lay-filter=\"doSubmit\" lay-submit=\"\">提交</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var tableIns;\r\n");
      out.write("    layui.use([ 'jquery', 'layer', 'form', 'table', 'upload'], function() {\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        var form = layui.form;\r\n");
      out.write("        var table = layui.table;\r\n");
      out.write("        var upload = layui.upload;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //渲染数据表格\r\n");
      out.write("        tableIns=table.render({\r\n");
      out.write("            elem: '#resourceTable'   //渲染的目标对象\r\n");
      out.write("            ,url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/loadAllResource.action' //数据接口\r\n");
      out.write("            ,title: '资源数据表'//数据导出来的标题\r\n");
      out.write("            ,toolbar:\"#resourceToolBar\"   //表格的工具条\r\n");
      out.write("            ,height:'full-200'\r\n");
      out.write("            ,cellMinWidth:100 //设置列的最小默认宽度\r\n");
      out.write("            ,page: true  //是否启用分页\r\n");
      out.write("            ,cols: [[   //列表数据\r\n");
      out.write("                {type: 'numbers', fixed: 'left'}\r\n");
      out.write("                ,{field:'id', title:'ID',align:'center', hide: true}\r\n");
      out.write("                ,{field:'name', title:'资源名称',align:'center'}\r\n");
      out.write("                ,{field:'flag', title:'是否推荐',align:'center', templet: function (d) {\r\n");
      out.write("                        return d.flag == 1 ? '<font color=green>是</font>' : '<font color=red>否</font>';\r\n");
      out.write("                    }}\r\n");
      out.write("                ,{field:'cname', title:'课程名称',align:'center'}\r\n");
      out.write("                ,{field:'sname', title:'分类名称',align:'center'}\r\n");
      out.write("                ,{fixed: 'right', title:'操作', toolbar: '#resourceBar', width:220,align:'center'}\r\n");
      out.write("            ]]\r\n");
      out.write("        })\r\n");
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
      out.write("        //监听头部工具栏事件\r\n");
      out.write("        table.on(\"toolbar(resourceTable)\",function(obj){\r\n");
      out.write("            switch(obj.event){\r\n");
      out.write("                case 'add':\r\n");
      out.write("                    openAddResource();\r\n");
      out.write("                    break;\r\n");
      out.write("            };\r\n");
      out.write("        })\r\n");
      out.write("        //监听行工具事件\r\n");
      out.write("        table.on('tool(resourceTable)', function(obj){\r\n");
      out.write("            var data = obj.data; //获得当前行数据\r\n");
      out.write("            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）\r\n");
      out.write("            if(layEvent === 'del'){ //删除\r\n");
      out.write("                layer.confirm('真的删除【'+data.name+'】这个资源吗', function(index){\r\n");
      out.write("                    //向服务端发送删除指令\r\n");
      out.write("                    $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/deleteResource.action\",{id: data.rId, path: data.path},function(res){\r\n");
      out.write("                        layer.msg(res.msg);\r\n");
      out.write("                        //刷新数据 表格\r\n");
      out.write("                        tableIns.reload();\r\n");
      out.write("                    })\r\n");
      out.write("                });\r\n");
      out.write("            } else if(layEvent === 'edit'){ //编辑\r\n");
      out.write("                openUpdateResource(data);\r\n");
      out.write("            }else if(layEvent ==='downloadResource'){\r\n");
      out.write("                downloadResource(data);\r\n");
      out.write("            } else if(layEvent == 'recommend') {\r\n");
      out.write("                recommend(data);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var url;\r\n");
      out.write("        var mainIndex;\r\n");
      out.write("        //打开添加页面\r\n");
      out.write("        function openAddResource(){\r\n");
      out.write("            mainIndex=layer.open({\r\n");
      out.write("                type:1,\r\n");
      out.write("                title:'添加资源上传',\r\n");
      out.write("                content:$(\"#addDiv\"),\r\n");
      out.write("                area:['800px','400px'],\r\n");
      out.write("                success:function(index){\r\n");
      out.write("                    //清空表单数据\r\n");
      out.write("                    $(\"#dataFrm\")[0].reset();\r\n");
      out.write("                    // 清空隐藏表单域的值\r\n");
      out.write("                    $('#hiddenId').val('');\r\n");
      out.write("                    url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/addResource.action\";\r\n");
      out.write("\r\n");
      out.write("                //    渲染下拉列表框\r\n");
      out.write("                    $(\"#sid\").find(\"option\").remove();\r\n");
      out.write("                    $('#sid').append(new Option(\"请选择分类\", \"\"));\r\n");
      out.write("\r\n");
      out.write("                    //    加载分类列表\r\n");
      out.write("                    $.get('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resourceSort/loadAllResourceSort.action', function (res) {\r\n");
      out.write("                        // 遍历填充数据\r\n");
      out.write("                        $.each(res.data, function (index, item) {\r\n");
      out.write("                            $('#sid').append(new Option(item.name, item.id));// 下拉菜单里添加元素\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        // 更新select框\r\n");
      out.write("                        form.render(\"select\");\r\n");
      out.write("                    })\r\n");
      out.write("\r\n");
      out.write("                    upload.render({\r\n");
      out.write("                        elem: '#selectFile'\r\n");
      out.write("                        ,url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/upload.action'\r\n");
      out.write("                        ,auto: false\r\n");
      out.write("                        ,field: 'mf'\r\n");
      out.write("                        ,accept: 'file'\r\n");
      out.write("                        ,bindAction: '#upload'\r\n");
      out.write("                        ,error: function () {\r\n");
      out.write("                            layer.msg('上传失败');\r\n");
      out.write("                        }\r\n");
      out.write("                        ,done: function(res){\r\n");
      out.write("                            console.log(res)\r\n");
      out.write("                            if(res.code == 0) {\r\n");
      out.write("                                var name = $('#resourceName').val();\r\n");
      out.write("                                var sort = $('#sid').val();\r\n");
      out.write("\r\n");
      out.write("                                // 在数据库中保存资源路径\r\n");
      out.write("                                $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/addResource.action', {name: name, path: res.data.src, sId: sort}, function(r) {\r\n");
      out.write("                                    layer.msg(r.msg);\r\n");
      out.write("                                })\r\n");
      out.write("                            }\r\n");
      out.write("                            layer.close(mainIndex);\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                },\r\n");
      out.write("                cancel: function () {\r\n");
      out.write("                    $(\"#sid\").find(\"option\").remove();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //打开修改页面\r\n");
      out.write("        function openUpdateResource(data){\r\n");
      out.write("            mainIndex=layer.open({\r\n");
      out.write("                type:1,\r\n");
      out.write("                title:'修改资源信息',\r\n");
      out.write("                content:$(\"#updateDiv\"),\r\n");
      out.write("                area:['800px','400px'],\r\n");
      out.write("                success:function(index){\r\n");
      out.write("                    form.val(\"dataFrm\",data);\r\n");
      out.write("                    url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/updateResource.action\";\r\n");
      out.write("\r\n");
      out.write("                    //    渲染下拉列表框\r\n");
      out.write("                    $(\"#sid2\").find(\"option\").remove();\r\n");
      out.write("                    $('#sid2').append(new Option(\"请选择分类\", \"\"));\r\n");
      out.write("\r\n");
      out.write("                    //    加载分类列表\r\n");
      out.write("                    $.get('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resourceSort/loadAllResourceSort.action', function (res) {\r\n");
      out.write("                        // 遍历填充数据\r\n");
      out.write("                        $.each(res.data, function (index, item) {\r\n");
      out.write("                            $('#sid2').append(new Option(item.name, item.id));// 下拉菜单里添加元素\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        // select下拉框回显\r\n");
      out.write("                        $('#sid2').val(data.sId);\r\n");
      out.write("\r\n");
      out.write("                        // 更新select框\r\n");
      out.write("                        form.render(\"select\");\r\n");
      out.write("                    })\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 修改保存\r\n");
      out.write("        form.on(\"submit(doSubmit)\",function(obj){\r\n");
      out.write("            //序列化表单数据\r\n");
      out.write("            var params=$(\"#dataFrm\").serialize();\r\n");
      out.write("            console.log(\"sfsf\" + params);\r\n");
      out.write("            $.post(url,params,function(obj){\r\n");
      out.write("                layer.msg(obj.msg);\r\n");
      out.write("                //关闭弹出层\r\n");
      out.write("                layer.close(mainIndex)\r\n");
      out.write("                //刷新数据 表格\r\n");
      out.write("                tableIns.reload();\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 下载资料\r\n");
      out.write("        function downloadResource(data){\r\n");
      out.write("            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/file/download.action?path=' + data.path + '&fileName=' + data.name;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 推荐资源\r\n");
      out.write("        function recommend(data) {\r\n");
      out.write("            layer.confirm('是否将【' + data.name + '】资源推荐给大家', function() {\r\n");
      out.write("                $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/updateResource.action', {rId: data.rId, flag: 1}, function (res) {\r\n");
      out.write("                    if(res.code == 0) {\r\n");
      out.write("                        layer.msg('资源推荐成功');\r\n");
      out.write("                        tableIns.reload();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        layer.msg('资源推荐失败');\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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
