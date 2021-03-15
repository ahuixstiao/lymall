package com.ly.lymall.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: Ahui
 * @Description: Swagger2Config
 * @DateTime: 2021/3/12 - 16:23
 **/
@Configuration
public class Swagger2Config {

    @Bean
    public Docket productApi() {
        // 文档类型，不用理会，就是用SWAGGER_2
        return new Docket(DocumentationType.SWAGGER_2)
                // 接口文档信息设置，抽取到apiInfo()进行设置
                .apiInfo(apiInfo()).select()
                // Controller的扫描规则：对所有Controller生成接口文档
                .apis(RequestHandlerSelectors.any()).build();
    }

    /**
     * 接口文档信息设置
     *
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("lymall商城文档")
                .contact(new Contact("ahui", null, null))
                .description("lymall项目文档")
                .version("1.0")
                .build();
    }
}
