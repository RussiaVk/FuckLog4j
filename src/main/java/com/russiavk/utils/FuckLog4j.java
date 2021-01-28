package com.russiavk.utils;

import java.util.concurrent.CompletableFuture;

public class FuckLog4j { 

	public final static void out(Object s) {
		CompletableFuture.runAsync(() -> {
			System.out.println(s);
		});
	}

	public final static void err(Object o) {
		CompletableFuture.runAsync(() -> {
			System.err.println(o);
		});
	}
}
