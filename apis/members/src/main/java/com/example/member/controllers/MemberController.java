package com.example.member.controllers;

import com.example.member.dtos.MemberDto;
import com.example.member.entities.Member;
import com.example.member.mappers.MemberDtoMapper;
import com.example.member.services.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/members")
public class MemberController {
  private MemberService memberService;

  @GetMapping("/{id}")
  public MemberDto test(@PathVariable Long id) {
    Member member = this.memberService.findOne(id);
    return MemberDtoMapper.INSTANCE.dtoFromMember(member);
  }
}
