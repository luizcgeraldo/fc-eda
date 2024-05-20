package com.example.fcedamicroservicejava.infra.config;




import com.example.fcedamicroservicejava.infra.repository.BalancesEntity;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.jsr107.Eh107Configuration;
import org.hibernate.cache.jcache.ConfigSettings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

//@Configuration
//@EnableCaching
public class CacheConfiguration {
    /*private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(
            @Value("${application.cache.ehcache.max-entries}") Long maxEntries,
            @Value("${application.cache.ehcache.time-to-live-seconds}") Long timeToLiveSeconds
    ) {

        jcacheConfiguration =
                Eh107Configuration.fromEhcacheCacheConfiguration(
                        CacheConfigurationBuilder
                                .newCacheConfigurationBuilder(Object.class, Object.class, ResourcePoolsBuilder.heap(maxEntries))
                                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(timeToLiveSeconds)))
                                .build()
                );
    }

    @Bean
    public HibernatePropertiesCustomizer hibernatePropertiesCustomizer(javax.cache.CacheManager cacheManager) {
        return hibernateProperties -> hibernateProperties.put(ConfigSettings.CACHE_MANAGER, cacheManager);
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            createCache(cm, BalancesEntity.class.getName());
            // jhipster-needle-ehcache-add-entry
        };
    }

    private void createCache(javax.cache.CacheManager cm, String cacheName) {
        javax.cache.Cache<Object, Object> cache = cm.getCache(cacheName);
        if (cache != null) {
            cache.clear();
        } else {
            cm.createCache(cacheName, jcacheConfiguration);
        }
    }*/

}
