package com.atguigu.guili.common.base.result;


import lombok.Data;
import lombok.Getter;
import lombok.ToString;


@ToString
@Getter//外界要拿到这个枚举类中的内容只要使用get就可以了
public enum ResultCodeEnum {

    SUCCESS(true, 20000,"成功"),
    UNKNOWN_REASON(false, 20001, "未知错误"),

    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 21002, "json解析异常"),
    PARAM_ERROR(false, 21003, "参数不正确"),

    FILE_UPLOAD_ERROR(false, 21004, "文件上传错误"),
    FILE_DELETE_ERROR(false, 21005, "文件刪除错误"),
    EXCEL_DATA_IMPORT_ERROR(false, 21006, "Excel数据导入错误"),

    VIDEO_UPLOAD_ALIYUN_ERROR(false, 22001, "视频上传至阿里云失败"),
    VIDEO_UPLOAD_TOMCAT_ERROR(false, 22002, "视频上传至业务服务器失败"),
    VIDEO_DELETE_ALIYUN_ERROR(false, 22003, "阿里云视频文件删除失败"),
    FETCH_VIDEO_UPLOADAUTH_ERROR(false, 22004, "获取上传地址和凭证失败"),
    REFRESH_VIDEO_UPLOADAUTH_ERROR(false, 22005, "刷新上传地址和凭证失败"),
    FETCH_PLAYAUTH_ERROR(false, 22006, "获取播放凭证失败"),

    URL_ENCODE_ERROR(false, 23001, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(false, 23002, "非法回调请求"),
    FETCH_ACCESSTOKEN_FAILD(false, 23003, "获取accessToken失败"),
    FETCH_USERINFO_ERROR(false, 23004, "获取用户信息失败"),
    LOGIN_ERROR(false, 23005, "登录失败"),

    COMMENT_EMPTY(false, 24006, "评论内容必须填写"),

    PAY_RUN(false, 25000, "支付中"),

    GATEWAY_ERROR(false, 26000, "服务不能访问"),

    CODE_ERROR(false, 28000, "验证码错误"),
    LOGIN_MOBLE_ERROR(false, 28001, "账号不正确"),
    LOGIN_DISABLED_ERROR(false, 28002, "该用户已被禁用"),
    REGISTER_MOBLE_ERROR(false, 28003, "手机号已被注册"),
    LOGIN_AURH(false, 28004, "需要登录"),
    LOGIN_ACL(false, 28005, "没有权限"),
    ;

    private Boolean success;

    private Integer code;

    private String message;

    private ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
