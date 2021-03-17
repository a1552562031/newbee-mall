package ltd.newbee.mall.entity;

public class Carousel {

  private long carouselId;
  private String carouselUrl;
  private String redirectUrl;
  private long carouselRank;
  private long isDeleted;
  private java.sql.Timestamp createTime;
  private long createUser;
  private java.sql.Timestamp updateTime;
  private long updateUser;


  public long getCarouselId() {
    return carouselId;
  }

  public void setCarouselId(long carouselId) {
    this.carouselId = carouselId;
  }


  public String getCarouselUrl() {
    return carouselUrl;
  }

  public void setCarouselUrl(String carouselUrl) {
    this.carouselUrl = carouselUrl;
  }


  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public long getCarouselRank() {
    return carouselRank;
  }

  public void setCarouselRank(long carouselRank) {
    this.carouselRank = carouselRank;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getCreateUser() {
    return createUser;
  }

  public void setCreateUser(long createUser) {
    this.createUser = createUser;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(long updateUser) {
    this.updateUser = updateUser;
  }

}
