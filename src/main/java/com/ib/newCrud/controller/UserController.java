package com.ib.newCrud.controller;

import com.ib.newCrud.model.business.UserService;
import com.ib.newCrud.model.dto.UserInDto;
import com.ib.newCrud.model.dto.UserOutDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService ;
    }

    @PostMapping(value = "")
    public UserOutDto addUser(@RequestBody UserInDto userInDto){
        return userService.addUser(userInDto);
    }

    @PostMapping("")
    public List<UserOutDto> findAll(){
        return  userService.findAll() ;
    }

    @PostMapping("/{userId}")
    public UserOutDto getById(@PathVariable("userId") Long userId){
        return userService.getById(userId);
    }

    public void delete(){
        userService.delete();
    }

    @PostMapping("{userId}")
    public void deleteById(Long userId){
        userService.deleteById(userId);
    }

    @PostMapping("")
    public UserOutDto updateById(UserInDto userInDto , Long userId){
        return  userService.updateById(userInDto , userId);
    }


}
