package com.ib.newCrud.model.dto;

import com.ib.newCrud.model.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserOutDto {

    private Long id ;
    private String name ;
    private String lastName;
    private String age ;

    public UserOutDto(UserEntity entity){
        if (entity == null){
            this.setId(entity.getId());
            this.setName(entity.getName());
            this.setLastName(entity.getLastName());
            this.setAge(entity.getAge());
        }
    }
}
