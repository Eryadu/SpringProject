package io.pragra.feb2025ioc.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Data
//@AllArgsConstructor
@Setter
@Getter
public class Movie {
    private Integer movieID;
    private String movieName;
    private Integer releaseYear;
    private String genres;
    private List<String> cast;
    private Map<String , Integer> castSalary;

}
