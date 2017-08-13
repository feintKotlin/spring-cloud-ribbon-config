package com.feint.spring_cloud_eureka_client_consumer.config

import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.RandomRule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
//class RibbonConfig {
//    @Bean
//    fun rule():IRule=RandomRule()
//}