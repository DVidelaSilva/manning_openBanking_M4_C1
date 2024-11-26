package com.manning.openbanking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.reactive.function.client.WebClient;

import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.repositories.TransactionRepository;

@SpringBootApplication
public class OpenbankingApplication {

	@Value("${io.betterbanking.integration.url-base}")
    private String baseUrl;

	public static void main(String[] args) {
		SpringApplication.run(OpenbankingApplication.class, args);
	}

	@Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }


    @Profile(value = "dev")
    @Bean
    public ApplicationRunner run(final TransactionRepository transactionRepository) {
        return args -> {
            transactionRepository.deleteAll();
            var t = Transaction
                            .builder()
                            .type("Debit")
                            .date(new Date())
                            .accountNumber(123456789)
                            .currency("USD")
                            .amount(1000.00)
                            .merchantName("BookStore")
                            .merchantLogo("images_BookStore-logo.png")
                            .build();
            transactionRepository.save(t);

            System.out.println("Datos de Transaction cargados en la base de datos");
            
        };
    }

    

}
