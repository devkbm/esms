package com.like.term.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.like.common.domain.AuditEntity;

import lombok.ToString;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@ToString(callSuper=true, includeFieldNames=true)
@Entity
@Table(name = "term")
@EntityListeners(AuditingEntityListener.class)
public class Term extends AuditEntity implements Serializable {
	
	private static final long serialVersionUID = -206378092418320228L;

	@Id	
	@Column(name="term_name")
	String name;	
		
	@Column(name="term_abbr")
	String abbreviation;
	
	@Column(name="term_name_eng")
	String nameEng;
		
	@Column(name="term_abbr_eng")
	String abbreviationEng;
	
	@Column(name="term_group")
	String group;
	
	@Column(name="term_definition")
	String definition;
	
	@Column(name="detail")
	String detail;
	
	@Column(name="cmt")
	String comment;
	
	protected Term() {}	
}
