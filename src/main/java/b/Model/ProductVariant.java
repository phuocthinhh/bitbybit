package b.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "productVariants")
public class ProductVariant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_variant")
    private Long idVariant;

    @Column(name = "size", length = 50, nullable = false)
    private String size;

    @Column(name = "color", length = 50, nullable = false)
    private String color;

    @Column(name = "brand", length = 255, nullable = false)
    private String brand;

    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "image", length = 255, nullable = false)
    private String image;

    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id_product", nullable = false)
    private Product product;
}
