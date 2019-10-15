package ru.mytracky.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import ru.mytracky.dto.track.TrackDto;
import ru.mytracky.dto.Views;
import ru.mytracky.dto.track.TrackGetDto;
import ru.mytracky.model.Track;
import ru.mytracky.model.User;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private List<TrackGetDto> tracks;

}