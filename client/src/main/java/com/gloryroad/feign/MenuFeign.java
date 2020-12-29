package com.gloryroad.feign;

import com.gloryroad.entity.Menu;
import com.gloryroad.entity.MenuVO;
import com.gloryroad.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{page}/{limit}")
    MenuVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @GetMapping("/menu/findAll")
    List<Type> findAll();

    @PostMapping("/menu/save")
    void save(@RequestBody Menu menu);

    @GetMapping("/menu/findById/{id}")
    Menu findById(@PathVariable("id") long id);

    @PutMapping("/menu/update")
    void update(@RequestBody Menu menu);

    @DeleteMapping("/menu/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);
}
