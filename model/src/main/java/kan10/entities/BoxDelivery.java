package kan10.entities;

import javax.persistence.*;

@Entity
@Table(name="boxDelivery")
public class BoxDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="price")
    private double price;

    @Column(name="deliveryTime")
    private int deliveryTime;

    @Column(name="description")
    private String description;

    @Column(name="productId")
    private String productId;

    @Column(name="boxSize")
    private float boxSize;

    public BoxDelivery(){}

    public BoxDelivery(double price, int deliveryTime, String description, String productId, float boxSize) {
        this.price = price;
        this.deliveryTime = deliveryTime;
        this.description = description;
        this.productId = productId;
        this.boxSize = boxSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(float boxSize) {
        this.boxSize = boxSize;
    }
}
