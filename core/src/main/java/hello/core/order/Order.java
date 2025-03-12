package hello.core.order;

public class Order {

    private long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(int discountPrice, int itemPrice, String itemName, long memberId) {
        this.discountPrice = discountPrice;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
        this.memberId = memberId;
    }

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
