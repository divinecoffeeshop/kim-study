package com.practice.practice;

import java.time.LocalDateTime;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class postDTO {
    private String apiKey;
    private String requestId;
    private String uriPath;
    private String version;
    private String method;
    private String msg;
    private boolean isDeleted;
    private LocalDateTime createdDt;
    private LocalDateTime deletedDt;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getUriPath() {
        return uriPath;
    }

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public boolean isDeleted() {
        return isDeleted;
    }
    
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    public LocalDateTime getCreatedDt() {
        return createdDt;
    }
    
    public void setCreatedDt(LocalDateTime createdDt) {
        this.createdDt = createdDt;
    }
    
    public LocalDateTime getDeletedDt() {
        return deletedDt;
    }
    
    public void setDeletedDt(LocalDateTime deletedDt) {
        this.deletedDt = deletedDt;
    }
}
