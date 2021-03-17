package ltd.newbee.mall.entity;

public class NewbeeMallGoodsInfo {

  private long goodsId;
  private String goodsName;
  private String goodsIntro;
  private long goodsCategoryId;
  private String goodsCoverImg;
  private String goodsCarousel;
  private String goodsDetailContent;
  private long originalPrice;
  private long sellingPrice;
  private long stockNum;
  private String tag;
  private long goodsSellStatus;
  private long createUser;
  private java.sql.Timestamp createTime;
  private long updateUser;
  private java.sql.Timestamp updateTime;


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


  public String getGoodsIntro() {
    return goodsIntro;
  }

  public void setGoodsIntro(String goodsIntro) {
    this.goodsIntro = goodsIntro;
  }


  public long getGoodsCategoryId() {
    return goodsCategoryId;
  }

  public void setGoodsCategoryId(long goodsCategoryId) {
    this.goodsCategoryId = goodsCategoryId;
  }


  public String getGoodsCoverImg() {
    return goodsCoverImg;
  }

  public void setGoodsCoverImg(String goodsCoverImg) {
    this.goodsCoverImg = goodsCoverImg;
  }


  public String getGoodsCarousel() {
    return goodsCarousel;
  }

  public void setGoodsCarousel(String goodsCarousel) {
    this.goodsCarousel = goodsCarousel;
  }


  public String getGoodsDetailContent() {
    return goodsDetailContent;
  }

  public void setGoodsDetailContent(String goodsDetailContent) {
    this.goodsDetailContent = goodsDetailContent;
  }


  public long getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(long originalPrice) {
    this.originalPrice = originalPrice;
  }


  public long getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(long sellingPrice) {
    this.sellingPrice = sellingPrice;
  }


  public long getStockNum() {
    return stockNum;
  }

  public void setStockNum(long stockNum) {
    this.stockNum = stockNum;
  }


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public long getGoodsSellStatus() {
    return goodsSellStatus;
  }

  public void setGoodsSellStatus(long goodsSellStatus) {
    this.goodsSellStatus = goodsSellStatus;
  }


  public long getCreateUser() {
    return createUser;
  }

  public void setCreateUser(long createUser) {
    this.createUser = createUser;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(long updateUser) {
    this.updateUser = updateUser;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
