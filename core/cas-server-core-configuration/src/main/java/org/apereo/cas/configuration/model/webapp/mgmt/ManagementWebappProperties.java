package org.apereo.cas.configuration.model.webapp.mgmt;

import com.google.common.collect.Lists;
import org.apereo.cas.configuration.model.support.ldap.LdapAuthorizationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;

/**
 * This is {@link ManagementWebappProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class ManagementWebappProperties {
    private List<String> adminRoles = Lists.newArrayList("ROLE_ADMIN");
    private String serverName = "https://localhost:8443";
    private String defaultLocale = "en";
    private List<String> authzAttributes = Lists.newArrayList();

    @NestedConfigurationProperty
    private LdapAuthorizationProperties ldapAuthz = new LdapAuthorizationProperties();

    private Resource userPropertiesFile = new ClassPathResource("user-details.properties");

    public List<String> getAdminRoles() {
        return adminRoles;
    }

    public void setAdminRoles(final List<String> adminRoles) {
        this.adminRoles = adminRoles;
    }

    public Resource getUserPropertiesFile() {
        return userPropertiesFile;
    }

    public void setUserPropertiesFile(final Resource userPropertiesFile) {
        this.userPropertiesFile = userPropertiesFile;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(final String serverName) {
        this.serverName = serverName;
    }

    public LdapAuthorizationProperties getLdapAuthz() {
        return ldapAuthz;
    }

    public void setLdapAuthz(final LdapAuthorizationProperties ldapAuthz) {
        this.ldapAuthz = ldapAuthz;
    }

    public List<String> getAuthzAttributes() {
        return authzAttributes;
    }

    public void setAuthzAttributes(final List<String> authzAttributes) {
        this.authzAttributes = authzAttributes;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(final String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
}



