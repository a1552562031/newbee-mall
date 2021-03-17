package ltd.newbee.mall.entity;


public class MallUser {

  private long userId;
  private String nickName;
  private String loginName;
  private String passwordMd5;
  private String introduceSign;
  private String address;
  private long isDeleted;
  private long lockedFlag;
  private java.sql.Timestamp createTime;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public String getPasswordMd5() {
    return passwordMd5;
  }

  public void setPasswordMd5(String passwordMd5) {
    this.passwordMd5 = passwordMd5;
  }


  public String getIntroduceSign() {
    return introduceSign;
  }

  public void setIntroduceSign(String introduceSign) {
    this.introduceSign = introduceSign;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }


  public long getLockedFlag() {
    return lockedFlag;
  }

  public void setLockedFlag(long lockedFlag) {
    this.lockedFlag = lockedFlag;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
