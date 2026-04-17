USE finals;
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE users;
TRUNCATE TABLE credentials;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO credentials (username, password) VALUES
('john_doe', 'pass123'),
('jane_smith', 'pass456'),
('admin', 'admin123');
INSERT INTO users (id, first_name, last_name) VALUES
(1, 'John', 'Doe'),
(2, 'Jane', 'Smith'),
(3, 'Admin', 'User');
SELECT * FROM users;
SELECT * FROM credentials;
