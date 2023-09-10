package narif.poc.projects.tacocloudauthserver.repository;

import narif.poc.projects.tacocloudauthserver.model.IdpUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IdpUserRepo extends JpaRepository<IdpUser, Long> {

    Optional<IdpUser> findByUsername(String username);
}
