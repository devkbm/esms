package com.like.common.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditEntity {
	
	@CreatedDate
	@Column(name = "created_dt", nullable = false, updatable = false)	
	protected LocalDateTime createdDateTime;	
	
	@CreatedBy
	@Column(name = "created_id", nullable = false, updatable = false)
	protected String createdId;
		
	@LastModifiedDate
	@Column(name = "updated_dt")
	protected LocalDateTime lastModifiedDateTime;
		
	@LastModifiedBy
	@Column(name = "updated_id")
	protected String lastModifiedId;

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedId() {
		return createdId;
	}

	public void setCreatedId(String createdId) {
		this.createdId = createdId;
	}

	public LocalDateTime getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getLastModifiedId() {
		return lastModifiedId;
	}

	public void setLastModifiedId(String lastModifiedId) {
		this.lastModifiedId = lastModifiedId;
	}

	@Override
	public String toString() {
		return "AuditEntity [createdDateTime=" + createdDateTime + ", createdId=" + createdId
				+ ", lastModifiedDateTime=" + lastModifiedDateTime + ", lastModifiedId=" + lastModifiedId + "]";
	}
	
}
