package com.serviet;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ${NAME}
 * PROJECT_NAME: Test
 * PACKAGE_NAME: ${PACKAGE_NAME}
 * Created by Lazy on 2017/5/3 22:40
 * Version: 0.1
 * Info: @TODO:...
 */
@WebServlet(name = "DownTest",urlPatterns="/DownTest")
public class DownTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
                + new String(("tteeee" + ".xls").getBytes(), "iso-8859-1"));
        wb.write(response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
