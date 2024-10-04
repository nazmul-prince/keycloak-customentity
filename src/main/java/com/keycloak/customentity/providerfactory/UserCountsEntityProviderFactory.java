package com.keycloak.customentity.providerfactory;

import com.keycloak.customentity.provider.UserCountsEntityProvider;
import org.keycloak.Config.Scope;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class UserCountsEntityProviderFactory implements JpaEntityProviderFactory {

  public static final String ID = "user-counts-entity-provider";

  @Override
  public JpaEntityProvider create(KeycloakSession session) {
    return new UserCountsEntityProvider();
  }

  @Override
  public String getId() {
    return ID;
  }

  @Override
  public void init(Scope config) {}

  @Override
  public void postInit(KeycloakSessionFactory factory) {
  }

  @Override
  public void close() {}

}
