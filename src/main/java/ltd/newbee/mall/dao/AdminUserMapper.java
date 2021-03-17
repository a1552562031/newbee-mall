package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    int insert(AdminUser record);
    AdminUser login(@Param("userName")String userName,@Param("password")String password);
    AdminUser getUserDetailById(Integer loginUserId);
    Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword);
    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);
}
