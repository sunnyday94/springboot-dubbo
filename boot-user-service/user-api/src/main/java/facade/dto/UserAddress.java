/**
 * FileName: UserAddress Author:   sunny Date:     2020/1/30 23:55 Description: 用户地址类 History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package facade.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户地址类〉
 *
 * @author sunny
 * @create 2020/1/30
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserAddress implements Serializable {
    private static final long serialVersionUID = -1342645860196462363L;

    private Integer id;
    private String userAddress; //收货地址
    private Integer userId;  //用户id
    private String consignee;  //收货人
    private String phoneNum;   //电话号码
    private String isDefault;  //是否为默认(Y:是;N:否)

}
