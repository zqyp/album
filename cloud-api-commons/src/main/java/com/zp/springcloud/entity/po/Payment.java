package com.zp.springcloud.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZP
 * @date 2021/11/9 15:45
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {

    private Long id ;

    private String serial;
}
