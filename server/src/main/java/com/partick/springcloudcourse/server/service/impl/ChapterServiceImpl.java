package com.partick.springcloudcourse.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.partick.springcloudcourse.server.domain.Chapter;
import com.partick.springcloudcourse.server.dto.ChapterDTO;
import com.partick.springcloudcourse.server.dto.PageDTO;
import com.partick.springcloudcourse.server.mapper.ChapterMapper;
import com.partick.springcloudcourse.server.service.ChapterService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author partick_peng
 */
@Service
public class ChapterServiceImpl implements ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    /**
     * 大章节查询列表接口
     * @param pageDTO
     */
    @Override
    public void searchByPage(PageDTO pageDTO) {
        Page<Chapter> chapterPage = new Page<>(pageDTO.getPage(), pageDTO.getSize());
        QueryWrapper<Chapter> queryWrapper = new QueryWrapper<>();
        Page<Chapter> chapterPages = chapterMapper.selectPage(chapterPage, queryWrapper);

        pageDTO.setPage((int) chapterPages.getPages());
        pageDTO.setSize((int) chapterPages.getSize());
        pageDTO.setTotal((int) chapterPages.getTotal());

        ArrayList<ChapterDTO> chapterDtoList = new ArrayList<>();
        chapterPages.getRecords().forEach(chapter -> {
            ChapterDTO chapterDTO = new ChapterDTO();
            BeanUtils.copyProperties(chapter,chapterDTO);
            chapterDtoList.add(chapterDTO);
        });
        pageDTO.setList(chapterDtoList);

    }
}
