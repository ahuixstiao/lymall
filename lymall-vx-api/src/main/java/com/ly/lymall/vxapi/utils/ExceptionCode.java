package com.ly.lymall.vxapi.utils;

/**
 * @Author: ahui
 * @Date: 2020-11-18/ 16:44
 * @Description: 前端异常码
 */

public final class ExceptionCode {

    /**
     * 没有收货地址
     */
    public static final int NO_DELIVERY_ADDRESS_YET = 695;
    /**
     * 地址删除失败
     */
    public static final int ADDRESS_DELETION_FAILED = 696;
    /**
     * 校验失败
     */
    public static final int VERIFICATION_FAILED = 697;
    /**
     * 注册失败
     */
    public static final int REGISTRATION_FAILED = 698;
    /**
     * 用户名不存在
     */
    public static final int ACCOUNT_DOES_NOT_EXIST = 699;
    /**
     * 账号密码不对
     */
    public static final int AUTH_INVALID_ACCOUNT = 700;
    /**
     * 小程序后台验证码服务不支持
     */
    public static final int AUTH_CAPTCHA_UNSUPPORT = 701;
    /**
     * 验证码未超时1分钟，不能发送
     */
    public static final int AUTH_CAPTCHA_FREQUENCY = 702;
    /**
     * 验证码错误
     */
    public static final int AUTH_CAPTCHA_UNMATCH = 703;
    /**
     * 密码修改失败
     */
    public static final int PASSWORD_MODIFICATION_FAILED = 694;
    /**
     * 用户名已注册
     */
    public static final int AUTH_NAME_REGISTERED = 704;
    /**
     * 手机号已注册
     */
    public static final int AUTH_MOBILE_REGISTERED = 705;
    /**
     * 手机号未注册
     */
    public static final int AUTH_MOBILE_UNREGISTERED = 706;
    /**
     * 手机号格式不正确
     */
    public static final int AUTH_INVALID_MOBILE = 707;
    /**
     * 用户ID不存在，订单不能支付、openid 获取失败
     */
    public static final int AUTH_OPENID_UNACCESS = 708;
    /**
     * openid已绑定账号
     */
    public static final int AUTH_OPENID_BINDED = 709;
    /**
     * 商品已下架
     */
    public static final int GOODS_UNSHELVE = 710;
    /**
     * 库存不足
     */
    public static final int GOODS_NO_STOCK = 711;
    /**
     * 商品不存在
     */
    public static final int GOODS_UNKNOWN = 712;
    /**
     * 无效的商品ID
     */
    public static final int GOODS_INVALID = 713;
    /**
     * 订单不存在
     */
    public static final int ORDER_UNKNOWN = 720;
    /**
     * 不是当前用户的订单
     */
    public static final int ORDER_INVALID = 721;
    /**
     * 订单查看失败
     */
    public static final int ORDER_CHECKOUT_FAIL = 722;
    /**
     * 订单取消失败
     */
    public static final int ORDER_CANCEL_FAIL = 723;
    /**
     * 订单支付失败
     */
    public static final int ORDER_PAY_FAIL = 724;
    /**
     * 无效的订单操作
     */
    public static final int ORDER_INVALID_OPERATION = 725;
    /**
     * 订单商品已评价
     */
    public static final int ORDER_COMMENTED = 726;
    /**
     * 当前商品评价时间已经过期
     */
    public static final int ORDER_COMMENT_EXPIRED = 727;
    /**
     * 团购已过期
     */
    public static final int GROUPON_EXPIRED = 730;
    /**
     * 团购已下线
     */
    public static final int GROUPON_OFFLINE = 731;
    /**
     * 团购活动人数已满
     */
    public static final int GROUPON_FULL = 732;
    /**
     * 团购活动已经参加
     */
    public static final int GROUPON_JOIN = 733;
    /**
     * 优惠券已领完;//优惠券已经领取过;//优惠券已经兑换
     */
    public static final int COUPON_EXCEED_LIMIT = 740;
    /**
     * 新用户优惠券自动发送、优惠券只能兑换、优惠券类型不支持、优惠券已经过期、优惠券只能领取，不能兑换
     */
    public static final int COUPON_RECEIVE_FAIL = 741;
    /**
     * 优惠券码不正确
     */
    public static final int COUPON_CODE_INVALID = 742;
    /**
     * 不能申请售后
     */
    public static final int AFTERSALE_UNALLOWED = 750;
    /**
     * 退款金额不正确、已申请售后
     */
    public static final int AFTERSALE_INVALID_AMOUNT = 751;
    /**
     * 不能取消售后
     */
    public static final int AFTERSALE_INVALID_STATUS = 752;
}
