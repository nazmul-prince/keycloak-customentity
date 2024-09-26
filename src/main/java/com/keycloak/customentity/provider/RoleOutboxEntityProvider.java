package com.keycloak.customentity.provider;

import java.util.Arrays;
import java.util.List;

import com.keycloak.customentity.entity.RoleOutbox;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;

public class RoleOutboxEntityProvider implements JpaEntityProvider {

  private static Class<?>[] entities = {RoleOutbox.class};

  @Override
  public List<Class<?>> getEntities() {
    return Arrays.<Class<?>>asList(entities);
  }

  @Override
  public String getChangelogLocation() {
    return "META-INF/jpa-user_counts-changelog-23.0.0.xml";
  }

  @Override
  public void close() {}

  @Override
  public String getFactoryId() {
    return RoleOutboxEntityProviderFactory.ID;
  }
}
