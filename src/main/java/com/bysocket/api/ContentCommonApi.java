package com.bysocket.api;

import com.bysocket.bean.ContentBean;
import com.bysocket.bean.ContentSearchBean;
import com.bysocket.common.PageBean;
import com.bysocket.common.ResponseBean;
import com.bysocket.service.ContentService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
@Log4j2
public class ContentCommonApi {

    private final ContentService contentService;

    @PostMapping("/contents")
    public ResponseBean saveContents(@RequestBody List<ContentBean> contentBeanList) {
        boolean result = contentService.saveContents(contentBeanList);
        if (result) {
            return ResponseBean.success(result);
        }
        return ResponseBean.fail(result);
    }

    @PostMapping(value = "/content/search")
    public ResponseBean searchContent(@RequestBody ContentSearchBean contentSearchBean) {

        PageBean pageBean = contentService.searchContent(contentSearchBean);
        return ResponseBean.successPage(pageBean);
    }

}
