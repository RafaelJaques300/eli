package com.senai.eli.Validator.Telefone;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = TelefoneValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})//Qual lugar irá aceitar a validação
@Retention(RetentionPolicy.RUNTIME)//Onde vai ser executado a validação
public @interface Telefone {

    //Mensagem padrão da validação do telefone
    String message() default "Telefone Inválido";

    //Permiti agrupar validações
    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default{};

    //Parametro om objetivo de
    //definir se pode telefone dixo ou celular
    boolean apenasCelular() default false;
    //Parametro com objetivo de definir se é
    //obrigatório o preenchimento
    boolean required() default false;

}
