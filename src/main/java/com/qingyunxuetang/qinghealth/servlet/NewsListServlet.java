package com.qingyunxuetang.qinghealth.servlet;

import com.google.gson.Gson;
import com.qingyunxuetang.qinghealth.bean.NewsItemBean;
import com.qingyunxuetang.qinghealth.service.NewsItemService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class NewsListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        NewsItemService newsItemService = new NewsItemService();
        List<NewsItemBean> newsItemList = newsItemService.getNewsItemList();
        Gson gson = new Gson();
        String newsItemListJson = gson.toJson(newsItemList);
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().print(newsItemListJson);
        response.getWriter().flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
