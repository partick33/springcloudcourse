package com.partick.springcloudcourse.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.partick.springcloudcourse.server.domain.Chapter;
import com.partick.springcloudcourse.server.dto.ChapterDTO;
import com.partick.springcloudcourse.server.mapper.ChapterMapper;
import com.partick.springcloudcourse.server.service.ChapterService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        QueryWrapper<Chapter> queryWrapper = new QueryWrapper<>();
        List<Chapter> chapterList = chapterMapper.selectList(queryWrapper);
        ArrayList<ChapterDTO> chapterDtoList = new ArrayList<>();
        chapterList.forEach(chapter -> {
            ChapterDTO chapterDTO = new ChapterDTO();
            BeanUtils.copyProperties(chapter,chapterDTO);
            chapterDtoList.add(chapterDTO);
        });
        return chapterDtoList;
    }
}
