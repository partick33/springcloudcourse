package com.partick.springcloudcourse.server.service;

import com.partick.springcloudcourse.server.dto.ChapterDTO;
import com.partick.springcloudcourse.server.dto.PageDTO;

/**
 * @author partick_peng
 */
public interface ChapterService {
    /**
     * 大章节查询列表接口
     * @param pageDTO
     */
    void searchByPage(PageDTO pageDTO);

    /**
     * 保存大章接口
     * @param chapterDTO
     */
    void save(ChapterDTO chapterDTO);
}
