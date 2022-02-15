package com.example.favorite_list.mapper;

import com.example.favorite_list.entity.UserVideo;
import com.example.favorite_list.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserVideoMapper {
    //查条数
    int chatiaoshu(UserVideo userVideo);
    void del(UserVideo userVideo);
    void xinzeng(UserVideo userVideo);
    //2.批量收藏或取消
    List<Integer> youdeshuzu(Integer userId);
    //4.查询我的收藏
    List<Video> my_favorite(Integer userId);
    //关键字从我的收藏找具体video
    List<Video> my_favoriteByName(Integer userId,String videoName);

    void insert(Integer[] a,Integer userId);
}
