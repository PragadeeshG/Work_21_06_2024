package com.test1;

public class DesignPatternData {
	private String patternCode;
	private String patternName;
	private String localenvironment;
	private String tradeenvironment;
	private String shortDescription;
	private String multiPatternOption;
	private String patternParams;
	private Integer uploadVersion;
	private String launchEnvironment;
	private String manageEnvironment;
	private String status;

	public DesignPatternData() {

	}

	public DesignPatternData(String patternCode, String patternName, String localenvironment, String tradeenvironment,
			String shortDescription, String multiPatternOption, String patternParams, Integer uploadVersion,
			String launchEnvironment, String manageEnvironment, String status) {
		super();
		this.patternCode = patternCode;
		this.patternName = patternName;
		this.localenvironment = localenvironment;
		this.tradeenvironment = tradeenvironment;
		this.shortDescription = shortDescription;
		this.multiPatternOption = multiPatternOption;
		this.patternParams = patternParams;
		this.uploadVersion = uploadVersion;
		this.launchEnvironment = launchEnvironment;
		this.manageEnvironment = manageEnvironment;
		this.status = status;
	}

	public String getPatternCode() {
		return patternCode;
	}

	public void setPatternCode(String patternCode) {
		this.patternCode = patternCode;
	}

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	public String getLocalenvironment() {
		return localenvironment;
	}

	public void setLocalenvironment(String localenvironment) {
		this.localenvironment = localenvironment;
	}

	public String getTradeenvironment() {
		return tradeenvironment;
	}

	public void setTradeenvironment(String tradeenvironment) {
		this.tradeenvironment = tradeenvironment;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getMultiPatternOption() {
		return multiPatternOption;
	}

	public void setMultiPatternOption(String multiPatternOption) {
		this.multiPatternOption = multiPatternOption;
	}

	public String getPatternParams() {
		return patternParams;
	}

	public void setPatternParams(String patternParams) {
		this.patternParams = patternParams;
	}

	public Integer getUploadVersion() {
		return uploadVersion;
	}

	public void setUploadVersion(Integer uploadVersion) {
		this.uploadVersion = uploadVersion;
	}

	public String getLaunchEnvironment() {
		return launchEnvironment;
	}

	public void setLaunchEnvironment(String launchEnvironment) {
		this.launchEnvironment = launchEnvironment;
	}

	public String getManageEnvironment() {
		return manageEnvironment;
	}

	public void setManageEnvironment(String manageEnvironment) {
		this.manageEnvironment = manageEnvironment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
