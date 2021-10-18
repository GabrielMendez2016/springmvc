package com.samples.demos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tpp_log database table.
 * 
 */
@Entity
@Table(schema = "clkdata", name="tpp_log")
@NamedQuery(name="TppLog.findAll", query="SELECT t FROM TppLog t")
public class TppLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="sequenceGenerator", sequenceName="clkdata.tpp_log_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;

	@Column(name="application_id")
	private Long applicationId;

	@Column(name="created_ts")
	private Timestamp createdTs;

	@Column(name="requested_system_user")
	private Long requestedSystemUser;

	private Boolean response;

	@Column(name="tpp_content")
	private String tppContent;

	@Column(name="tpp_type_id")
	private Long tppTypeId;

	public TppLog() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Timestamp getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}

	public Long getRequestedSystemUser() {
		return this.requestedSystemUser;
	}

	public void setRequestedSystemUser(Long requestedSystemUser) {
		this.requestedSystemUser = requestedSystemUser;
	}

	public Boolean getResponse() {
		return this.response;
	}

	public void setResponse(Boolean response) {
		this.response = response;
	}

	public String getTppContent() {
		return this.tppContent;
	}

	public void setTppContent(String tppContent) {
		this.tppContent = tppContent;
	}

	public Long getTppTypeId() {
		return this.tppTypeId;
	}

	public void setTppTypeId(Long tppTypeId) {
		this.tppTypeId = tppTypeId;
	}

}