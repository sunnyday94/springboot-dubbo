/**
 * FileName: OrderController Author:   sunny Date:     2020/2/10 2:45 Description: OrderController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.dubbo.controller;

import com.sunny.dubbo.service.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

import facade.dto.UserAddress;

/**
 * 〈一句话功能简述〉<br> 
 * 〈OrderController〉
 *
 * @author sunny
 * @create 2020/2/10
 * @since 1.0.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /* *
     * @Author sunny
     * @Description  初始化订单
     * @Date 2:48 2020/2/10
     * @Param [userId]
     * @return java.util.List<facade.dto.UserAddress>
     **/
    @GetMapping("/initOrder/{userId}")
    public List<UserAddress> initOrder(@PathVariable("userId") Integer userId){
        return orderService.initOrder(userId);
    }
}