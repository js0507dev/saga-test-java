package com.example.member.services;

import com.example.member.entities.Member;
import com.example.member.repositories.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class MemberService {
  private MemberRepository memberRepository;

  public Member findOne(Long id) {
    Member member = this.memberRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return member;
  }
}
