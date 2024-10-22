package b.Model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipments")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shipment")
    private Long idShipment;

    @Column(name = "shipment_date", nullable = false)
    private String shipmentDate;

    @Column(name = "carrier", nullable = false)
    private String carrier;

    @Column(name = "tracking_number", nullable = false, unique = true)
    private String trackingNumber;

    @Column(name = "shipping_status", nullable = false)
    private String shippingStatus;

    @Column(name = "shipping_address", nullable = false)
    private Long shippingAddress;

    @Column(name = "estimated_delivery", nullable = false)
    private LocalDate estimatedDelivery;

    @Column(name = "actual_delivery", nullable = false)
    private LocalDate actualDelivery;

    @Column(name = "notes", nullable = false)
    private String notes;


    @OneToOne
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", nullable = false)
    private Order order;


    private String generateTrackingNumber(Long idOrder) {
        String randomPart = UUID.randomUUID().toString().substring(0, 8);
        String trackingNumber = "ORD" + idOrder + "-" + randomPart;
        return trackingNumber.toUpperCase();
    }
}
