package com.qingyunxuetang.qinghealth.dao;

import com.qingyunxuetang.qinghealth.bean.NewsItemBean;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NewsItemDaoTest {
    private NewsItemDao newsItemDao;

    @Before
    public void before() {
        newsItemDao = new NewsItemDao();
    }

    @Test
    public void testQueryAll() {
        List<NewsItemBean> personList = newsItemDao.queryAll();

        for(NewsItemBean each : personList) {
            System.out.println(each);
        }
    }

    @Test
    public void testInsert() {
        NewsItemBean person = new NewsItemBean();
        person.setId(200);
        person.setTitle("乔巴");
        person.setAuthor("wangjun");
        person.setBrief("奔驰");
        person.setImageUrl("");

        newsItemDao.insert(person);
    }
}