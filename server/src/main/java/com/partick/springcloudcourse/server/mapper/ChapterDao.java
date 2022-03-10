package com.partick.springcloudcourse.server.mapper;

import com.partick.springcloudcourse.server.domain.Chapter;

/**
 * @author partick_peng
 */
public interface ChapterDao {
    int deleteByPrimaryKey(String id);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);
}