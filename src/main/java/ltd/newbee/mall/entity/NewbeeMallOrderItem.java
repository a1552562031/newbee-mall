package ltd.newbee.mall.entity;

public class NewbeeMallOrderItem {

  private long orderItemId;
  private long orderId;
  private long goodsId;
  private String goodsName;
  private String goodsCoverImg;
  private long sellingPrice;
  private long goodsCount;
  private java.sql.Timestamp createTime;


  public long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(long orderItemId) {
    this.orderItemId = orderItemId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getGoodsCoverImg() {
    return goodsCoverImg;
  }

  public void setGoodsCoverImg(String goodsCoverImg) {
    this.goodsCoverImg = goodsCoverImg;
  }


  public long getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(long sellingPrice) {
    this.sellingPrice = sellingPrice;
  }


  public long getGoodsCount() {
    return goodsCount;
  }

  public void setGoodsCount(long goodsCount) {
    this.goodsCount = goodsCount;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
