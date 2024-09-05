package com.keycloak.customentity.entity;

import jakarta.persistence.*;
import lombok.*;
import org.keycloak.events.admin.ResourceType;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role_outbox")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleOutbox {
    @Id
    @Column(name = "id", length = 36)
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "is_processed", nullable = false)
    protected boolean isProcessed;

    @Column(name = "user_id", nullable = false)
    protected String user_id;

    @Column(name = "event_type", nullable = false)
    @Enumerated(EnumType.STRING)
    protected ResourceType EventType;

    @Column(name = "created_by")
    protected String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    protected Date createdAt;

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) createdAt = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date at) {
        createdAt = at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof RoleOutbox)) return false;

        RoleOutbox that = (RoleOutbox) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}