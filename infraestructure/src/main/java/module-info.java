
module infra{
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires  example.org.hexagonal.domain;
    requires App;

    exports infra.repository;
}