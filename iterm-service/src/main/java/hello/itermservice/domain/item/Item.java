package hello.itermservice.domain.item;

import lombok.Data;

@Data // 주의
public class Item {

    private Long id;
    private String itermNam;
    private Integer price;
    private Integer quantity;

    public Item() {}

    public Item(String itermNam, Integer price, Integer quantity) {
        this.itermNam = itermNam;
        this.price = price;
        this.quantity = quantity;
    }
}

