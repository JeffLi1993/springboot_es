package com.bysocket.service;


import com.bysocket.bean.ContentBean;
import com.bysocket.bean.ContentSearchBean;
import com.bysocket.common.PageBean;

import java.util.List;

public interface ContentService {

    /**
     * 批量向 ES 保存内容
     */
    boolean saveContents(List<ContentBean> contentBeanList);

    /**
     * 关键字搜索
     */
    PageBean searchContent(ContentSearchBean contentSearchBean);
}
