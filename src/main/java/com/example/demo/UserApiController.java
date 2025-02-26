package com.example.demo;

import com.example.demo.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-25T19:40:24.675320-05:00[America/Toronto]", comments = "Generator version: 7.8.0")
@Controller
@RequestMapping("${openapi.swaggerPetstoreOpenAPI30.base-path:/v3}")
public class UserApiController implements UserApi {

    private final UserApiDelegate delegate;

    public UserApiController(@Autowired(required = false) UserApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserApiDelegate() {});
    }

    @Override
    public UserApiDelegate getDelegate() {
        return delegate;
    }

}
