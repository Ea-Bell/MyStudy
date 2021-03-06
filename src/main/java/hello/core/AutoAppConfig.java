// package hello.core;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.FilterType;

// import hello.core.member.MemberRepository;
// import hello.core.member.MemoryMemberRepository;

// @Configuration
// @ComponentScan(basePackages = "hello.core.member", // 탐색할 패키지의 시작 위치를 지정한다. 이
// 패키지를 포함해서 하위 패키지를 모두 탐색한다.
// basePackageClasses = AutoAppConfig.class, // 만약 지정하지 않으면 @ComponentScan이 붙은
// 설정 정보 클래스의 패키지가 시작 위치가 된다. -
// // > 권장하는 방법으로는 패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는
// // 것이다. 최근 스프링 부트도 이 방법을 기본으로 제공한다.
// // excludeFilters 내가 뺄 것듯
// // FilterType.ANNOTATION 어노테이션중에
// // Configuration.class Configuration가 포함된 클래스들...
// excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes
// = Configuration.class))

// public class AutoAppConfig {

// @Bean(name = "memoryMemberRepository")
// MemberRepository memberRepository() {
// return new MemoryMemberRepository();
// }

// }
