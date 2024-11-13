package com.khs.toy.platform.user.dto.response;

import com.khs.toy.platform.user.entity.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class GetUserInfoResponse {

    @Schema(description = "유저 ID", example = "1")
    private int id;
    @Schema(description = "이메일", example = "khs@naver.com")
    private String email;
    @Schema(description = "유저 이름", example = "김땡땡")
    private String userName;
    @Schema(description = "생년월일", example = "1995-01-01")
    private String birth;
    @Schema(description = "생성일", example = "2021-01-01")
    private String createDate;
    @Schema(description = "수정일", example = "2021-01-01")
    private String updateDate;

    public GetUserInfoResponse(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.userName = user.getUserName();
        this.birth = user.getBirth();
        this.createDate = user.getCreateDate().toString();
        this.updateDate = user.getUpdateDate().toString();
    }

}
