package com.exercise.ib.calculadora.controller.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * @author imadb
 * @version 1.0.0
 */
@AllArgsConstructor
@Getter
@ApiModel
public class ResponseBase<T> {

    @ApiModelProperty
    private final T data;
}
