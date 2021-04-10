package com.yc.springframework.stereotype;

import javax.annotation.Resource;

/**
 * @program: TestSpring
 * @description:
 * @author: Dale
 * @create: 2021-04-05 14:15
 */
public @interface MyResource {
    String name() default "";
}
