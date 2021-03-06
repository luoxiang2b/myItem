<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>教师管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/public.css" media="all" />

</head>
<body class="childrenBody">
<!-- 搜索条件开始 -->
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>查询条件</legend>
</fieldset>
<form class="layui-form" method="post" id="searchFrm">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">编号:</label>
            <div class="layui-input-inline">
                <input type="text" name="loginname"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">教师名称:</label>
            <div class="layui-input-inline">
                <input type="text" name="realname"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">身份证:</label>
            <div class="layui-input-inline">
                <input type="text" name="identity" lay-verify="number"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">地址:</label>
            <div class="layui-input-inline">
                <input type="text" name="address"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">电话号码:</label>
            <div class="layui-input-inline">
                <input type="text" name="phone" lay-verify="number"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">性别:</label>
            <div class="layui-input-inline">
                <input type="radio" value="1" title="男" name="sex"  autocomplete="off" class="layui-input">
                <input type="radio" value="0" title="女" name="sex"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-col-md-3 layui-col-md-offset5" style="padding: 10px;">
            <button type="button" class="layui-btn layui-btn-normal" id="doSearch"><i class="layui-icon layui-icon-search"></i> 查询</button>
            <button type="reset" class="layui-btn layui-btn-warm"><i class="layui-icon layui-icon-refresh"></i> 重置</button>
        </div>
    </div>
</form>
<!-- 搜索条件结束 -->


<!-- 数据表格开始 -->
<table class="layui-hide" id="teacherTable" lay-filter="teacherTable"></table>
<div style="display: none;" id="teacherToolBar">
    <button type="button" class="layui-btn layui-btn-sm" lay-event="add">增加</button>
    <button type="button" class="layui-btn layui-btn-sm layui-btn-danger" lay-event="batchDelete">批量删除</button>
</div>
<div id="teacherBar" style="display: none;">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="selectTeacherRole">分配角色</a>
    <a class="layui-btn layui-btn-xs layui-btn-warm" lay-event="resetPwd">重置密码</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</div>
<!-- 数据表格结束 -->

<!-- 添加和修改的弹出层开始 -->
<div style="display: none;padding: 20px" id="saveOrUpdateDiv" >
    <form class="layui-form"  lay-filter="dataFrm" id="dataFrm">
        <div class="layui-form-item">
            <label class="layui-form-label">教师名称：</label>
            <div class="layui-input-block">
                <input type="hidden" name="userid" id="teacherid">
                <input type="text" name="realname"  placeholder="请输入教师名称" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">身份证号码：</label>
            <div class="layui-input-block">
                <input type="text" lay-verify="required|identity" name="identity" class="layui-input" placeholder="请输入身份证号">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">地址：</label>
            <div class="layui-input-block">
                <input type="text" name="address" placeholder="请输入地址" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">电话号码</label>
            <div class="layui-input-block">
                <input type="text" lay-verify="required|phone" class="layui-input" name="phone" placeholder="请输入电话号码">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">性别：</label>
                <div class="layui-input-inline">
                    <%-- 1：表示男， 0表示女 --%>
                    <input type="radio" name="sex" value="1" title="男">
                    <input type="radio" name="sex" value="0" title="女">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">是否可用:</label>
                <div class="layui-input-inline">
                    <input type="radio" name="available" value="1" checked="checked" title="可用">
                    <input type="radio" name="available" value="0" title="不可">
                </div>
            </div>
        </div>
        <div class="layui-form-item" style="text-align: center;">
            <div class="layui-input-block">
                <button type="button" class="layui-btn layui-btn-normal layui-btn-sm layui-icon layui-icon-release" lay-filter="doSubmit" lay-submit="">提交</button>
                <button type="reset" class="layui-btn layui-btn-warm layui-btn-sm layui-icon layui-icon-refresh" >重置</button>
            </div>
        </div>
    </form>

</div>
<!-- 添加和修改的弹出层结束 -->

<!-- 教师权限设置的弹出层开始 -->
<div style="display: none;padding: 10px;" id="selectTeacherRole">
    <table class="layui-hide" id="roleTable" lay-filter="roleTable"></table>
</div>
<!-- 教师权限设置的弹出层结束 -->

