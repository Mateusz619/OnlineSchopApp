package com.onlineshoppingsystem.project.data;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "Product")
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Product")
    private int id;
    private float price;
    private int quantity;
    private String type;
    private String name;

    public Product(float price, int quantity, String type, String name, int id){
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.name = name;
        this.id = id;

    }
}
