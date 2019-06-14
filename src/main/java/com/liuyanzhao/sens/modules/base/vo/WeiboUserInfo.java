package com.liuyanzhao.sens.modules.base.vo;

import lombok.Data;

/**
 * http://open.weibo.com/wiki/2/users/show
 * @author 言曌
 */
@Data
public class WeiboUserInfo {

    /**
     * 唯一id
     */
    private String uid;

    /**
     * 名称
     */
    private String name;

    /**
     * 头像
     */
    private String profile_image_url;
}
