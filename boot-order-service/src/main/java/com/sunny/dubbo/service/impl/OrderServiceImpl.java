/**
 * FileName: OrderServiceImpl Author:   sunny Date:     2020/1/31 0:01 Description: OrderService实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunny.dubbo.service.OrderService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

import facade.UserService;
import facade.dto.UserAddress;

/**
 * 〈一句话功能简述〉<br> 
 * 〈OrderService实现类〉
 * 1. 将服务提供者注册到注册中心 (暴露服务)
 *      a.导入dubbo依赖(2.6.2);操作zookeeper的客户端(curator)
 *      b.配置服务提供者 (provider.xml)
 * 2. 让服务消费者去注册中心订阅服务提供者的服务地址
 * @author sunny
 * @create 2020/1/31
 * @since 1.0.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(Integer userId) {
        System.out.println(String.format("用户id为:%d", userId));
        //1.查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressListByUserId(userId);
        //循环打印地址
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }
}
