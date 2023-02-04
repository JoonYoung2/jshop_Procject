package com.project.jshop.dto;

import lombok.Data;

@Data
public class UserInfoDTO {
    private String userId;
    private String userPw;
    private String userEmail;
    private String userNm;
    private String zipCd;
    private String addressInfo;
    private String addressDetail;
}