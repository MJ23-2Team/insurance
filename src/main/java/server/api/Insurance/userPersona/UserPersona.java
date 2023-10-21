package server.api.insurance.userPersona;

import jakarta.persistence.*;
import lombok.*;
import server.api.insurance.insurance.Insurance;
import server.api.insurance.util.Constants.Gender;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userPersonaid")
    private int userPersonaID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insuranceid")
    private Insurance insurance;

    private Gender sex;
    private int age;
    private String job;
    private int incomeLevel;
}
