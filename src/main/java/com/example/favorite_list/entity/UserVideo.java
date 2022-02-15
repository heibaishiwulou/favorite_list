package com.example.favorite_list.entity;

import lombok.Data;

/**
 * @ClassName userVideo
 * @Description TODO
 * @date 2022/2/10 17:25
 * @Version 1.0
 */
@Data
public class UserVideo {
    private Integer id;
    private Integer userId;
    private Integer videoId;
}
