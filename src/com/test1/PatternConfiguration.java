package com.test1;

public class PatternConfiguration {
	private Integer configurationId;
	private String configurationOwner;
	private boolean activePattern;
	private Integer configurationTypeId;
	private String configurationType;
	private String configurationStatus;
	private Integer configurationDescription;
	private Integer ralativeDependencies;
	private String parentPom;
	private Integer flushInterval;
	private String buildParams;
	private String status;
	private String timeToExecute;

	public PatternConfiguration() {

	}

	public PatternConfiguration(Integer configurationId, String configurationOwner, boolean activePattern,
			Integer configurationTypeId, String configurationType, String configurationStatus,
			Integer configurationDescription, Integer ralativeDependencies, String parentPom, Integer flushInterval,
			String buildParams, String status, String timeToExecute) {
		super();
		this.configurationId = configurationId;
		this.configurationOwner = configurationOwner;
		this.activePattern = activePattern;
		this.configurationTypeId = configurationTypeId;
		this.configurationType = configurationType;
		this.configurationStatus = configurationStatus;
		this.configurationDescription = configurationDescription;
		this.ralativeDependencies = ralativeDependencies;
		this.parentPom = parentPom;
		this.flushInterval = flushInterval;
		this.buildParams = buildParams;
		this.status = status;
		this.timeToExecute = timeToExecute;
	}

	public Integer getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Integer configurationId) {
		this.configurationId = configurationId;
	}

	public String getConfigurationOwner() {
		return configurationOwner;
	}

	public void setConfigurationOwner(String configurationOwner) {
		this.configurationOwner = configurationOwner;
	}

	public boolean isActivePattern() {
		return activePattern;
	}

	public void setActivePattern(boolean activePattern) {
		this.activePattern = activePattern;
	}

	public Integer getConfigurationTypeId() {
		return configurationTypeId;
	}

	public void setConfigurationTypeId(Integer configurationTypeId) {
		this.configurationTypeId = configurationTypeId;
	}

	public String getConfigurationType() {
		return configurationType;
	}

	public void setConfigurationType(String configurationType) {
		this.configurationType = configurationType;
	}

	public String getConfigurationStatus() {
		return configurationStatus;
	}

	public void setConfigurationStatus(String configurationStatus) {
		this.configurationStatus = configurationStatus;
	}

	public Integer getConfigurationDescription() {
		return configurationDescription;
	}

	public void setConfigurationDescription(Integer configurationDescription) {
		this.configurationDescription = configurationDescription;
	}

	public Integer getRalativeDependencies() {
		return ralativeDependencies;
	}

	public void setRalativeDependencies(Integer ralativeDependencies) {
		this.ralativeDependencies = ralativeDependencies;
	}

	public String getParentPom() {
		return parentPom;
	}

	public void setParentPom(String parentPom) {
		this.parentPom = parentPom;
	}

	public Integer getFlushInterval() {
		return flushInterval;
	}

	public void setFlushInterval(Integer flushInterval) {
		this.flushInterval = flushInterval;
	}

	public String getBuildParams() {
		return buildParams;
	}

	public void setBuildParams(String buildParams) {
		this.buildParams = buildParams;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeToExecute() {
		return timeToExecute;
	}

	public void setTimeToExecute(String timeToExecute) {
		this.timeToExecute = timeToExecute;
	}

}
