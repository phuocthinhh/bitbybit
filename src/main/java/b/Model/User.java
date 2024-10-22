package b.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    
    @NotBlank(message = "Email cannot be blank")
    @Size(max = 50, message = "Email must not exceed 50 characters")
    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @NotBlank(message = "Password cannot be blank")
    @Size(max = 16, message = "Password must not exceed 16 characters")
    @Column(name = "password", nullable = false, length = 16)
    private String password;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @Column(name = "firstName", nullable = false, length = 255)
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 255)
    private String lastName;

    @Column(name = "phoneNumber", nullable = false, length = 11)
    private String phoneNumber;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @Column(name = "role", nullable = false, length = 50)
    private String role;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cart> carts;
}
