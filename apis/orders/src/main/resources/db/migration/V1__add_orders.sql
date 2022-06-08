CREATE TABLE orders (
    id BIGINT NOT NULL AUTO_INCREMENT,
    orderer_user_id BIGINT,
    orderer_name VARCHAR(100) NOT NULL,
    orderer_phone_number VARCHAR(30) NOT NULL,
    status VARCHAR(10) NOT NULL,
    PRIMARY KEY(id)
);
