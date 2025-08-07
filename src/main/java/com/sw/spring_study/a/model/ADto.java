package com.sw.spring_study.a.model;


import com.sw.spring_study.b.model.BDto;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

public class ADto {

    @Getter
    public static class Register {
        private String a01;
        private String a02;
        private List<BDto.Register> bList;

        public A toEntity() {
            return A.builder()
                    .a01(a01)
                    .a02(a02)
                    .build();
        }
    }

    @Getter
    @Builder
    public static class ARes {
        private Integer idx;
        private String a01;
        private String a02;
        private List<BDto.BRes> bResList;

        public static ARes from(A entity) {
            ARes dto = ARes.builder()
                    .idx(entity.getIdx())
                    .a01(entity.getA01())
                    .a02(entity.getA02())
                    .bResList(entity.getBList().stream().map(BDto.BRes::from).toList())
                    .build();


            return dto;
        }
    }

}
