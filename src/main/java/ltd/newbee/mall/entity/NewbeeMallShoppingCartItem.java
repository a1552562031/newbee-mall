package ltd.newbee.mall.entity;

public class NewbeeMallShoppingCartItem {

  private long cartItemId;
  private long userId;
  private long goodsId;
  private long goodsCount;
  private long isDeleted;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getCartItemId() {
    return cartItemId;
  }

  public void setCartItemId(long cartItemId) {
    this.cartItemId = cartItemId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getGoodsCount() {
    return goodsCount;
  }

  public void setGoodsCount(long goodsCount) {
    this.goodsCount = goodsCount;
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


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
