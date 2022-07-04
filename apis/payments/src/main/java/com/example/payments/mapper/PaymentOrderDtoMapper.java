package com.example.payments.mapper;

import com.example.payments.enums.PaymentMethod;
import com.example.payments.enums.PaymentStatus;
import com.example.payments.dto.PaymentOrderRequestDto;
import com.example.payments.dto.PaymentOrderResponseDto;
import com.example.payments.entities.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentOrderDtoMapper {
  PaymentOrderDtoMapper INSTANCE = Mappers.getMapper(PaymentOrderDtoMapper.class);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "status", ignore = true)
  @Mapping(target = "paymentMethod", qualifiedByName = "PaymentMethodFromString")
  Payment entityFromRequestDto(PaymentOrderRequestDto source);

  @Mapping(target = "paymentMethod", qualifiedByName = "PaymentMethodToString")
  @Mapping(target = "status", qualifiedByName = "PaymentStatusToString")
  PaymentOrderResponseDto entityToResponseDto(Payment source);

  @Named("PaymentMethodFromString")
  default PaymentMethod paymentMethodFromStringQualifier(String method) {
    return PaymentMethod.valueOf(method);
  }

  @Named("PaymentMethodToString")
  default String paymentMethodToStringQualifier(PaymentMethod method) {
    return method.toString();
  }

  @Named("PaymentStatusToString")
  default String paymentStatusToStringQualifier(PaymentStatus status) {
    return status.toString();
  }
}
