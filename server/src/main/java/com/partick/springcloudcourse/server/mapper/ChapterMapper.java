package com.partick.springcloudcourse.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.partick.springcloudcourse.server.domain.Chapter;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author partick_peng
 * @Entity com.partick.springcloudcourse.server.domain.Chapter
 */
@Mapper
public interface ChapterMapper extends BaseMapper<Chapter> {

}




