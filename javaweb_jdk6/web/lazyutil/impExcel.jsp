<%@ page import="org.apache.poi.hssf.usermodel.*" %>
<%@ page import="java.util.List" %>

impExcel
PROJECT_NAME: Test
PACKAGE_NAME:
Created by Lazy on 2017/5/3 21:43
Version: 0.1
Info: @TODO:...
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 第一步，创建一个webbook，对应一个Excel文件
    //创建HSSFWorkbook对象
    HSSFWorkbook wb = new HSSFWorkbook();
//创建HSSFSheet对象
    HSSFSheet sheet = wb.createSheet("sheet0");
//创建HSSFRow对象
    HSSFRow row = sheet.createRow(0);
//创建HSSFCell对象
    HSSFCell cell = row.createCell((short) 0);
//设置单元格的值
    cell.setCellValue("单元格中的中文");
    response.setContentType("application/vnd.ms-excel;charset=utf-8");
    response.setHeader("Content-Disposition", "attachment;filename="
            + new String(("tteeee" + ".xls").getBytes(), "utf-8"));
    wb.write(response.getOutputStream());

%>
