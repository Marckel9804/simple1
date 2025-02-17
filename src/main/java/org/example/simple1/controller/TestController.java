package org.example.simple1.controller;

import org.example.simple1.dto.MemberDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @GetMapping("/")
    public MemberDto test() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test");
        memberDto.setAge(20);
        return memberDto;
    }

    @GetMapping("/testCD")
    public MemberDto testCD() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD");
        memberDto.setAge(2);
        return memberDto;
    }

    @GetMapping("/testCD2")
    public MemberDto testCD2() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD2");
        memberDto.setAge(222);
        return memberDto;
    }
    @GetMapping("/testCD3")
    public MemberDto testCD3() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD3");
        memberDto.setAge(222);
        return memberDto;
    }
    @GetMapping("/testCD4")
    public MemberDto testCD4() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD4");
        memberDto.setAge(222);
        return memberDto;
    }
    @GetMapping("/testCD5")
    public MemberDto testCD5() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD5");
        memberDto.setAge(55);
        return memberDto;
    }
    @GetMapping("/testCD6")
    public MemberDto testCD6() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD5");
        memberDto.setAge(55);
        return memberDto;
    }
    @GetMapping("/testCD7")
    public MemberDto testCD7() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test CD7");
        memberDto.setAge(222);
        return memberDto;
    }

    @GetMapping("/testCD8")
    public MemberDto testCD8() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("testCD8");
        memberDto.setAge(77);
        return memberDto;
    }
    @GetMapping("/testCD9")
    public MemberDto testCD9() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("testCD9");
        memberDto.setAge(99);
        return memberDto;
    }
    @GetMapping("/test10")
    public MemberDto test10() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test10");
        memberDto.setAge(10);
        return memberDto;
    }
}


