package com.crud.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfig {

  @Bean
  public Docket recadosApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .groupName("Recados API")
            .select().apis(RequestHandlerSelectors.basePackage("com.crud.resource"))
            .paths(postPaths())
            .build();
  }

  private Predicate<String> postPaths() {
//        return or(regex("/produto/.*"), or(regex("/categoria/.*")));
//        return or(regex("/(produto|categoria)"), regex("/(produto|categoria)/.*"));
    return regex("/recados.*");
  }
}

//package com.crud.config;
//
//import com.google.common.base.Predicate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//
//@EnableSwagger2
//@EnableWebMvc
//public class SwaggerConfig {
//  @Bean
//  public Docket productApi() {
//    return new Docket(DocumentationType.SWAGGER_2)
//      .select()
//      .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
//      .paths((Predicate<String>) PathSelectors.regex("/roles.*"))
//      .build()
//      .apiInfo(metaInfo());
//  }
//
//  private ApiInfo metaInfo() {
//
//    ApiInfo apiInfo = new ApiInfo(
//      "Produtos API REST",
//      "API REST de login e senha",
//      "1.0",
//      "Terms of Service",
//      new Contact("Juliao","growdev.com.br",
//        "juliao@grow.com"),
//      "Apache License Version 2.0",
//      "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
//    );
//
//    return apiInfo;
//  }
//
//  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//    registry.addResourceHandler("swagger-ui.html")
//      .addResourceLocations("classpath:/META-INF/resources/");
//    registry.addResourceHandler("/webjars/**")
//      .addResourceLocations("classpath:/META-INF/resources/webjars/");
//  }
//}
