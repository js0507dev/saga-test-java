-- liquibase formatted sql

-- changeset sjs:1655819753782-1
CREATE TABLE stocks
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    productId   BIGINT NULL,
    quantity    BIGINT NULL,
    CONSTRAINT pk_stocks PRIMARY KEY (id)
);
CREATE UNIQUE INDEX idx_stocks_productId ON stocks (productId);

