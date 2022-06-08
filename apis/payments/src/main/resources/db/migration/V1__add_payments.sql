CREATE TABLE payments (
    id BIGINT NOT NULL AUTO_INCREMENT,
    order_id BIGINT,
    user_id BIGINT,
    payment_method VARCHAR(30) NOT NULL,
    card_number VARCHAR(30) NOT NULL,
    status VARCHAR(10) NOT NULL,
    PRIMARY KEY(id)
);
