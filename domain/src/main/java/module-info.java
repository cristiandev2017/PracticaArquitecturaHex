module example.org.hexagonal.domain {
    requires lombok;

    exports data;
    exports infra.repository;
    exports services;
}