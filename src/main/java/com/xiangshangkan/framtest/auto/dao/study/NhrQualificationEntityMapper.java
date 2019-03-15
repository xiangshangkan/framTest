package com.xiangshangkan.framtest.auto.dao.study;

import com.xiangshangkan.framtest.auto.entity.study.NhrQualificationEntity;
import com.xiangshangkan.framtest.auto.entity.study.NhrQualificationEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NhrQualificationEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int countByExample(NhrQualificationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int deleteByExample(NhrQualificationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int insert(NhrQualificationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int insertSelective(NhrQualificationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    List<NhrQualificationEntity> selectByExampleWithRowbounds(NhrQualificationEntityExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    List<NhrQualificationEntity> selectByExample(NhrQualificationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    NhrQualificationEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") NhrQualificationEntity record, @Param("example") NhrQualificationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") NhrQualificationEntity record, @Param("example") NhrQualificationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NhrQualificationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nhr_qualification
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NhrQualificationEntity record);
}