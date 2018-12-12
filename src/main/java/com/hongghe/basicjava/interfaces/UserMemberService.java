package com.hongghe.basicjava.interfaces;

/**
 * 用户注册的实现
 *
 * @author hongghe 2018/12/12
 */
public class UserMemberService implements UserMember {

    @Override
    public Boolean isNewUser(Long uid) {
        if (uid == null || uid <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean userRegister(Long mobile) {
        if (mobile == null || mobile <= 0) {
            return false;
        }
        return true;
    }

}
