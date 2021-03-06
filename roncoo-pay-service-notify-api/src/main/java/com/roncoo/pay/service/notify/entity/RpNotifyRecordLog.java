/*
 * ====================================================================
 * 龙果学院： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/course/view/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package com.roncoo.pay.service.notify.entity;

import java.io.Serializable;
import java.util.Date;

import com.roncoo.pay.common.core.entity.BaseEntity;

/**
 * @功能说明:
 * @创建者: Peter
 * @创建时间: 16/6/2  上午11:25
 * @公司名称:广州市领课网络科技有限公司 龙果学院(www.roncoo.com)
 * @版本:V1.0
 */
public class RpNotifyRecordLog extends BaseEntity implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 459406550725396000L;

    /** 通知记录ID **/
    private String notifyId;

    /** 请求信息 **/
    private String request;

    /** 返回信息 **/
    private String response;

    /** 商户编号 **/
    private String merchantNo;

    /** 商户订单号 **/
    private String merchantOrderNo;

    /** HTTP状态 **/
    private Integer httpStatus;

    private Date createTime;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public RpNotifyRecordLog() {
        super();
    }

    public RpNotifyRecordLog(Date createTime, String notifyId, String request, String response, String merchantNo, String merchantOrderNo, Integer httpStatus) {
        super();
        this.createTime = createTime;
        this.notifyId = notifyId;
        this.request = request;
        this.response = response;
        this.merchantNo = merchantNo;
        this.merchantOrderNo = merchantOrderNo;
        this.httpStatus = httpStatus;
    }

    /** 通知记录ID **/
    public String getNotifyId() {
        return notifyId;
    }

    /** 通知记录ID **/
    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    /** 请求信息 **/
    public String getRequest() {
        return request;
    }

    /** 请求信息 **/
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    /** 返回信息 **/
    public String getResponse() {
        return response;
    }

    /** 返回信息 **/
    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    /** 商户编号 **/
    public String getMerchantNo() {
        return merchantNo;
    }

    /** 商户编号 **/
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    /** 商户订单号 **/
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /** 商户订单号 **/
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /** HTTP状态 **/
    public Integer getHttpStatus() {
        return httpStatus;
    }

    /** HTTP状态 **/
    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

}
