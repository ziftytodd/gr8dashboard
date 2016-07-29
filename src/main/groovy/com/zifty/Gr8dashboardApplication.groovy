package com.zifty

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@SpringBootApplication
@EnableHystrixDashboard
class Gr8dashboardApplication {

	static void main(String[] args) {
		SpringApplication.run Gr8dashboardApplication, args
	}
}


