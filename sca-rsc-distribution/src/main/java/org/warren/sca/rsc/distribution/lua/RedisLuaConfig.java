package org.warren.sca.rsc.distribution.lua;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

@Configuration
public class RedisLuaConfig {

    @Bean
    public DefaultRedisScript<String> script() {
        DefaultRedisScript<String> defaultRedisScript = new DefaultRedisScript<>();
        defaultRedisScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("/lua/postmanDispatcher.lua")));
        defaultRedisScript.setResultType(String.class);
        return defaultRedisScript;
    }

}
