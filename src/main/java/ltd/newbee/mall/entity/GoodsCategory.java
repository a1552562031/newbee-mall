package ltd.newbee.mall.entity;

public class GoodsCategory {

  private long categoryId;
  private long categoryLevel;
  private long parentId;
  private String categoryName;
  private long categoryRank;
  private long isDeleted;
  private java.sql.Timestamp createTime;
  private long createUser;
  private java.sql.Timestamp updateTime;
  private long updateUser;


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public long getCategoryLevel() {
    return categoryLevel;
  }

  public void setCategoryLevel(long categoryLevel) {
    this.categoryLevel = categoryLevel;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public long getCategoryRank() {
    return categoryRank;
  }

  public void setCategoryRank(long categoryRank) {
    this.categoryRank = categoryRank;
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
