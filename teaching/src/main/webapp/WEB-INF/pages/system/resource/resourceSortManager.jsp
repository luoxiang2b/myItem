<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>资源分类管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="icon" href="favicon.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/public.css" media="all" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/layui_ext/dtree/dtree.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/layui_ext/dtree/font/dtreefont.css">
</head>
<body class="childrenBody">
<!-- 搜索条件开始 -->
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>查询条件</legend>
</fieldset>
<form class="layui-form" method="post" id="searchFrm">
    <div class="layui-form-item">
        <div class="layui-inline layui-col-md4">
            <label class="layui-form-label">分类标题:</label>
            <div class="layui-input-inline">
                <input type="text" name="name"  autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-row" style="padding-bottom: 20px;">
        <div class="layui-col-md3 layui-col-md-offset5">
            <button type="button" class="layui-btn layui-btn-normal  layui-icon layui-icon-search" id="doSearch">查询</button>
            <button type="reset" class="layui-btn layui-btn-warm  layui-icon layui-icon-refresh">重置</button>
        </div>
    </div>
</form>
<!-- 搜索条件结束 -->

<!-- 数据表格开始 -->
<table class="layui-hide" id="resourceSortTable" lay-filter="resourceSortTable"></table>
<div style="display: none;" id="resourceSortToolBar">
    <button type="button" class="layui-btn layui-btn-sm" lay-event="add">增加</button>
</div>
<div  id="resourceSortBar" style="display: none;">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="viewResource">查看资源</a>
</div>
<!-- 数据表格结束 -->

<!-- 添加和修改的弹出层开始 -->
<div style="display: none;padding: 20px" id="saveOrUpdateDiv" >
    <form class="layui-form"  lay-filter="dataFrm" id="dataFrm">
        <div class="layui-form-item">
            <label class="layui-form-label">分类标题:</label>
            <div class="layui-input-block">
                <input type="hidden" id="hiddenId" name="id">
                <input type="text" name="name"  placeholder="请输入资源分类标题" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="text-align: center;">
            <div class="layui-input-block">
                <button type="button" class="layui-btn layui-btn-normal layui-btn-sm layui-icon layui-icon-release" lay-filter="doSubmit" lay-submit="">提交</button>
                <button type="reset" id="dataFrmResetBtn" class="layui-btn layui-btn-warm layui-btn-sm layui-icon layui-icon-refresh" >重置</button>
            </div>
        </div>
    </form>
</div>
<!-- 添加和修改的弹出层结束 -->

<!-- 查看资源分类的div -->
<div id="viewResourceDiv" style="padding: 10px;display: none;">
    <table class="layui-hide" id="resourceTable" lay-filter="resourceTable"></table>
</div>

<div id="resourceBar" style="display: none;">
    <a class="layui-btn layui-btn-xs" lay-event="download">下载</a>
</div>

