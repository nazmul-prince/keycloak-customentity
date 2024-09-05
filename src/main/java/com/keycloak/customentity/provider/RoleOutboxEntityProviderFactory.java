package com.keycloak.customentity.provider;

import org.keycloak.Config.Scope;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.models.RealmModel;

public class RoleOutboxEntityProviderFactory implements JpaEntityProviderFactory {

  protected static final String ID = "role-outbox-entity";

  @Override
  public JpaEntityProvider create(KeycloakSession session) {
    return new RoleOutboxEntityProvider();
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
