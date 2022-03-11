package com.partick.springcloudcourse.system.controller;

import com.partick.springcloudcourse.server.dto.ChapterDTO;
import com.partick.springcloudcourse.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author partick_peng
 */
@RestController
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/searchByPage")
    public List<ChapterDTO> searchByPage() {
        return chapterService.searchByPage();
    }

    @RequestMapping("/test")
    public Object test() {
        return "sucess";
    }
}
