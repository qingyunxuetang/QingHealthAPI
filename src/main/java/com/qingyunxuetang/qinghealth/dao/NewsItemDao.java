package com.qingyunxuetang.qinghealth.dao;

import com.qingyunxuetang.qinghealth.bean.NewsItemBean;
import com.qingyunxuetang.qinghealth.common.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class NewsItemDao {

    public static final String NAMESPACE = "com.qingyunxuetang.qinghealth.NewsItemMapper";

    public List<NewsItemBean> queryAll(){
        SqlSession session = MyBatisUtil.getSession();
        List<NewsItemBean> newsItemBeanList = session.selectList(NAMESPACE + ".queryAll");
        session.commit();
        session.close();
        return newsItemBeanList;
    }

    public void insert(NewsItemBean person) {
        SqlSession session = MyBatisUtil.getSession();
        session.insert(NAMESPACE + ".insert" , person);

        session.commit();
        session.close();
    }

}
