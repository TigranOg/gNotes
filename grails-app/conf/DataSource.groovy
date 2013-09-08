dataSource {
    pooled = true
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

environments {
    development {
        dataSource {
            driverClassName = "org.postgresql.Driver"
            username = "postgres"
            password = "msucmc"
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/postgres"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/postgres"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/postgres"
        }
    }
}
