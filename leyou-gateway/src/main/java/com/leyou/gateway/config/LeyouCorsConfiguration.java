package com.leyou.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
/**
 * Author: 梁启富
 * Date: 2019-07-18 3:42
 * Description: <描述>
 */
public class LeyouCorsConfiguration {
    @Bean
    public CorsFilter corsFilter(){
        // 配置初始化对象
        CorsConfiguration configuration = new CorsConfiguration();
        // 允许跨域的域名，如果设置允许携带cookie为true，则不能写*，*代表所有的域名都可以跨域访问
        configuration.addAllowedOrigin("http://manage.leyou.com");
        //configuration.addAllowedOrigin("http://www.leyou.com");
        // 允许携带cookie
        configuration.setAllowCredentials(true);
        // 代表所有的请求方法
        configuration.addAllowedMethod("*");
        // 允许携带任何的头信息
        configuration.addAllowedHeader("*");

        // 初始化cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",configuration);

        // 返回corsFilter实例，参数：cors配置源对象
        return new CorsFilter(configurationSource);
    }
}
