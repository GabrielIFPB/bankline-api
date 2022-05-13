package com.dio.santander.banklineapi.exception;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ExceptionHandlerConfig {

    private static final String DEFAULT_KEY_TIMESTAMP = "timestamp";
    private static final String DEFAULT_KEY_STATUS = "status";
    private static final String DEFAULT_KEY_ERROR = "error";
    private static final String DEFAULT_KEY_ERRORS = "errors";
    private static final String DEFAULT_KEY_MESSAGE = "message";
    private static final String DEFAULT_KEY_PATH = "path";
    private static final String DEFAULT_KEY_TRACE = "trace";

    public static final String KEY_STATUS = "status";
    public static final String KEY_ERROR = "error";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_ERRORS = "errors";
    public static final String KEY_PATH = "path";
    public static final String KEY_TRACE = "trace";

    @Bean
    public ErrorAttributes errorAttributes() {
        return new DefaultErrorAttributes() {
            @Override
            public Map<String ,Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
                Map<String ,Object> defaultMap
                        = super.getErrorAttributes(webRequest, options );

                Map<String ,Object> errorAttributes = new LinkedHashMap<>();
                // Customize.
                // For eg: Only add the keys you want.
                errorAttributes.put( KEY_STATUS, defaultMap.get( DEFAULT_KEY_STATUS ) );
                errorAttributes.put( KEY_MESSAGE ,defaultMap.get( DEFAULT_KEY_MESSAGE ) );
                errorAttributes.put( KEY_PATH ,defaultMap.get( DEFAULT_KEY_PATH ) );
                errorAttributes.put( KEY_ERROR ,defaultMap.get( DEFAULT_KEY_ERROR ) );
                errorAttributes.put( KEY_TIMESTAMP ,defaultMap.get( DEFAULT_KEY_TIMESTAMP ) );
                errorAttributes.put( KEY_ERRORS ,defaultMap.get( DEFAULT_KEY_ERRORS ) );
                errorAttributes.put( KEY_TRACE ,defaultMap.get( DEFAULT_KEY_TRACE ) );

                return errorAttributes;
            }
        };
    }
}
