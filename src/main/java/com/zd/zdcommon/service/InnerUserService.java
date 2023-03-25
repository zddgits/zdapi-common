package com.zd.zdcommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zd.zdcommon.model.entity.User;


/**
 * 用户服务
 *
 * @author zd
 */
public interface InnerUserService extends IService<User> {
    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);


}
