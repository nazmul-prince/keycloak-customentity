package com.keycloak.customentity.provider;

import java.util.Arrays;
import java.util.List;

import com.keycloak.customentity.entity.UserCounts;
import com.keycloak.customentity.providerfactory.UserCountsEntityProviderFactory;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;

public class UserCountsEntityProvider implements JpaEntityProvider {

  private static Class<?>[] entities = {UserCounts.class};

  @Override
  public List<Class<?>> getEntities() {
    return Arrays.<Class<?>>asList(entities);
  }

  @Override
  public String getChangelogLocation() {
    return "META-INF/jpa-changelog-23.0.0.xml";
  }

  @Override
  public void close() {}

  @Override
  public String getFactoryId() {
    return UserCountsEntityProviderFactory.ID;
  }
}
