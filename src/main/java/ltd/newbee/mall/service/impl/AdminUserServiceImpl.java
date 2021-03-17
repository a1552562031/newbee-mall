package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.AdminUserMapper;
import ltd.newbee.mall.entity.AdminUser;
import ltd.newbee.mall.service.AdminUserService;
import ltd.newbee.mall.util.MD5Util;

import javax.annotation.Resource;

public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;
    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5= MD5Util.MD5Encode(password,"UTF-8");
        return adminUserMapper.login(userName,passwordMd5);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.getUserDetailById(loginUserId);
    }

    @Override
    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        AdminUser adminUser = adminUserMapper.getUserDetailById(loginUserId);
        if (adminUser!=null){
            String originalPasswordMD5 = MD5Util.MD5Encode(originalPassword, "UTF-8");
            String nwePasswordMD5 = MD5Util.MD5Encode(newPassword, "UTF-8");
            if (originalPasswordMD5.equals(adminUser.getLoginPassword())){
                adminUser.setLoginPassword(nwePasswordMD5);
//                if (adminUserMapper.upd)
            }
        }
        return null;
    }

    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        return null;
    }
}
