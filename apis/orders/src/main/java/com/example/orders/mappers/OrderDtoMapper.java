package com.example.orders.mappers;

import com.example.orders.dtos.MemberDto;
import com.example.orders.dtos.OrderDto;
import com.example.orders.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDtoMapper {
  final static OrderDtoMapper INSTANCE = Mappers.getMapper(OrderDtoMapper.class);

  @Mapping(target = "id", source = "order.id")
  @Mapping(target = "ordererUserId", source = "order.ordererUserId")
  @Mapping(target = "ordererName", source = "order.ordererName")
  @Mapping(target = "ordererPhoneNumber", source = "order.ordererPhoneNumber")
  @Mapping(target = "ordererEmail", source = "memberDto.email")
  @Mapping(target = "status", source = "order.status")
  OrderDto entitiesToOrderDto(Order order, MemberDto memberDto);
}
