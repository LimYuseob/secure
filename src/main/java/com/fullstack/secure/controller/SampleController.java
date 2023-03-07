package com.fullstack.secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample/exAll")
    public void exAll() {

    }
    @GetMapping("/sample/exMember")
    public void exMember() {

    }
    @GetMapping("/sample/exAdmin")
    public void exAdmin() {

    }

    //AuthenticationManager(인증작업의 처리 관리자) -->
    //AuthenticationProvider(인증의 종류 즉 인증 방식을 구현한 객체를 선택)
    //선택된 인증방식을 통해서 인증될 인증 정보객체인 UserDetailService 객체를 호출해서
    //인증 작업을 시도하게 됩니다.

}
