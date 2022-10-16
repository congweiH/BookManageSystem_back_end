package com.example.demo.service;

import com.example.demo.controller.request.UserPageRequest;
import com.example.demo.entity.User;

import java.util.List;

public interface IUserService {
    List<User> list();

    Object page(UserPageRequest userPageRequest);
}
