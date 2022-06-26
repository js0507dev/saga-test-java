CREATE TABLE payments (
    id BIGINT NOT NULL AUTO_INCREMENT,
    order_id BIGINT,
    user_id BIGINT,
    amount BIGINT,
    payment_method VARCHAR(50) NOT NULL,
    card_number VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    created_at DATE NOT NULL,
    updated_at DATE NOT NULL,
    PRIMARY KEY(id)
);
