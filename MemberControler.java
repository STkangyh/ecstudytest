package io.seoultech.ecstudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor

public class MemberControler {

    private final MemberRepository memberRepository;

    @GetMapping("/members") //localhost:8080/members 정보 전달
    @ResponseBody //1이라는 응답을 보내도록 하게 body에 저장? 전달?
    public String getTest(){
        System.out.println("/members경로로 들어옴");
        return "1"; //응답 or webpage를 띄우거나. 이거는 1이라는 응답. 1.html
    }

    @GetMapping("/test")  //localhost:8080/test 정보전달
    @ResponseBody
    public String getTest2(){
        System.out.println("/test경로로 들어옴");
        return "2";
    }

    @PostMapping("/members") //url이 같아도 http가 달라서 가능?
    @ResponseBody
    public Member postTest(@RequestBody MemberRequest request){ //post요청 들어오면?->데이터가 request에 담겨 온다.

        Member member = new Member(request.getUserID(), request.getPassword());
        Member savedMember = memberRepository.save(member);
        memberRepository.findById(1L);
        System.out.println(request.getUserID()+" "+request.getPassword());
        return savedMember;
    }
}
