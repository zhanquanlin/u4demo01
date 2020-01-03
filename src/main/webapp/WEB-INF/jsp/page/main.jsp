<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 2019/12/17
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyUI/css/demo.css">
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js" type="text/javascript" language="javascript"></script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="${pageContext.request.contextPath}/js/jquery.easyui.min.js" type="text/javascript" language="javascript"></script>


    <script charset="UTF-8">
        // function fn() {
        //     var xmlhttp=new XMLHttpRequest();
        //     xmlhttp.onreadystatechange=function () {
        //         if(xmlhttp.readyState==4){
        //             if(xmlhttp.status==200){
        //                 var list=eval("("+xmlhttp.responseText+")");
        //                 var table=document.createElement("table");
        //                 table.setAttribute("border","1");
        //                 table.setAttribute("width","500");
        //                 var tr=document.createElement("tr");
        //                 var th=document.createElement("th");
        //                 var th1=document.createElement("th");
        //                 var th2=document.createElement("th");
        //                 var th3=document.createElement("th");
        //                 var th4=document.createElement("th");
        //                 var th5=document.createElement("th");
        //                 th.innerHTML="图书id";
        //                 th1.innerHTML="图书类型";
        //                 th2.innerHTML="图书名称";
        //                 th3.innerHTML="作者";
        //                 th4.innerHTML="出版社";
        //                 th5.innerHTML="出版时间";
        //                 tr.appendChild(th);
        //                 tr.appendChild(th1);
        //                 tr.appendChild(th2);
        //                 tr.appendChild(th3);
        //                 tr.appendChild(th4);
        //                 tr.appendChild(th5);
        //                 table.appendChild(tr);
        //
        //
        //                 for(var i=0;i<list.length;i++){
        //                     var tr1=document.createElement("tr");
        //                     var td = document.createElement("td");
        //                     td.innerHTML=list[i].bookid;
        //                     var td1 = document.createElement("td");
        //                     td1.innerHTML=list[i].bookCode;
        //                     var td2 = document.createElement("td");
        //                     td2.innerHTML=list[i].bookName;
        //                     var td3=document.createElement("td");
        //                     td3.innerHTML=list[i].bookAuthor;
        //                     var td4=document.createElement("td");
        //                     td4.innerHTML=list[i].publishPress;
        //                     var td5=document.createElement("td");
        //                     td5.innerHTML=list[i].publishDate;
        //                     tr1.appendChild(td);
        //                     tr1.appendChild(td1);
        //                     tr1.appendChild(td2);
        //                     tr1.appendChild(td3);
        //                     tr1.appendChild(td4);
        //                     tr1.appendChild(td5);
        //                     table.appendChild(tr1);
        //                 }
        //                 //多次点击查询的时候，页面会动态创建多个table表格,吧div从新定义，给他一个空字符串
        //                 document.getElementById("list").innerHTML="";
        //                 //把生成的table放到div中
        //                 document.getElementById("list").appendChild(table);
        //             }
        //         }
        //     }
        //     xmlhttp.open("post","list");
        //     xmlhttp.setRequestHeader("CONTENT-TYPE","application/x-www-form-urlencoded");
        //     xmlhttp.send();
        // }
        $(function () {
            $("#but").click(function(){
                //加载数据
                $('#dg').datagrid({
                    url:'list',
                    pagination:true,
                    pageSize:3,
                    pageList:[3,5,8],
                    columns:[[
                        {field:'bookCode',title:'类型',width:100,align:'right'},
                        {field:'bookName',title:'图书名',width:100,align:'right'},
                        {field:'bookAuthor',title:'5',width:100,align:'right'},
                        {field:'publishPress',title:'6',width:100,align:'right'},
                        {field:'publishDate',title:'时间',width:100,align:'right'}
                    ]]
                });
            });
        })



    </script>
</head>
<body>
<input type="button" value="查看数据" id="but"/>
<table id="dg"></table>
</body>
</html>
