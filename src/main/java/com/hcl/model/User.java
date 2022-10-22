package com.hcl.model;

import lombok.Data;

@Data
public class User {
  private String uname;
  private String pwd;
  private String email;
  private Long phno;
}
