/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-01-31 10:29:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.system.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newsManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>公告管理</title>\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\t<link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/public.css\" media=\"all\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui_ext/dtree/dtree.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui_ext/dtree/font/dtreefont.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("\t<!-- 搜索条件开始 -->\r\n");
      out.write("\t<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 20px;\">\r\n");
      out.write("\t  <legend>查询条件</legend>\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\t<form class=\"layui-form\" method=\"post\" id=\"searchFrm\">\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t    <div class=\"layui-inline layui-col-md4\">\r\n");
      out.write("\t\t      <label class=\"layui-form-label\">公告标题:</label>\r\n");
      out.write("\t\t      <div class=\"layui-input-inline\">\r\n");
      out.write("\t\t        <input type=\"text\" name=\"title\"  autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"layui-inline layui-col-md4\">\r\n");
      out.write("\t\t      <label class=\"layui-form-label\">公告内容:</label>\r\n");
      out.write("\t\t      <div class=\"layui-input-inline\">\r\n");
      out.write("\t\t        <input type=\"text\" name=\"content\"  autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label layui-col-md4\">作者:</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"opername\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t<div class=\"layui-inline layui-col-md4\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">开始时间:</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"startTime\" id=\"startTime\" readonly=\"readonly\"  autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-inline layui-col-md4\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">结束时间:</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"endTime\" id=\"endTime\" readonly=\"readonly\"  autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-row\" style=\"padding-bottom: 20px;\">\r\n");
      out.write("\t\t\t<div class=\"layui-col-md3 layui-col-md-offset5\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"layui-btn layui-btn-normal  layui-icon layui-icon-search\" id=\"doSearch\">查询</button>\r\n");
      out.write("\t\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-warm  layui-icon layui-icon-refresh\">重置</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<!-- 搜索条件结束 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 数据表格开始 -->\r\n");
      out.write("\t<table class=\"layui-hide\" id=\"newsTable\" lay-filter=\"newsTable\"></table>\r\n");
      out.write("\t<div style=\"display: none;\" id=\"newsToolBar\">\r\n");
      out.write("\t\t    <button type=\"button\" class=\"layui-btn layui-btn-sm\" lay-event=\"add\">增加</button>\r\n");
      out.write("\t\t    <button type=\"button\" class=\"layui-btn layui-btn-danger layui-btn-sm\" lay-event=\"deleteBatch\">批量删除</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div  id=\"newsBar\" style=\"display: none;\">\r\n");
      out.write("\t  <a class=\"layui-btn layui-btn-xs\" lay-event=\"edit\">编辑</a>\r\n");
      out.write("\t  <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"del\">删除</a>\r\n");
      out.write("\t  <a class=\"layui-btn layui-btn-warm layui-btn-xs\" lay-event=\"viewNews\">查看</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 数据表格结束 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 添加和修改的弹出层开始 -->\r\n");
      out.write("\t<div style=\"display: none;padding: 20px\" id=\"saveOrUpdateDiv\" >\r\n");
      out.write("\t\t<form class=\"layui-form\"  lay-filter=\"dataFrm\" id=\"dataFrm\">\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">公告标题:</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"hiddenId\" name=\"id\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"title\"  placeholder=\"请输入公告标题\" autocomplete=\"off\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">公告内容:</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t <textarea class=\"layui-textarea layui-hide\" name=\"content\" lay-verify=\"content\" id=\"content\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t      <button type=\"button\" class=\"layui-btn layui-btn-normal layui-btn-sm layui-icon layui-icon-release\" lay-filter=\"doSubmit\" lay-submit=\"\">提交</button>\r\n");
      out.write("\t\t\t      <button type=\"reset\" id=\"dataFrmResetBtn\" class=\"layui-btn layui-btn-warm layui-btn-sm layui-icon layui-icon-refresh\" >重置</button>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t  \t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 添加和修改的弹出层结束 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 查看公告的div -->\r\n");
      out.write("\t<div id=\"viewNewsDiv\" style=\"padding: 10px;display: none;\">\r\n");
      out.write("\t\t<h2 id=\"view_title\" align=\"center\"></h2>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div style=\"text-align: right;\">\r\n");
      out.write("\t\t\t<font color=\"green\" size=\"3\">发布人</font>：<span id=\"view_opername\"></span><br><br>\r\n");
      out.write("\t\t\t<font color=\"green\" size=\"3\">发布时间</font>：<span id=\"view_createtime\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div id=\"view_content\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layui/layui.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t    var tableIns;\r\n");
      out.write("\t    layui.use([ 'jquery', 'layer', 'form', 'table','laydate','layedit' ], function() {\r\n");
      out.write("\t\t\tvar $ = layui.jquery;\r\n");
      out.write("\t\t\tvar layer = layui.layer;\r\n");
      out.write("\t\t\tvar form = layui.form;\r\n");
      out.write("\t\t\tvar table = layui.table;\r\n");
      out.write("\t\t\tvar laydate=layui.laydate;\r\n");
      out.write("\t\t\tvar layedit=layui.layedit;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//渲染时间\r\n");
      out.write("\t\t\tlaydate.render({\r\n");
      out.write("\t\t\t\telem:'#startTime',\r\n");
      out.write("\t\t\t\ttype:'datetime'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tlaydate.render({\r\n");
      out.write("\t\t\t\telem:'#endTime',\r\n");
      out.write("\t\t\t\ttype:'datetime'\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t//初始化富文本编辑器\r\n");
      out.write("\t\t\tvar editIndex;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//渲染数据表格\r\n");
      out.write("\t\t\t tableIns=table.render({\r\n");
      out.write("\t\t\t\t elem: '#newsTable'   //渲染的目标对象\r\n");
      out.write("\t\t\t    ,url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/news/loadAllNews.action' //数据接口\r\n");
      out.write("\t\t\t    ,title: '用户数据表'//数据导出来的标题\r\n");
      out.write("\t\t\t    ,toolbar:\"#newsToolBar\"   //表格的工具条\r\n");
      out.write("\t\t\t    ,height:'full-200'\r\n");
      out.write("\t\t\t    ,cellMinWidth:100 //设置列的最小默认宽度\r\n");
      out.write("\t\t\t    ,page: true  //是否启用分页\r\n");
      out.write("\t\t\t    ,cols: [[   //列表数据\r\n");
      out.write("\t\t\t     {type: 'checkbox', fixed: 'left'}\r\n");
      out.write("\t\t\t      ,{field:'id', title:'ID',align:'center'}\r\n");
      out.write("\t\t\t      ,{field:'title', title:'公告标题',align:'center'}\r\n");
      out.write("\t\t\t      /* ,{field:'content', title:'公告内容',align:'center'} */\r\n");
      out.write("\t\t\t      ,{field:'createtime', title:'发布时间',align:'center'}\r\n");
      out.write("\t\t\t      ,{field:'opername', title:'发布人',align:'center'}\r\n");
      out.write("\t\t\t      ,{fixed: 'right', title:'操作', toolbar: '#newsBar', width:220,align:'center'}\r\n");
      out.write("\t\t\t    ]]\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t//模糊查询\r\n");
      out.write("\t\t\t$(\"#doSearch\").click(function(){\r\n");
      out.write("\t\t\t\tvar params=$(\"#searchFrm\").serialize();\r\n");
      out.write("\t\t\t\ttableIns.reload({\r\n");
      out.write("\t\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/news/fuzzyQueryNews.action?\"+params,\r\n");
      out.write("\t\t\t\t\tpage:{curr:1}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//监听头部工具栏事件\r\n");
      out.write("\t\t\ttable.on(\"toolbar(newsTable)\",function(obj){\r\n");
      out.write("\t\t\t\t switch(obj.event){\r\n");
      out.write("\t\t\t\t    case 'add':\r\n");
      out.write("\t\t\t\t      openAddNews();\r\n");
      out.write("\t\t\t\t    break;\r\n");
      out.write("\t\t\t\t    case 'deleteBatch':\r\n");
      out.write("\t\t\t\t    \tdeleteBatch();\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t  };\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t//监听行工具事件\r\n");
      out.write("\t\t   table.on('tool(newsTable)', function(obj){\r\n");
      out.write("\t\t\t   var data = obj.data; //获得当前行数据\r\n");
      out.write("\t\t\t   var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）\r\n");
      out.write("\t\t\t  if(layEvent === 'del'){ //删除\r\n");
      out.write("\t\t\t\t  layer.confirm('真的删除【'+data.title+'】这个公告吗', function(index){\r\n");
      out.write("\t\t\t\t       //向服务端发送删除指令\r\n");
      out.write("\t\t\t\t       $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/news/deleteNews.action\",{id:data.id},function(res){\r\n");
      out.write("\t\t\t\t    \t   layer.msg(res.msg);\r\n");
      out.write("\t\t\t\t    \t    //刷新数据 表格\r\n");
      out.write("\t\t\t\t\t\t\ttableIns.reload();\r\n");
      out.write("\t\t\t\t       })\r\n");
      out.write("\t\t\t\t     }); \r\n");
      out.write("\t\t\t   } else if(layEvent === 'edit'){ //编辑\r\n");
      out.write("\t\t\t     openUpdateNews(data);\r\n");
      out.write("\t\t\t   }else if(layEvent==='viewNews'){\r\n");
      out.write("\t\t\t\t   viewNews(data);\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t\t });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar url;\r\n");
      out.write("\t\t\tvar mainIndex;\r\n");
      out.write("\t\t\t//打开添加页面\r\n");
      out.write("\t\t\tfunction openAddNews(){\r\n");
      out.write("\t\t\t\tmainIndex=layer.open({\r\n");
      out.write("\t\t\t\t\ttype:1,\r\n");
      out.write("\t\t\t\t\ttitle:'添加公告',\r\n");
      out.write("\t\t\t\t\tcontent:$(\"#saveOrUpdateDiv\"),\r\n");
      out.write("\t\t\t\t\tarea:['800px','400px'],\r\n");
      out.write("\t\t\t\t\tsuccess:function(index){\r\n");
      out.write("\t\t\t\t\t\teditIndex=layedit.build('content'); //建立编辑器\r\n");
      out.write("\t\t\t\t\t\tlayedit.setContent(editIndex,\"\");\r\n");
      out.write("\t\t\t\t\t\t//清空表单数据\r\n");
      out.write("\t\t\t\t\t\t$(\"#dataFrm\")[0].reset();\r\n");
      out.write("\t\t\t\t\t\t// 清空隐藏表单域的值\r\n");
      out.write("\t\t\t\t\t\t$('#hiddenId').val('');\r\n");
      out.write("\t\t\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/news/addNews.action\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#dataFrmResetBtn\").click(function(){\r\n");
      out.write("\t\t\t\tlayedit.setContent(editIndex,\"\");\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t//打开修改页面\r\n");
      out.write("\t\t\tfunction openUpdateNews(data){\r\n");
      out.write("\t\t\t\tmainIndex=layer.open({\r\n");
      out.write("\t\t\t\t\ttype:1,\r\n");
      out.write("\t\t\t\t\ttitle:'修改公告',\r\n");
      out.write("\t\t\t\t\tcontent:$(\"#saveOrUpdateDiv\"),\r\n");
      out.write("\t\t\t\t\tarea:['800px','400px'],\r\n");
      out.write("\t\t\t\t\tsuccess:function(index){\r\n");
      out.write("\t\t\t\t\t\teditIndex=layedit.build('content'); //建立编辑器\r\n");
      out.write("\t\t\t\t\t\t// 设置内容\r\n");
      out.write("\t\t\t\t\t\tlayedit.setContent(editIndex, data.content);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(data.content);\r\n");
      out.write("\t\t\t\t\t\tform.val(\"dataFrm\",data);\r\n");
      out.write("\t\t\t\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/news/updateNews.action\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//保存\r\n");
      out.write("\t\t\tform.on(\"submit(doSubmit)\",function(obj){\r\n");
      out.write("\t\t\t\tlayedit.sync(editIndex);//把富文本里面的数据同步到自己写的textarea里面\r\n");
      out.write("\t\t\t\t//序列化表单数据\r\n");
      out.write("\t\t\t\tvar params=$(\"#dataFrm\").serialize();\r\n");
      out.write("\t\t\t\t$.post(url,params,function(obj){\r\n");
      out.write("\t\t\t\t\tlayer.msg(obj.msg);\r\n");
      out.write("\t\t\t\t\t//关闭弹出层\r\n");
      out.write("\t\t\t\t\tlayer.close(mainIndex)\r\n");
      out.write("\t\t\t\t\t//刷新数据 表格\r\n");
      out.write("\t\t\t\t\ttableIns.reload();\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//查看\r\n");
      out.write("\t\t\tfunction viewNews(data){\r\n");
      out.write("\t\t\t\tmainIndex=layer.open({\r\n");
      out.write("\t\t\t\t\ttype:1,\r\n");
      out.write("\t\t\t\t\ttitle:'查看公告',\r\n");
      out.write("\t\t\t\t\tcontent:$(\"#viewNewsDiv\"),\r\n");
      out.write("\t\t\t\t\tarea:['800px','400px'],\r\n");
      out.write("\t\t\t\t\tsuccess:function(index){\r\n");
      out.write("\t\t\t\t\t\t$(\"#view_title\").html(data.title);\r\n");
      out.write("\t\t\t\t\t\t$(\"#view_opername\").html(data.opername);\r\n");
      out.write("\t\t\t\t\t\t$(\"#view_createtime\").html(data.createtime);\r\n");
      out.write("\t\t\t\t\t\t$(\"#view_content\").html(data.content);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//批量删除\r\n");
      out.write("\t\t\tfunction deleteBatch(){\r\n");
      out.write("\t\t\t\t//得到选中的数据行\r\n");
      out.write("\t\t\t\tvar checkStatus = table.checkStatus('newsTable');\r\n");
      out.write("\t\t\t    var data = checkStatus.data;\r\n");
      out.write("\t\t\t    var params=\"\";\r\n");
      out.write("\t\t\t    $.each(data,function(i,item){\r\n");
      out.write("\t\t\t    \tif(i==0){\r\n");
      out.write("\t\t\t    \t\tparams+=\"ids=\"+item.id;\r\n");
      out.write("\t\t\t    \t}else{\r\n");
      out.write("\t\t\t    \t\tparams+=\"&ids=\"+item.id;\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t    layer.confirm('真的删除选中的这些公告吗', function(index){\r\n");
      out.write("\t\t\t\t       //向服务端发送删除指令\r\n");
      out.write("\t\t\t\t       $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/news/deleteBatchNews.action\",params,function(res){\r\n");
      out.write("\t\t\t\t    \t   layer.msg(res.msg);\r\n");
      out.write("\t\t\t\t    \t    //刷新数据 表格\r\n");
      out.write("\t\t\t\t\t\t\ttableIns.reload();\r\n");
      out.write("\t\t\t\t       })\r\n");
      out.write("\t\t\t\t     }); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
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
