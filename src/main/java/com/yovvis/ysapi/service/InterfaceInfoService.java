package com.yovvis.ysapi.service;

import com.yovvis.ysapi.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yovvis.ysapi.model.entity.Post;

/**
* @author cruiser
* @description 针对表【interface_info(接口表)】的数据库操作Service
* @createDate 2023-11-07 15:49:00
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
