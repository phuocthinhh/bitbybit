package b.Model;

import java.math.*;
import java.time.*;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private Long idPayment;

    @Column(name = "payment_date", nullable = false)
    private OffsetDateTime paymentDate;

    @Column(name = "payment_method", nullable = false)
    private String paymentMethod;

    @Column(name = "amount_paid", nullable = false)
    private BigDecimal amountPaid;
    
    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

    @Column(name = "transaction_id", nullable = false)
    private String transactionId;

    @Column(name = "notes")
    private String notes;

    @OneToOne
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", nullable = false)
    private Order order;
}
