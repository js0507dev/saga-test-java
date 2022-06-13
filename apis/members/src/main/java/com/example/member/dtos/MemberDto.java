package com.example.member.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
  private Long id;
  private String name;
  private String email;
}
