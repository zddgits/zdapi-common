package com.zd.zdcommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zd.zdcommon.model.entity.UserInterfaceInfo;


/**
* @author zdsss
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-03-22 18:22:00
*/
public interface InnerUserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
