package hello.itermservice.domain.item;

import lombok.Data;

@Data // 주의
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {}

    public Item(String itermName, Integer price, Integer quantity) {
        this.itemName = itermName;
        this.price = price;
        this.quantity = quantity;
    }
}

