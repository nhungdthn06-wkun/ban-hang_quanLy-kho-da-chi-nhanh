package com.dt02.banhang.khodachinhanh;

import org.springframework.boot.SpringApplication;

public class TestBanHangKhoChiNhanhApplication {

	public static void main(String[] args) {
		SpringApplication.from(BanHangKhoChiNhanhApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
