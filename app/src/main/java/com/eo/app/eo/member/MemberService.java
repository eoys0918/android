package com.eo.app.eo.member;

import java.util.List;

/**
 * Created by 1027 on 2016-11-12.
 */

public interface MemberService {
    public void join(MemberDTO param);
    public MemberDTO login(MemberDTO param);
    public MemberDTO detail(String id);
    public List<MemberDTO> list();
    public int count();
    public void update(MemberDTO param);
    public void delete(MemberDTO param);

}
