package com.project.jshop.repository;

import com.project.jshop.dto.UserInfoDTO;
import java.util.List;

public interface UserInfoRepository {
    public List<UserInfoDTO> selectAllUserInfo();
}
