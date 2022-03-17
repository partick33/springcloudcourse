package com.partick.springcloudcourse.system.controller;

import com.partick.springcloudcourse.server.dto.ChapterDTO;
import com.partick.springcloudcourse.server.dto.PageDTO;
import com.partick.springcloudcourse.server.dto.ResponseDTO;
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

    /**
     * 分页查询大章接口
     * @param pageDTO
     * @return
     */
    @RequestMapping("/searchByPage")
    public ResponseDTO searchByPage(@RequestBody PageDTO pageDTO) {
        if (pageDTO.getPage() == null || pageDTO.getSize() == null) {
            pageDTO = new PageDTO<>();
            pageDTO.setPage(1);
            pageDTO.setSize(10);
        }
        chapterService.searchByPage(pageDTO);
        return new ResponseDTO<>().successResult(pageDTO);
    }

    /**
     * 保存大章接口
     * @param chapterDTO
     */
    @RequestMapping("/save")
    public ResponseDTO save(@RequestBody ChapterDTO chapterDTO) {
        chapterService.save(chapterDTO);
        return new ResponseDTO<>().successResult();
    }
}
