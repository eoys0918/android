package com.eo.app.eo.member;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberDAO {
    private Context applicationContext;
    public MemberDAO(Context applicationContext) {
        this.applicationContext = applicationContext;
    }
    public void insert(MemberDTO param){}
    public MemberDTO login(MemberDTO param){
        MemberDTO member = null;
        return member;
    }
    public MemberDTO selectOne(String id){
        MemberDTO member = null;
        return member;
    }
    public List<MemberDTO> selectList(){
        List<MemberDTO> list= new ArrayList<MemberDTO>();
        return list;
    }
    public int selectCount(){
        int count=0;
        return count;
    }
    public void update(MemberDTO param){}
    public void delete(MemberDTO param){}
}
