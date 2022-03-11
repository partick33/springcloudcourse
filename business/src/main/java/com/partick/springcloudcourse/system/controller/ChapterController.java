package com.partick.springcloudcourse.system.controller;

import com.partick.springcloudcourse.server.dto.PageDTO;
import com.partick.springcloudcourse.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author partick_peng
 */
@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/searchByPage")
    public PageDTO searchByPage(@RequestBody PageDTO pageDTO) {
        if (pageDTO.getPage() == null || pageDTO.getSize() == null) {
            pageDTO = new PageDTO<>();
            pageDTO.setPage(1);
            pageDTO.setSize(10);
        }
        chapterService.searchByPage(pageDTO);
        return pageDTO;
    }
}
