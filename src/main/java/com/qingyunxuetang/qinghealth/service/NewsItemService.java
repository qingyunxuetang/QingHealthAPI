package com.qingyunxuetang.qinghealth.service;

import com.qingyunxuetang.qinghealth.bean.NewsItemBean;
import com.qingyunxuetang.qinghealth.dao.NewsItemDao;

import java.util.List;

public class NewsItemService {

    NewsItemDao newsItemDao = new NewsItemDao();
    public List<NewsItemBean> getNewsItemList(){
        List<NewsItemBean> newsItemBeanList = newsItemDao.queryAll();
        return newsItemBeanList;
    }

}
