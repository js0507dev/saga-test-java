CREATE TABLE shippings (
    id BIGINT NOT NULL AUTO_INCREMENT,
    order_id BIGINT,
    status VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);
