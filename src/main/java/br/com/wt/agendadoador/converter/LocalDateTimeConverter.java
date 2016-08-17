package br.com.wt.agendadoador.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public final class LocalDateTimeConverter implements Converter<String, LocalDateTime> {
	 
    private final DateTimeFormatter formatter;
 
    public LocalDateTimeConverter(String dateFormat) {
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }
 
    @Override
    public LocalDateTime convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }
 
        return LocalDateTime.parse(source, formatter);
    }
}

