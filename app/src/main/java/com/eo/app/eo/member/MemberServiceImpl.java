package com.eo.app.eo.member;

import android.content.Context;

import java.util.List;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;

    public MemberServiceImpl(Context applicationContext) {
        this.memberDAO = new MemberDAO(applicationContext);
    }

    @Override
    public void join(MemberDTO param) {

    }

    @Override
    public MemberDTO login(MemberDTO param) {
        return null;
    }

    @Override
    public MemberDTO detail(String id) {
        return null;
    }

    @Override
    public List<MemberDTO> list() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void update(MemberDTO param) {

    }

    @Override
    public void delete(MemberDTO param) {

    }
}
