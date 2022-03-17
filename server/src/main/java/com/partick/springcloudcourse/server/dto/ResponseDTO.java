package com.partick.springcloudcourse.server.dto;

/**
 * 统一接口返回信息DTO
 * @author partick_peng
 */
public class ResponseDTO<E>{

    private Boolean success;

    private String code;

    private String message;

    private E data;

    /**
     * 默认无参构造方法
     */
    public ResponseDTO() {

    }

    /**
     * 无数据返回构造参数
     * @param success
     * @param code
     * @param message
     */
    public ResponseDTO(Boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    /**
     * 有数据返回构造参数
     * @param success
     * @param code
     * @param message
     * @param data
     */
    public ResponseDTO(Boolean success, String code, String message, E data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 默认无数据返回调用接口成功方法
     * @return
     */
    public ResponseDTO<E> successResult(){
        return new ResponseDTO<E>(true, "200", "调用接口成功");
    }

    /**
     * 默认有数据返回调用接口成功方法
     * @param data
     * @return
     */
    public ResponseDTO<E> successResult(E data){
        return new ResponseDTO<E>(true, "200", "调用接口成功",data);
    }

    /**
     * 默认调用接口失败方法
     * @return
     */
    public ResponseDTO<E> errorResult(){
        return new ResponseDTO<E>(false, "500", "调用接口失败");
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
