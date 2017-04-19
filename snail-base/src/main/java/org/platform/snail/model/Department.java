package org.platform.snail.model;

import java.math.BigDecimal;
import java.util.Date;

public class Department implements java.io.Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.DEPARTMENT_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.PARENT_DEPARTMENT_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String parentDepartmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.DEPARTMENT_NAME
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String departmentName;
    
    private String describtion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.DEPARTMENT_LEVEL
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String departmentLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.USER_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.CREATE_TIME
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.CREATE_USER_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEPARTMENT.STAUTS
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    private String stauts;
    
    
    private String childCount;
    
    private String hourceNumber;
    
    

    public String getChildCount() {
		return childCount;
	}

	public void setChildCount(String childCount) {
		this.childCount = childCount;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.DEPARTMENT_ID
     *
     * @return the value of DEPARTMENT.DEPARTMENT_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.DEPARTMENT_ID
     *
     * @param departmentId the value for DEPARTMENT.DEPARTMENT_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.PARENT_DEPARTMENT_ID
     *
     * @return the value of DEPARTMENT.PARENT_DEPARTMENT_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getParentDepartmentId() {
        return parentDepartmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.PARENT_DEPARTMENT_ID
     *
     * @param parentDepartmentId the value for DEPARTMENT.PARENT_DEPARTMENT_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId == null ? null : parentDepartmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.DEPARTMENT_NAME
     *
     * @return the value of DEPARTMENT.DEPARTMENT_NAME
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.DEPARTMENT_NAME
     *
     * @param departmentName the value for DEPARTMENT.DEPARTMENT_NAME
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.DEPARTMENT_LEVEL
     *
     * @return the value of DEPARTMENT.DEPARTMENT_LEVEL
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getDepartmentLevel() {
        return departmentLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.DEPARTMENT_LEVEL
     *
     * @param departmentLevel the value for DEPARTMENT.DEPARTMENT_LEVEL
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setDepartmentLevel(String departmentLevel) {
        this.departmentLevel = departmentLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.USER_ID
     *
     * @return the value of DEPARTMENT.USER_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.USER_ID
     *
     * @param userId the value for DEPARTMENT.USER_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.CREATE_TIME
     *
     * @return the value of DEPARTMENT.CREATE_TIME
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.CREATE_TIME
     *
     * @param createTime the value for DEPARTMENT.CREATE_TIME
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.CREATE_USER_ID
     *
     * @return the value of DEPARTMENT.CREATE_USER_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.CREATE_USER_ID
     *
     * @param createUserId the value for DEPARTMENT.CREATE_USER_ID
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEPARTMENT.STAUTS
     *
     * @return the value of DEPARTMENT.STAUTS
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public String getStauts() {
        return stauts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEPARTMENT.STAUTS
     *
     * @param stauts the value for DEPARTMENT.STAUTS
     *
     * @mbggenerated Fri Dec 14 11:16:28 CST 2012
     */
    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }
    
	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public String getHourceNumber() {
		return hourceNumber;
	}

	public void setHourceNumber(String hourceNumber) {
		this.hourceNumber = hourceNumber;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId
				+ ", parentDepartmentId=" + parentDepartmentId
				+ ", departmentName=" + departmentName + ", describtion="
				+ describtion + ", departmentLevel=" + departmentLevel
				+ ", userId=" + userId + ", createTime=" + createTime
				+ ", createUserId=" + createUserId + ", stauts=" + stauts
				+ ", childCount=" + childCount + ", hourceNumber="
				+ hourceNumber + "]";
	}

	
	



	
    
}