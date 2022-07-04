-- liquibase formatted sql

-- changeset sjs:1655819753782-1
CREATE TABLE stocks
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    product_id  BIGINT NOT NULL,
    quantity    BIGINT NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT pk_stocks PRIMARY KEY (id)
);
--rollback DROP TABLE stocks;

-- changeset sjs:1655819753782-2
CREATE UNIQUE INDEX idx_stocks_productId ON stocks (product_id);
--rollback DROP INDEX idx_stocks_productId;

