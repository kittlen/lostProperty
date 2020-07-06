package com.team.lostProperty.entities;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private  static Gson gson=new Gson();

    private String code;//编码
    private long count;//计数
    private List<Object> data;//数据
    private String msg;//提示消息

    public Result() {
    }

    public Result(String code, long count, List data, String msg) {
        this.code = code;
        this.count = count;
        this.data = data;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String toJson(Result result){
        return gson.toJson(result);
    }

    public static Result toResult(String reusltJson){
        return gson.fromJson(reusltJson,Result.class);
    }

    public void add(Object dataObj){
        if(this.data==null){
            data=new ArrayList<Object>();
        }
        this.data.add(dataObj);
    }

}
