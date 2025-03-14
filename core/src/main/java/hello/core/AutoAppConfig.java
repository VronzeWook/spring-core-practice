package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // 기존 등록 Config 파일들은 등록되지 않도록
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memoryMemberRepository() {
//        return new MemoryMemberRepository();
//    }
}
