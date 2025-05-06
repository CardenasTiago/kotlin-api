CREATE TABLE user_carrer (
    user_id BIGINT NOT NULL,
    carrer_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, carrer_id),

    CONSTRAINT fk_user
        FOREIGN KEY (user_id) REFERENCES app_user (id)
        ON DELETE CASCADE,

    CONSTRAINT fk_carrer
        FOREIGN KEY (carrer_id) REFERENCES app_carrer (id)
        ON DELETE CASCADE
);
