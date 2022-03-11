package com.partick.springcloudcourse.server.service;

import com.partick.springcloudcourse.server.dto.ChapterDTO;

import java.util.List;

/**
 * @author partick_peng
 */
public interface ChapterService {
    /**
     * 大章节查询列表接口
     * @return
     */
    List<ChapterDTO> searchByPage();
}
