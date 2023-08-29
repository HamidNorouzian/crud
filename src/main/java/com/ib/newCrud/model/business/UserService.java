package com.ib.newCrud.model.business;

import com.ib.newCrud.model.dto.UserInDto;
import com.ib.newCrud.model.dto.UserOutDto;
import com.ib.newCrud.model.entity.UserEntity;
import com.ib.newCrud.model.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final  UserRepository userRepository ;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository ;
    }
    public UserOutDto addUser(UserInDto userInDto){
        UserEntity userEntity = userRepository.save(new UserEntity());
        UserEntity entity = userRepository.save(userEntity);
        return new UserOutDto(entity);
    }


    public List<UserOutDto> findAll(){

        List<UserEntity> userEntityList = userRepository.findAll();
        return userEntityList.stream().map(entity -> new UserOutDto(entity)).collect(Collectors.toList());
    }

    public UserOutDto getById(Long userId){
        Optional<UserEntity> userEntityOptional = userRepository.findById(userId);
        if (userEntityOptional.isEmpty()){
            throw new NullPointerException();
        }

        return new UserOutDto(userEntityOptional.get());
    }

    public void delete(){
        userRepository.deleteAll();
    }

    public void deleteById(Long userId){
        Optional<UserEntity> userEntityOptional = userRepository.findById(userId);

        if (userEntityOptional.isEmpty()){
            throw new NullPointerException();
        }

        userRepository.deleteById(userId);
    }

    public UserOutDto updateById(UserInDto userInDto ,Long userId){
        Optional<UserEntity> userEntityOptional = userRepository.findById(userId);

        if (userEntityOptional.isEmpty()){
            throw new NullPointerException();
        }
        UserEntity userEntity = userEntityOptional.get();
        return new UserOutDto(userRepository.save(userEntity));

    }
}
