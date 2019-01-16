package com.dhr.lover.MybatisPlusDemo.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private Date create_time;
    private Date update_time;
    private Character valid;
    private String creator_id;
    private String updater_id;
    private String perms;
}
