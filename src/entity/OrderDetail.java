package entity;

import java.math.BigDecimal;

public class OrderDetail {
    private String oid;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    public OrderDetail(String oid, String itemCode, int qty, BigDecimal unitPrice) {
        this.setOid(oid);
        this.setItemCode(itemCode);
        this.setQty(qty);
        this.setUnitPrice(unitPrice);
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
