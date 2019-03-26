package br.com.automacao;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import br.com.automacao.VO.AuthorVO;
import br.com.automacao.VO.TipeCodeVO;

@SpringBootApplication
public class AutomacaoRestApplication {

	private static final Logger log = LoggerFactory.getLogger(AutomacaoRestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AutomacaoRestApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String url = "https://jsonplaceholder.typicode.com/todos";
			TipeCodeVO[] tipeCode = restTemplate.getForObject(url, TipeCodeVO[].class);
			HttpClient client = HttpClientBuilder.create().build();
		    HttpResponse response = client.execute(new HttpGet(url));
		    int statusCode = response.getStatusLine().getStatusCode();
		    
		    System.out.println("Valor do Status"+statusCode);
			
		    if(statusCode == 200) {
			
				for(TipeCodeVO t : tipeCode) {
					if(t.isCompleted()) {
						log.info(t.getId().toString()+","+ t.getTitle().toString());
					}
				}
		    }
			

		};
	}
	
	
	
	@Bean
	public CommandLineRunner run2(RestTemplate restTemplate) throws Exception {
		return args -> {
		String uri = "https://jsonplaceholder.typicode.com/todos";
		AuthorVO author = new AuthorVO();
		
		author.setId(100L);
		author.setIDBook(200L);
		author.setFirstName("Otávia");
		author.setLastName("Skykrull");
		
		RestTemplate rt = new RestTemplate();        
        rt.getMessageConverters().add(new StringHttpMessageConverter());
		AuthorVO returns = rt.postForObject(uri, author, AuthorVO.class);
			log.info(returns.toString());

		};
	}
	
	
	
	


}
