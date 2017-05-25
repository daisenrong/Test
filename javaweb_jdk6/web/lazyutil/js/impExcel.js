/**
 * impExcel
 * PROJECT_NAME: Test
 * PACKAGE_NAME:
 * Created by Lazy on 2017/5/3 21:20
 * Version: 0.1
 * Info: @TODO:...
 */
function lazy_impExcel(excelName,headName,sql) {
    console.log(excelName+headName+sql);
    var form=$("<form>");//定义一个form表单
    form.attr("style","display:none");
    form.attr("target","");
    form.attr("method","post");
    form.attr("action","/lazyutil/impExcel.jsp");

    var input1=$("<input>");
    input1.attr("type","hidden");
    input1.attr("name","excelName");
    input1.attr("value",excelName);

    var input2=$("<input>");
    input1.attr("type","hidden");
    input1.attr("name","headName");
    input1.attr("value",headName);

    var input3=$("<input>");
    input1.attr("type","hidden");
    input1.attr("name","sql");
    input1.attr("value",sql);

    $("body").append(form);//将表单放置在web中
    form.append(input1);
    form.append(input2);
    form.append(input3);

    form.submit().remove();//表单提交
}