<script src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>
<script type="text/javascript">
    var tableIns;
    layui.use([ 'jquery', 'layer', 'form', 'table'], function() {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;
        var table = layui.table;


        //渲染数据表格
        tableIns=table.render({
            elem: '#resourceSortTable'   //渲染的目标对象
            ,url:'${pageContext.request.contextPath}/resourceSort/loadAllResourceSort.action' //数据接口
            ,title: '客户分类数据表'//数据导出来的标题
            ,toolbar:"#resourceSortToolBar"   //表格的工具条
            ,height:'full-200'
            ,cellMinWidth:100 //设置列的最小默认宽度
            ,page: true  //是否启用分页
            ,cols: [[   //列表数据
                {type: 'numbers', fixed: 'left'}
                ,{field:'id', title:'ID',align:'center', hide: true}
                ,{field:'name', title:'分类标题',align:'center'}
                ,{fixed: 'right', title:'操作', toolbar: '#resourceSortBar', width:220,align:'center'}
            ]]
        })
        //模糊查询
        $("#doSearch").click(function(){
            var params=$("#searchFrm").serialize();
            console.log(params);
            tableIns.reload({
                url:"${pageContext.request.contextPath}/resourceSort/fuzzyQueryResourceSort.action?"+params,
                page:{curr:1}
            })
        });

        //监听头部工具栏事件
        table.on("toolbar(resourceSortTable)",function(obj){
            switch(obj.event){
                case 'add':
                    openAddResourceSort();
                    break;
                case 'deleteBatch':
                    deleteBatch();
                    break;
            };
        })
        //监听行工具事件
        table.on('tool(resourceSortTable)', function(obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            if(layEvent === 'del'){ //删除
                layer.confirm('真的删除【'+data.name+'】这个资源分类吗', function(index){
                    //向服务端发送删除指令
                    $.post("${pageContext.request.contextPath}/resourceSort/deleteResourceSort.action",{id:data.id},function(res){
                        layer.msg(res.msg);
                        //刷新数据 表格
                        tableIns.reload();
                    })
                });
            } else if(layEvent === 'edit'){ //编辑
                openUpdateResourceSort(data);
            }else if(layEvent ==='viewResource'){
                viewResourceSort(data);
            }
        });

        //监听行工具事件
        table.on('tool(resourceTable)', function(obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            if(layEvent === 'download'){ //删除
                window.location.href = '${pageContext.request.contextPath}/file/download.action?path=' + data.path + '&fileName=' + data.name;
            }
        });

        var url;
        var mainIndex;
        //打开添加页面
        function openAddResourceSort(){
            mainIndex=layer.open({
                type:1,
                title:'添加资源分类',
                content:$("#saveOrUpdateDiv"),
                area:['800px','400px'],
                success:function(index){
                    //清空表单数据
                    $("#dataFrm")[0].reset();
                    // 清空隐藏表单域的值
                    $('#hiddenId').val('');
                    url="${pageContext.request.contextPath}/resourceSort/addResourceSort.action";
                }
            });
        }

        //打开修改页面
        function openUpdateResourceSort(data){
            mainIndex=layer.open({
                type:1,
                title:'修改资源分类',
                content:$("#saveOrUpdateDiv"),
                area:['800px','400px'],
                success:function(index){
                    form.val("dataFrm",data);
                    url="${pageContext.request.contextPath}/resourceSort/updateResourceSort.action";
                }
            });
        }

        //保存
        form.on("submit(doSubmit)",function(obj){
            //序列化表单数据
            var params=$("#dataFrm").serialize();
            $.post(url,params,function(obj){
                layer.msg(obj.msg);
                //关闭弹出层
                layer.close(mainIndex)
                //刷新数据 表格
                tableIns.reload();
            })
        });

        //查看
        function viewResourceSort(data){
            mainIndex=layer.open({
                type:1,
                title:'正在查看【' + data.name +  '】分类下的资源',
                content:$("#viewResourceDiv"),
                area:['800px','400px'],
                success:function(index){
                    //渲染数据表格
                    table.render({
                        elem: '#resourceTable'   //渲染的目标对象
                        ,url:'${pageContext.request.contextPath}/resource/loadResourceBySortId.action?sId=' + data.id //数据接口
                        ,title: '资源数据表'//数据导出来的标题
                        ,height:'full-200'
                        ,cellMinWidth:100 //设置列的最小默认宽度
                        ,page: true  //是否启用分页
                        ,cols: [[   //列表数据
                            {type: 'numbers', fixed: 'left', title: '编号'}
                            ,{field:'id', title:'ID',align:'center', hide: true}
                            ,{field:'name', title:'资源名称',align:'center'}
                            ,{fixed: 'right', title:'操作', toolbar: '#resourceBar', width:220,align:'center'}
                        ]]
                    })
                }
            });
        }

        //批量删除
        function deleteBatch(){
            //得到选中的数据行
            var checkStatus = table.checkStatus('resourceSortTable');
            var data = checkStatus.data;
            var params="";
            $.each(data,function(i,item){
                if(i==0){
                    params+="ids="+item.id;
                }else{
                    params+="&ids="+item.id;
                }
            });
            layer.confirm('真的删除选中的这些资源分类吗', function(index){
                //向服务端发送删除指令
                $.post("${pageContext.request.contextPath}/resourceSort/deleteBatchResourceSort.action",params,function(res){
                    layer.msg(res.msg);
                    //刷新数据 表格
                    tableIns.reload();
                })
            });
        }

    });
</script>
</body>
</html>