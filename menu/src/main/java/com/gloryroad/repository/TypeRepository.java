package com.gloryroad.repository;

import com.gloryroad.entity.Type;

import java.util.List;

public interface TypeRepository {
    List<Type> findAll();
}
