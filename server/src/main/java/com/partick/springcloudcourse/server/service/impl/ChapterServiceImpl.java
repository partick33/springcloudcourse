package com.partick.springcloudcourse.server.service.impl;

import com.partick.springcloudcourse.server.dto.ChapterDTO;
import com.partick.springcloudcourse.server.mapper.ChapterMapper;
import com.partick.springcloudcourse.server.service.ChapterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author partick_peng
 */
@Service
public class ChapterServiceImpl implements ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    /**
     * 大章节查询列表接口
     *
     * @return
     */
    @Override
    public List<ChapterDTO> searchByPage() {
        return null;
    }
}
