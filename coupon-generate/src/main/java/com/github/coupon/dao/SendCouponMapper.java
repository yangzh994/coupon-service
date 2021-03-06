package com.github.coupon.dao;

import com.github.coupon.entity.SendCoupon;
import com.github.coupon.entity.SendCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SendCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    long countByExample(SendCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int deleteByExample(SendCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int insert(SendCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int insertSelective(SendCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    List<SendCoupon> selectByExampleWithRowbounds(SendCouponExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    List<SendCoupon> selectByExample(SendCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    SendCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") SendCoupon record, @Param("example") SendCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int updateByExample(@Param("record") SendCoupon record, @Param("example") SendCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int updateByPrimaryKeySelective(SendCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table send_coupon
     *
     * @mbg.generated Mon Jun 10 23:15:29 CST 2019
     */
    int updateByPrimaryKey(SendCoupon record);
}