<script src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>
<script type="text/javascript">
    var tableIns;
    layui.extend({
        dtree:'${pageContext.request.contextPath}/resources/layui_ext/dist/dtree'
    }).use([ 'jquery', 'layer', 'form', 'table'], function() {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;
        var table = layui.table;
        //渲染数据表格
        tableIns=table.render({
            elem: '#teacherTable'   //渲染的目标对象
            ,url:'${pageContext.request.contextPath}/teacher/loadAllTeacher.action' //数据接口
            ,title: '教师数据表'//数据导出来的标题
            ,toolbar:"#teacherToolBar"   //表格的工具条
            ,height:'full-150'
            ,cellMinWidth:100 //设置列的最小默认宽度
            ,page: true  //是否启用分页
            ,cols: [[   //列表数据
                {type: 'checkbox', fixed: 'left'}
                ,{field:'userid', title:'ID',align:'center'}
                ,{field:'loginname', title:'编号',align:'center', width: 250}
                ,{field: 'realname', title: '姓名', align:'center',width:150}
                ,{field:'identity', title:'身份证',align:'center', width: 180}
                ,{field: 'phone', title: '电话', align: 'center', width: 150}
                ,{field: 'address', title: '地址', align: 'center', width: 200}
                ,{field: 'sex', title: '性别', align: 'center', width: 80,sort: true, templet: function (d) {
                        return d.sex == '1' ? '男' : '女';
                    }}
                ,{field:'available', title:'是否可用',align:'center',width: 120,sort:true,templet:function(d){
                        return d.available=='1'?'<font color=green>可用</font>':'<font color=red>不可用</font>';
                    }},
                {fixed: 'right', title: '操作', toolbar: '#teacherBar', align: 'center', width: 260}
            ]]
            ,done: function(res, curr, count) {
                // res：接口返回的信息
                // curr：当前页码数
                // count：数据总记录数

                // 如果不是第一页，并且数据量为0的情况下，就返回上一页
                if(curr != 1 && res.data.length == 0) {
                    tableIns.reload({
                        page: {
                            curr: curr - 1
                        }
                    })
                }
            }
        })

        //模糊查询
        $("#doSearch").click(function(){
            var params=$("#searchFrm").serialize();
            tableIns.reload({
                url:"${pageContext.request.contextPath}/teacher/fuzzyQueryTeacher.action?"+params
            })
        });

        //监听头部工具栏事件
        table.on("toolbar(teacherTable)",function(obj){
            switch(obj.event){
                case 'add':
                    openAddTeacher();
                    break;
                case 'batchDelete':
                    batchDeleteTeachers();
                    break;
            };
        })
        //监听行工具事件
        table.on('tool(teacherTable)', function(obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            if(layEvent === 'del'){ //删除
                layer.confirm('您确定删除【' + data.position + '】这个教师吗', function (index) {
                    console.log(index);
                    // 向服务端发送删除请求
                    $.post('${pageContext.request.contextPath}/teacher/deleteTeacher.action', {id: data.userid}, function (res) {
                        layer.msg(res.msg);
                        // 重新刷新数据表格
                        tableIns.reload();
                    })
                });
            } else if(layEvent === 'edit'){ //编辑
                openUpdateTeacher(data);
            } else if (layEvent == 'selectTeacherRole') {
                openSelectTeacherRole(data);
            }
        });

        var url;
        var mainIndex;
//打开添加页面
        function openAddTeacher(){
            mainIndex=layer.open({
                type:1,
                title:'添加教师',
                content:$("#saveOrUpdateDiv"),
                area:['800px','450px'],
                success:function(index){
                    //清空表单数据
                    $("#dataFrm")[0].reset();
                    url="${pageContext.request.contextPath}/teacher/addTeacher.action";
                }
            });
        }

        // 教师修改函数
        function openUpdateTeacher(data){
            console.log(data);
            mainIndex = layer.open({
                type:1,
                title:'修改教师',
                content:$("#saveOrUpdateDiv"),
                area:['800px','450px'],
                success:function(index){
                    form.val("dataFrm",data);
                    // 清空隐藏表单域的值
                    $('#teacherid').val('');
                    url="${pageContext.request.contextPath}/teacher/updateTeacher.action";
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
                layer.close(mainIndex);
//刷新数据 表格
                tableIns.reload();
            })
        });

        $("#pid_div").on("click",function(){
            $(this).toggleClass("layui-form-selected");
            $("#teacherSelectDiv").toggleClass("layui-show layui-anim layui-anim-upbit");
        });

        // 批量删除教师
        function batchDeleteTeachers() {
            var checkStatus = table.checkStatus('teacherTable');
            var data = checkStatus.data;
            var params = '';
            $.each(data, function (i, item) {
                if (i == 0) {
                    params += 'ids=' + item.userid;
                } else {
                    params += '&ids=' + item.userid;
                }
                layer.alert(params);
            });

            layer.confirm('您确定要批量删除这些教师吗', function (index) {
                //    向服务端发送删除请求
                $.post('${pageContext.request.contextPath}/teacher/batchDeleteTeacher.action', params, function (res) {
                    layer.msg(res.msg);
                    //    重新刷新数据表格
                    tableIns.reload();
                })
            })
        }

        // 打开教师分配角色弹层
        function openSelectTeacherRole(data) {
            layer.open({
                type: 1,
                title: '分配角色',
                content: $('#selectTeacherRole'),
                offset: 'auto',
                area: ['800px', '400px'],
                btn: ['确定分配', '取消分配'],
                btnAlign: 'c',
                anim: 5,
                yes: function(index) {
                    console.log(data);
                    var checkStatus = table.checkStatus('roleTable');
                    var checkData = checkStatus.data;
                    var params = "userid=" + data.userid;
                    $.each(checkData, function (i, item) {
                        params += '&ids=' + item.roleid;
                    })
                    console.log(params);
                    $.post('${pageContext.request.contextPath}/teacher/saveTeacherRole.action', params, function (res) {
                        layer.msg(res.msg);
                    })
                    //  点击确定分配角色之后，关闭弹层
                    layer.close(index);
                },
                success: function () {
                    //渲染数据表格
                    mainIndex = table.render({
                        elem: '#roleTable'   //渲染的目标对象
                        ,url:'${pageContext.request.contextPath}/teacher/loadTeacherRole.action?userid=' + data.userid //数据接口
                        ,title: '角色数据表'//数据导出来的标题

                        ,cellMinWidth:100 //设置列的最小默认宽度
                        ,cols: [[   //列表数据
                            {type: 'checkbox', fixed: 'left'}
                            ,{field:'roleid', title:'ID',align:'center'}
                            ,{field:'rolename', title:'角色名称',align:'center'}
                            ,{field: 'roledesc', title: '角色描述', align: 'center'}
                        ]]
                    })
                }
            })
        }

    });

    function reloadTable(id){
        tableIns.reload({
            url:"${pageContext.request.contextPath}/teacher/loadAllTeacher.action?id="+id
        })
    }


</script>
</body>
</html>
