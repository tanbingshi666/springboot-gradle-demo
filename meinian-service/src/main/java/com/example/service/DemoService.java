package com.example.service;

import com.example.bean.Demo;
import com.example.dao.DemoMapper;
import org.springframework.stereotype.Service;


@Service
public class DemoService {

  private final DemoMapper demoMapper;

  public DemoService(DemoMapper demoMapper) {
    this.demoMapper = demoMapper;
  }

  public Demo getDemo(Integer id) {
    return demoMapper.selectById(id);
  }
}
