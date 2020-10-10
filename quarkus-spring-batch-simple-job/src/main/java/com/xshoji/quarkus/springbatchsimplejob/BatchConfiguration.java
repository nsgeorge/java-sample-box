package com.xshoji.quarkus.springbatchsimplejob;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration extends DefaultBatchConfigurer {
  @Override
  public void setDataSource(DataSource dataSource) {
    //This BatchConfigurer ignores any DataSource
  }
}
