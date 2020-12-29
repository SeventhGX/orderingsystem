package com.gloryroad.repository;

import com.gloryroad.entity.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    List<Order> findAll(int index, int limit);
    List<Order> findAllByUid(long uid, int index, int limit);
    int countByUid(long uid);
    void deleteByMid(long mid);
    void deleteByUid(long uid);
    List<Order> findAllByState(int state, int index, int limit);
    int countByState(int state);
    void updateState(long id, long aid, int state);
}
