package com.gloryroad.feign;

import com.gloryroad.entity.User;
import com.gloryroad.entity.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/findAll/{page}/{limit}")
    UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @PostMapping("/user/save")
    void save(@RequestBody User user);

    @DeleteMapping("/user/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);
}
