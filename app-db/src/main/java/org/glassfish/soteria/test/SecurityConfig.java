package org.glassfish.soteria.test;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;

@BasicAuthenticationMechanismDefinition(
        realmName = "Test Realm"
)
@ApplicationScoped
public class SecurityConfig {

}
