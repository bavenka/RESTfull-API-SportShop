package com.test.model.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Павел on 12.08.2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class RoleDto {
    private Long id;
    private String name;

    public RoleDto() {
    }
}
