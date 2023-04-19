package com.sbep.SBEP.Token;

import com.sbep.SBEP.Entity.Utilizatori;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    //public Long id1;

    @Column(unique = true)
    public String token;

    //@Column(unique = true)
    //public String token2;

    @Enumerated(EnumType.STRING)
    public TokenType tokenType = TokenType.BEARER;

    public boolean revoked;

    public boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    //@JoinColumn(name = "admin_id")
    public Utilizatori utilizator;
    //public Administratori administratori;
}
