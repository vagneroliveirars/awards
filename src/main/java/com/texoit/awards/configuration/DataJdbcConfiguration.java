package com.texoit.awards.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

import java.time.Year;
import java.util.Collections;

@Configuration
public class DataJdbcConfiguration extends AbstractJdbcConfiguration {

    @Override
    public JdbcCustomConversions jdbcCustomConversions() {
        return new JdbcCustomConversions(Collections.singletonList(ShortToYearConverter.INSTANCE));
    }

    @ReadingConverter
    enum ShortToYearConverter implements Converter<Short, Year> {

        INSTANCE;

        @Override
        public Year convert(Short source) {
            return Year.of(source);
        }
    }

}
