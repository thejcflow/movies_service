package com.juan.movies.controller;

import com.juan.movies.model.Member;
import com.juan.movies.repository.MemberRepository;
import com.juan.movies.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/member")
    public Member newMember(@RequestBody Member memberRequest) {
        // Not necessary to create a member request class.
        return memberService.save(memberRequest);
    }
}
