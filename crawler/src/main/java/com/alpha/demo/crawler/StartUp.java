package com.alpha.demo.crawler;

import com.alpha.demo.crawler.util.Consts;
import com.alpha.demo.crawler.util.LogUtil;

public class StartUp {
	
    public static void main( String[] args ) {
    	LogUtil.initLog4j();
    	new Worker(Consts.CRAWL_URL).start();
<<<<<<< Upstream, based on origin/develop
        // change a51
=======
        // change a511
>>>>>>> 928c83f test conflict 511
    }
}
