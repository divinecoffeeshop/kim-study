package com.practice.practice;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "apitest")
public class apiTestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    @Column(name = "api_key")
    private String apiKey;

    @Column(name = "request_id")
    private String requestId;

    @Column(name = "uri_path")
    private String uriPath;

    @Column(name = "version")
    private String version;

    @Column(name = "method")
    private String method;

    @Column(name = "msg")
    private String msg;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

    @Column(name = "created_dt")
    private LocalDateTime createdDt = LocalDateTime.now();

    @Column(name = "deleted_dt")
    private LocalDateTime deletedDt;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

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

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
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
