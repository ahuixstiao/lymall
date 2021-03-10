//package com.ly.lymall.core.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.io.PrintWriter;
//
///**
// * @Author: Ahui
// * @Description: Security安全权限 配置类
// * @DateTime: 2021/3/10 - 12:54
// **/
//@Configuration
//@EnableWebSecurity
//public class SimpleSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    /**
//     * 对密码进行加盐加密
//     *
//     * @return PasswordEncoder
//     */
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        //加密
//        return new BCryptPasswordEncoder();
//        //不加密
//        //return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()//开启登录配置
//                .antMatchers("/index").hasRole("admin")//表示访问 /index 这个页面，需要具备 admin 这个角色
//                .anyRequest().authenticated()//表示剩余的其他接口，登录之后就能访问
//                .and()
//                .formLogin()
//                //定义登录页面，未登录时，访问一个需要登录之后才能访问的接口，会自动跳转到该页面
//                .loginPage("/auth/login")
//                //登录处理接口
//                .loginProcessingUrl("/auth/login")
//                //定义登录时，用户名的 key，默认为 username
//                .usernameParameter("username")
//                //定义登录时，用户密码的 key，默认为 password
//                .passwordParameter("password")
//                //登录成功的处理器
//                .successHandler((req, resp, authentication) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = resp.getWriter();
//                    out.write("success");
//                    out.flush();
//                })
//                .failureHandler((req, resp, exception) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = resp.getWriter();
//                    out.write("fail");
//                    out.flush();
//                })
//                .permitAll()//和表单登录相关的接口统统都直接通过
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessHandler((req, resp, authentication) -> {
//                    resp.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = resp.getWriter();
//                    out.write("logout success");
//                    out.flush();
//                })
//                .permitAll()
//                .and()
//                .httpBasic()
//                .and()
//                .csrf().disable();
//    }
//
//}
