package com.mvc.basic;

import com.mvc.basic.domain.Member;
import com.mvc.basic.repository.MemberRepository;
import com.mvc.basic.repository.MemoryMemberRepository;
import com.mvc.basic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
