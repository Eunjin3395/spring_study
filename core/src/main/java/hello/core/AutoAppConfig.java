package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// 컴포넌트 어노테이션 붙은건 다 자동으로 스프링 빈 등록 해주는데, @Configuration 어노테이션은 스캔 대셍에서 제외한다
// 기존에 작성한 AppConfig, TestConfig를 스캔하지 않도록 하기 위함
@ComponentScan(
        basePackages = "hello.core", // 특정 패키지 안의 컴포넌트만 스캔하도록 위치 지정
        // 위치 지정하지 않으면, 이 어노테이션이 붙은 설정 정보 클래스의 패키지(hello.cre)가 시작위치로 기본 설정됨
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
