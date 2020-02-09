/**
 * FileName: OrderService Author:   sunny Date:     2020/1/30 23:59 Description: OrderService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.dubbo.service;

import java.util.List;

import facade.dto.UserAddress;

/**
 * 〈一句话功能简述〉<br> 
 * 〈OrderService〉
 *
 * @author sunny
 * @create 2020/1/30
 * @since 1.0.0
 */
public interface OrderService {
    

    /* *
     * @Author sunny
     * @Description  初始化订单信息
     * @Date 2:47 2020/2/10
     * @Param [userId]
     * @return java.util.List<facade.dto.UserAddress>
     **/
    List<UserAddress> initOrder(Integer userId);
}
