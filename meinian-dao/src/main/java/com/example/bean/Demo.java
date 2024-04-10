package com.example.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "demo")
public class Demo {

  private Integer id;
  private String name;
  private Integer age;
}
