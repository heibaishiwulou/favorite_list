package com.example.favorite_list.service;

import com.example.favorite_list.entity.UserVideo;
import com.example.favorite_list.entity.Video;

import java.util.List;

public interface VideoService {
    //查条数
    public int chatiaoshu(UserVideo userVideo);

    //通過userid和videoName找到該用戶此視頻的狀態
    List<Video> my_favoriteByName(Integer userId,String videoName);
    List<Integer> youdeshuzu(Integer userId);
    void del(UserVideo userVideo);

    void xinzeng(UserVideo userVideo);
    List<Video> my_favorite(Integer userId);

    void insert(Integer[] a,Integer userId);
}
