package com.karan.journal.api.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class WeatherResponse {

    private Current current;

    @Getter
    @Setter
    public class Current{

        @JsonProperty("tempC")
        private double temp_c;

        @JsonProperty("feelslikeC")
        private double feelslike_c;
    }
}
