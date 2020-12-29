package com.gloryroad.repository;

import com.gloryroad.entity.Admin;

public interface AdminRepository {
    Admin login(String username, String password);
}
