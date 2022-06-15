package com.example.member.mappers;

import com.example.member.dtos.MemberDto;
import com.example.member.entities.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberDtoMapper {
  MemberDtoMapper INSTANCE = Mappers.getMapper(MemberDtoMapper.class);

  Member dtoToMember(MemberDto dto);
  MemberDto dtoFromMember(Member entity);
}
