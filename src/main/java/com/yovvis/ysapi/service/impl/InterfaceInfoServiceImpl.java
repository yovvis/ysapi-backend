package com.yovvis.ysapi.service.impl;

import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yovvis.ysapi.common.ErrorCode;
import com.yovvis.ysapi.exception.BusinessException;
import com.yovvis.ysapi.exception.ThrowUtils;
import com.yovvis.ysapi.model.entity.InterfaceInfo;
import com.yovvis.ysapi.service.InterfaceInfoService;
import com.yovvis.ysapi.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author cruiser
 * @description 针对表【interface_info(接口表)】的数据库操作Service实现
 * @createDate 2023-11-07 15:49:00
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口名称过长");
        }
    }
}




