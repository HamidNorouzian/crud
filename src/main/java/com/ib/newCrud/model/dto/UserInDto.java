package com.ib.newCrud.model.dto;

import com.ib.newCrud.model.entity.UserEntity;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInDto {

    private String name ;
    private String lastName;
    private String age ;
    private String passWord;


    public UserEntity convertToEntity (UserEntity entity){
        if (entity == null){

            entity = new UserEntity();
            entity.setName(this.name);
            entity.setLastName(this.lastName);
            entity.setAge(this.age);
            entity.setPassWord(this.passWord);
        }

        return entity;
    }
}
