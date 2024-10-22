	package b.Model;
	
	import java.math.*;
	import java.time.*;
	import java.util.*;
	import jakarta.persistence.*;
	import lombok.*;
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "orders")
	public class Order {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_order")
	    private Long idOrder;
	
	    @Column(name = "create_date", nullable = false)
	    private OffsetDateTime createDate;
	
	    @Column(name = "total_amount", nullable = false)
	    private BigDecimal totalAmount;
	
	    @Column(name = "status", nullable = false)
	    private boolean status;
	
	    @Column(name = "final_amount", nullable = false)
	    private BigDecimal finalAmount;
	
	    @ManyToOne
	    @JoinColumn(name = "id_cart", nullable = false)
	    private Cart cart;
	
	    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private Payment payment;
	
	    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private Shipment shipment;
	
	    @ManyToOne
	    @JoinColumn(name = "id_discount")
	    private Discounts discounts;
	
	    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<OrderDetail> orderDetails;
	}
