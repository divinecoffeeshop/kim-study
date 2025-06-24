
package com.practice.practice;
import java.sql.Date;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class postDTO {
    private String apiKey;
    private String requestId;
    private String uriPath;
    private String version;
    private String method;
    private String msg;
    private boolean isDeleted;
    private Date createdDt;
    private Date deletedDt;
}
