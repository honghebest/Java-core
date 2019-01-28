package com.hongghe.basicjava.interfaces;

/**
 * 用户注册场景的操作
 *
 * @author hongghe 2018/12/12
 */
public interface UserMember {

    /**
     * User check is new or not.
     *
     * @param uid user uid.
     * @return is or not
     */
    Boolean isNewUser(Long uid);

    /**
     * User register member.
     *
     * @param mobile user mobile
     * @return success or fail
     */
    Boolean userRegister(Long mobile);

    /**
     * user in white list or not.
     * @param uid user uid.
     * @param mobile user mobile
     * @return result
     */
    Boolean whiteList(Long uid, String mobile);

}
