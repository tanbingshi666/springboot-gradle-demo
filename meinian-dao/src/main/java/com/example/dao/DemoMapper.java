package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Demo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
}
