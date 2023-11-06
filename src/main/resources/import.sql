-- Inserindo categorias mais representativas
INSERT INTO CATEGORY (id, name, description) VALUES ('5', 'Programming', 'Courses related to programming');
INSERT INTO CATEGORY (id, name, description) VALUES ('6', 'Marketing', 'Courses related to marketing');
INSERT INTO CATEGORY (id, name, description) VALUES ('7', 'Design', 'Courses related to design');
INSERT INTO CATEGORY (id, name, description) VALUES ('8', 'Business', 'Courses related to business and entrepreneurship');

-- Inserindo cursos em diferentes categorias
INSERT INTO Course (id, name, description, category_id) VALUES ('201', 'Java Programming', 'Learn Java from scratch', '5');
INSERT INTO Course (id, name, description, category_id) VALUES ('202', 'Digital Marketing Fundamentals', 'Basics of digital marketing', '6');
INSERT INTO Course (id, name, description, category_id) VALUES ('203', 'UI/UX Design Principles', 'Practical UI/UX design techniques', '7');
INSERT INTO Course (id, name, description, category_id) VALUES ('204', 'Business Plan Development', 'Creating effective business plans', '8');
INSERT INTO Course (id, name, description, category_id) VALUES ('205', 'Python for Data Science', 'Using Python for data analysis', '5');
INSERT INTO Course (id, name, description, category_id) VALUES ('206', 'Social Media Marketing Strategies', 'Effective strategies for social media', '6');
INSERT INTO Course (id, name, description, category_id) VALUES ('207', 'Graphic Design Fundamentals', 'Basics of graphic design', '7');
INSERT INTO Course (id, name, description, category_id) VALUES ('208', 'Entrepreneurship 101', 'Essentials of starting a business', '8');
