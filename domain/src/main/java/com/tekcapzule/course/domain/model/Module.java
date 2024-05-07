package com.tekcapsule.course.domain.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Module {
    private int serialNumber;
    private int duration;
    private String name;
    private String coverImageUrl;
    @DynamoDBAttribute(attributeName = "chapters")
    private List<Chapter> chapters;
}
