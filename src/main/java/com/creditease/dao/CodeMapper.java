package com.creditease.dao;

import com.creditease.pojo.Code;

public interface CodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbggenerated
     */
    int insert(Code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbggenerated
     */
    int insertSelective(Code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbggenerated
     */
    Code selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table code
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Code record);
}