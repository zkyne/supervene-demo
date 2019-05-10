package com.zkyne.supervenedemo.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName: Movie
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/5/10 11:50
 */
@Data
@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    private static final long serialVersionUID = 8544232488547610084L;
    /**
     * rate : 8.9
     * cover_x : 2000
     * title : 绿皮书
     * url : https://movie.douban.com/subject/27060077/
     * playable : true
     * cover : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549177902.jpg
     * id : 27060077
     * cover_y : 3167
     * is_new : false
     */
    @Column
    private String rate;
    @JSONField(name="cover_x")
    @Column
    private int coverX;
    @Column
    private String title;
    @Column
    private String url;
    @Column
    private boolean playable;
    @Column
    private String cover;
    @Id
    private String id;

    @JSONField(name="cover_y")
    @Column
    private int coverY;
    @JSONField(name = "is_new")
    @Column
    private boolean isNew;


}
