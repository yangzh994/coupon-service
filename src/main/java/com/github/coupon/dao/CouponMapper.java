package com.github.coupon.dao;

import com.github.coupon.entity.Coupon;
import com.github.coupon.entity.CouponExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    long countByExample(CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int deleteByExample(CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int insert(Coupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int insertSelective(Coupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    List<Coupon> selectByExampleWithRowbounds(CouponExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    List<Coupon> selectByExample(CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    Coupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int updateByPrimaryKeySelective(Coupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbg.generated Mon Jun 10 23:16:08 CST 2019
     */
    int updateByPrimaryKey(Coupon record);
}