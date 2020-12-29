package com.gloryroad.repository;

import com.gloryroad.entity.User;

public interface UserRepository {
    User login(String username, String password);
}
