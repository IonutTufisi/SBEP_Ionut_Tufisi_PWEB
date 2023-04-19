package com.sbep.SBEP.Repository;

import com.sbep.SBEP.Token.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    @Query(value = """
            select t from Token t inner join Utilizatori u\s
            on t.utilizator.id_utilizator = u.id\s
            where u.id = :id and (t.expired = false or t.revoked = false)\s
            """)
            /*select t from Token t inner join Administratori a\s
            on t.utilizator.id_admin = a.id2\s
            where a.id = :id and (t.expired = false or t.revoked = false)\s
            """)*/

    /*@Query(value = """
      select t from Token t inner join Administratori a\s
      on t.utilizator.id_admin = a.id2\s
      where a.id = :id and (t.expired = false or t.revoked = false)\s
      """)*/
    List<Token> findAllValidTokenByUser(Long id);
    //List<Token> findAllValidTokenByUser1(Long id2);

    Optional<Token> findByToken(String token);
    //Optional<Token> findByToken2(String token2);
}
