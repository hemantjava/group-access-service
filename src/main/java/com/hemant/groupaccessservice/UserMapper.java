package com.hemant.groupaccessservice;

import com.hemant.groupaccessservice.dto.UserDTO;
import com.hemant.groupaccessservice.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO userToUserDto(User user);
    User userDtoToUser(UserDTO userDto);
}

