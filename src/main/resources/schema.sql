-- Tabela Category
CREATE TABLE Category (
                          id VARCHAR(50) PRIMARY KEY,
                          name VARCHAR(100),
                          description VARCHAR(255)
);

-- Tabela Course
CREATE TABLE Course (
                        id VARCHAR(50) PRIMARY KEY,
                        name VARCHAR(100),
                        description VARCHAR(255),
                        category_id VARCHAR(50),
                        FOREIGN KEY (category_id) REFERENCES Category(id)
);

