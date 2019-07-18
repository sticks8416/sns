package member.service;

import java.util.List;


import member.domain.MemberVO;
import member.request.LoginRequest;

public interface MemberService {
	public List<MemberVO> list();
	public void write(MemberVO memberVO);
	public List<MemberVO> login(LoginRequest loginRequest);
}