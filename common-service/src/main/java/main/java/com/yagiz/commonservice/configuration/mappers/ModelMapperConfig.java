package main.java.com.yagiz.commonservice.configuration.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.com.yagiz.commonservice.Mapper.ModelMapperManager;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ModelMapperService getModelMapperService(ModelMapper mapper){
        return new ModelMapperManager(mapper);
    }
}
