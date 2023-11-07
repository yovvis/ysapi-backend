package com.yovvis.ysapi.model.dto.interfaceinfo;

import com.yovvis.ysapi.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String reqestHeader;

    /**
     * 响应头
     */
    private String reponseHeader;


    /**
     * 请求类型
     */
    private String method;
}
