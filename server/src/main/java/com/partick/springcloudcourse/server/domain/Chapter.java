package com.partick.springcloudcourse.server.domain;

import java.io.Serializable;

/**
 * chapter
 * @author partick_peng
 */
public class Chapter implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 课程id
     */
    private String courseId;

    /**
     * 名称
     */
    private String name;

    /**
     * 逻辑删除标志
     */
    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}