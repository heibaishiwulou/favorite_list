package com.example.favorite_list.controller;

import com.example.favorite_list.entity.Search;
import com.example.favorite_list.entity.User;
import com.example.favorite_list.entity.UserVideo;
import com.example.favorite_list.entity.Video;
import com.example.favorite_list.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName videoController
 * @Description TODO
 * @date 2022/2/10 18:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("shoucang")
    public String shoucang(@RequestBody UserVideo userVideo){
        Integer i=videoService.chatiaoshu(userVideo);
        if(i==1){
            videoService.del(userVideo);
        }else videoService.xinzeng(userVideo);
        return JSONObject.toJSONString(userVideo);
    }
    @RequestMapping("my_favorite")
    public  String my_favorite(@RequestBody User user){

        List<Video> list=videoService.my_favorite(user.getUserId());
        return JSONObject.toJSONString(list);
    }
    @RequestMapping("my_favoriteByName")
    public  String my_favoriteByName(@RequestBody Search search){
        List<Video> list=videoService.my_favoriteByName(search.getUserId(),search.getVideoName());
        return JSONObject.toJSONString(list);
    }
    @RequestMapping("soucang_p")
    public String soucang_p(Integer[] array,Integer userId ){
      List<Integer>  arrray_have=videoService.youdeshuzu(userId);
        System.out.println(arrray_have);
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        System.out.println(list);
        List<Integer> list2 = new ArrayList<Integer>();
        for (Integer t : list) {
            if (!arrray_have.contains(t)) {
                list2.add(t);
            }
        }
        Integer[] a = list2.toArray(new Integer[list2.size()]);
        System.out.println(a);
         videoService.insert(a,userId);
        return "aaa";
    }

}
