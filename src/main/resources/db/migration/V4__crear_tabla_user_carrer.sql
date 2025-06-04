CREATE TABLE user_carrer (
    id BIGSERIAL PRIMARY KEY,
    student_id BIGINT NOT NULL,
    carrer_id BIGINT NOT NULL,
    CONSTRAINT fk_student
        FOREIGN KEY (student_id) REFERENCES student (id)
        ON DELETE CASCADE,

    CONSTRAINT fk_carrer
        FOREIGN KEY (carrer_id) REFERENCES app_carrer (id)
        ON DELETE CASCADE
);
