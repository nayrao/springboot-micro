package io.javabrains.MovieCatalogService.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.MovieCatalogService.model.CatalogItem;

@RestController
public class MovieCatalogResources {
	
	@RequestMapping("/hello")
	public String name() {
		
		return "welcome to SpringBoot";
	}

	
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		return Collections.singletonList(
				new CatalogItem("Transformer", "I was good movie", 4)
				);
	}
}
