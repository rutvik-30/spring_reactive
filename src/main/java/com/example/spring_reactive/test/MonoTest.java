package com.example.spring_reactive.test;


import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoTest {
	
	@Test
	public void monoTest() {
		Mono<String> monoString=Mono.just("First spring reactive project").log();
		monoString.subscribe(System.out::println);
	}
	
	@Test
	public void fluxTest() {
		Flux<String> monoString=Flux.just("First spring reactive project","Hello","Hey I am your next event","yes this is last").log();
		monoString.subscribe(System.out::println);
	}
}
