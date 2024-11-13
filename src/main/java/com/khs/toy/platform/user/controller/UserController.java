package com.khs.toy.platform.user.controller;

import com.khs.toy.platform.user.dto.response.GetUserInfoResponse;
import com.khs.toy.platform.user.service.GetUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "1. 유저", description = "유저 관리")
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final GetUserService getUserService;

    @Operation(summary = "유저 정보 조회", description = "유저 정보를 조회합니다.")
    @GetMapping("/info")
    public ResponseEntity<GetUserInfoResponse> getUserInfo(
            @RequestParam String email
    ) {

        var response = getUserService.getUserInfo(email);
        return ResponseEntity.ok().body(response);
    }




}
