package cn.lmsite.lmfavor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * lmfavor应用程序
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@SpringBootApplication
@MapperScan("cn.lmsite.lmfavor.mapper")
public class LmfavorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmfavorApplication.class, args);
    }
}