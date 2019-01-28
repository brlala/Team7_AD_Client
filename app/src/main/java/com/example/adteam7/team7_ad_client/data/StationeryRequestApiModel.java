package com.example.adteam7.team7_ad_client.data;

import java.util.List;

public class StationeryRequestApiModel {
    private String RequestId;
    private String RequestedBy;
    private String ApprovedBy;
    private String DepartmentId;
    private String Status;
    private String RequestDate;
    private List<RequestTransactionDetailApiModel> requestTransactionDetailApiModels;

    public StationeryRequestApiModel(String requestId, String requestedBy, String approvedBy, String departmentId, String status, String requestDate, List<RequestTransactionDetailApiModel> requestTransactionDetailApiModels) {
        RequestId = requestId;
        RequestedBy = requestedBy;
        ApprovedBy = approvedBy;
        DepartmentId = departmentId;
        Status = status;
        RequestDate = requestDate;
        this.requestTransactionDetailApiModels = requestTransactionDetailApiModels;
    }

    public String getRequestId() {
        return RequestId;
    }

    public String getRequestedBy() {
        return RequestedBy;
    }

    public String getApprovedBy() {
        return ApprovedBy;
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public String getStatus() {
        return Status;
    }

    public String getRequestDate() {
        return RequestDate;
    }

    public List<RequestTransactionDetailApiModel> getRequestTransactionDetailApiModels() {
        return requestTransactionDetailApiModels;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public void setRequestedBy(String requestedBy) {
        RequestedBy = requestedBy;
    }

    public void setApprovedBy(String approvedBy) {
        ApprovedBy = approvedBy;
    }

    public void setDepartmentId(String departmentId) {
        DepartmentId = departmentId;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setRequestDate(String requestDate) {
        RequestDate = requestDate;
    }

    public void setRequestTransactionDetailApiModels(List<RequestTransactionDetailApiModel> requestTransactionDetailApiModels) {
        this.requestTransactionDetailApiModels = requestTransactionDetailApiModels;
    }
}

