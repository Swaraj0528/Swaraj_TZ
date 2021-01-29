package com.tz.thredsafeSp;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExeClient {
	
	public static void main(String[] args) {
		ExecutorService e = null;
		ThreadClass t1 = new ThreadClass();
		try {
			e = Executors.newFixedThreadPool(1);
			e.execute(t1);
			e.execute(t1);
			e.execute(t1);
			e.execute(t1);
			e.execute(t1);
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			if(e!=null) {
				e.shutdown();
			}
		}
		
		
	}

}
