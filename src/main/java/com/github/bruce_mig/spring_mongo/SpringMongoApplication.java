package com.github.bruce_mig.spring_mongo;

import com.github.bruce_mig.spring_mongo.category.Category;
import com.github.bruce_mig.spring_mongo.category.CategoryRepository;
import com.github.bruce_mig.spring_mongo.product.Product;
import com.github.bruce_mig.spring_mongo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}

//	@Bean
	public CommandLineRunner commandLineRunner(
			ProductRepository repository,
			CategoryRepository categoryRepository
	){
		return args -> {
			Category category1 = Category.builder()
					.name("category 1")
					.description("cat 1")
					.build();
			Category category2 = Category.builder()
					.name("category 2")
					.description("cat 2")
					.build();
			Product product = Product.builder()
					.name("iPhone")
					.description("Smart phone")
					.build();
//			repository.insert(product);
			categoryRepository.insert(category1);
			categoryRepository.insert(category2);

		};
	}

}
