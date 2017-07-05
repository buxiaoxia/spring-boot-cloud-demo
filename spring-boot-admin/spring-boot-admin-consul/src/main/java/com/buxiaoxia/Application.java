package com.buxiaoxia;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xw on 2017/6/5.
 * 2017-06-05 22:02
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/applications").permitAll()//
//                .antMatchers("/mgmt/health").permitAll()//
//                .anyRequest().authenticated()//
//                .and().csrf().ignoringAntMatchers("/api/**", "/mgmt/**")
//                .csrfTokenRepository(csrfTokenRepository()).and()
//                .addFilterAfter(csrfHeaderFilter(), CsrfFilter.class);
//    }
//
//    private Filter csrfHeaderFilter() {
//        return new OncePerRequestFilter() {
//            @Override
//            protected void doFilterInternal(HttpServletRequest request,
//                                            HttpServletResponse response, FilterChain filterChain)
//                    throws ServletException, IOException {
//                CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
//                if (csrf != null) {
//                    Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
//                    String token = csrf.getToken();
//                    if (cookie == null || token != null && !token.equals(cookie.getValue())) {
//                        cookie = new Cookie("XSRF-TOKEN", token);
//                        cookie.setPath("/");
//                        response.addCookie(cookie);
//                    }
//                }
//                filterChain.doFilter(request, response);
//            }
//        };
//    }
//
//    private CsrfTokenRepository csrfTokenRepository() {
//        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
//        repository.setHeaderName("X-XSRF-TOKEN");
//        return repository;
//    }
}
