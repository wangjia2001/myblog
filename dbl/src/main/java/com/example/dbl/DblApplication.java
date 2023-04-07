package com.example.dbl;

import com.example.dbl.elem.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.dbl.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DblApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BlogService blogService;

    public static void main(String[] args) {

        SpringApplication.run(DblApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		logger.info("根据ID查询————————> {}",
				blogService.findById(1));

//		blogService.deleteById(1);

//		logger.info("插入一条新数据————————> {}",
//				blogService.insert(
//						new Blog(
//                                new Date(),
//								"xi'hhhh"
//                        )
//				));

    }
}

