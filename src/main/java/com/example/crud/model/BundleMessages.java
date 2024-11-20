package com.example.crud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BundleMessages {
    @JsonProperty("messages_ar")
private String messagesArabic;
    @JsonProperty("messages_en")
private String messagesEnglish;
}
