package com.feint.spring_cloud_eureka_client_consumer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

/**
 * 对Ribbon进行自定义配置一共有两种方式：
 * 1. 编写配置类
 * 2. 在配置文件中添加相应配置
 *
 */

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "client-provider", configuration = arrayOf(RibbonConfig::class))
class SpringCloudEurekaClientConsumerApplication{
    @Bean
    @LoadBalanced
    fun restTemplate():RestTemplate=RestTemplate()

}

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaClientConsumerApplication::class.java, *args)
}
