package com.example.favorite_list.service.impl;

import com.example.favorite_list.entity.UserVideo;
import com.example.favorite_list.entity.Video;
import com.example.favorite_list.mapper.UserVideoMapper;
import com.example.favorite_list.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName videoServiceImpl
 * @Description TODO
 * @date 2022/2/10 18:04
 * @Version 1.0
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private UserVideoMapper userVideoMapper;

    @Override
    public List<Video> my_favorite(Integer userId) {
        return userVideoMapper.my_favorite(userId);
    }

    @Override
    public int chatiaoshu(UserVideo userVideo) {return userVideoMapper.chatiaoshu(userVideo);
    }

    @Override
    public List<Video> my_favoriteByName(Integer userId, String videoName) {
        return  userVideoMapper.my_favoriteByName(userId,videoName);
    }

    @Override
    public void insert(Integer[] a,Integer userId) {
        userVideoMapper.insert(a,userId);
    }

    @Override
    public List<Integer> youdeshuzu(Integer userId) {
        return userVideoMapper.youdeshuzu(userId);
    }

    @Override
    public void del(UserVideo userVideo) {
        userVideoMapper.del(userVideo);
    }

    @Override
    public void xinzeng(UserVideo userVideo) {
        userVideoMapper.xinzeng(userVideo);

    }
}
