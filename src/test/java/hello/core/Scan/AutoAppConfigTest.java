// package hello.core.Scan;

// import org.assertj.core.api.Assertions;
// import org.junit.jupiter.api.Test;
// import
// org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import hello.core.AutoAppConfig;
// import hello.core.member.MemberService;
// import hello.core.member.MemberServiceImpl;

// /**
// * AutoAppConfigTest
// */
// public class AutoAppConfigTest {

// @Test
// void basicScan() {
// AnnotationConfigApplicationContext ac = new
// AnnotationConfigApplicationContext(AutoAppConfig.class);
// MemberService memberService = ac.getBean(MemberService.class);
// Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
// }
// }