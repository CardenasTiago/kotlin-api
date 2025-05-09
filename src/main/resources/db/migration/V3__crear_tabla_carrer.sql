CREATE TABLE app_carrer (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    student_plan_id BIGINT,
    FOREIGN KEY (student_plan_id) REFERENCES student_plan(id)
);
