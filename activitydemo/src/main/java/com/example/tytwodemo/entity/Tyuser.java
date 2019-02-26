package com.example.tytwodemo.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("tyuser")
public class Tyuser implements Serializable{
    //region 属性
    @TableField(update="%s")
    private int  uid;
    private String  uname;
    private  String upwd;
    // private Set<Tyou> tyous =new HashSet<>();
    //endregion

    //region 构造
    public Tyuser() {
    }
    //endregion


    //<editor-fold desc="sda">
    /**
     * 诛仙
     * @return
     */
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }


    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
    //</editor-fold>


}

