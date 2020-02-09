/**
 * FileName: UserAddress Author:   sunny Date:     2020/1/30 23:55 Description: 用户地址类 History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package facade.dto;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户地址类〉
 *
 * @author sunny
 * @create 2020/1/30
 * @since 1.0.0
 */
public class UserAddress implements Serializable {
    private static final long serialVersionUID = -1342645860196462363L;

    private Integer id;
    private String userAddress; //收货地址
    private Integer userId;  //用户id
    private String consignee;  //收货人
    private String phoneNum;   //电话号码
    private String isDefault;  //是否为默认(Y:是;N:否)

    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, Integer userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userAddress='" + userAddress + '\'' +
                ", userId=" + userId +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }
}
