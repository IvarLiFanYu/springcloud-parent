package com.lfy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 李凡宇
 * @Description:
 * @Date: create in 15:43 2021/2/4
 * @Modified By: 李凡宇
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code,String message) {
        this(code,message,null);
    }
}
