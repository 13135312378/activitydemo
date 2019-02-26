package com.example.tytwodemo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.tytwodemo.dao.TyuserDao;
import com.example.tytwodemo.entity.Tyuser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TyController {
    @Resource
    private TyuserDao tyuserDao;
    @RequestMapping("get")
    public String get(){
        return "index";
    }
    @ResponseBody
    @RequestMapping("getall")
    public List<Tyuser> getall(){
        System.out.println("b");
        //List<Tyuser> list= TyuserDao.getus();
        List<Tyuser> list=tyuserDao.selectList(new EntityWrapper<>());
        for (Tyuser tyuser : list) {
            System.out.println(tyuser.getUname());
        }
        return  list;
    }
}
