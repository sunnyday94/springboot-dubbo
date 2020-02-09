/**
 * FileName: UserService Author:   sunny Date:     2020/1/30 23:54 Description: UserService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package facade;


import java.util.List;
import facade.dto.UserAddress;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserService〉
 *
 * @author sunny
 * @create 2020/1/30
 * @since 1.0.0
 */
public interface UserService {

    /* *
     * @Author sunny
     * @Description  根据用户id查询用户所有的收货地址
     * @Date 0:10 2020/1/31
     * @Param [userId]
     * @return java.util.List<com.sunny.dubbo.facade.dto.UserAddress>
     **/
    List<UserAddress> getUserAddressListByUserId(Integer userId);
}
