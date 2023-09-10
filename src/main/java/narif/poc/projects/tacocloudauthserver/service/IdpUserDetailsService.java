package narif.poc.projects.tacocloudauthserver.service;

import lombok.RequiredArgsConstructor;
import narif.poc.projects.tacocloudauthserver.repository.IdpUserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IdpUserDetailsService implements UserDetailsService {

    private final IdpUserRepo idpUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return idpUserRepo.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("Username or password does not exists!"));
    }
}
