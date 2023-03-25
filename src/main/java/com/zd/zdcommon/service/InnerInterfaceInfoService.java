package com.zd.zdcommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zd.zdcommon.model.entity.InterfaceInfo;


/**
* @author zdsss
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-14 19:55:22
*/
public interface InnerInterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
