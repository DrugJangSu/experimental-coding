CREATE TABLE category (
                          id INTEGER PRIMARY KEY,
                          name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE product (
                         id INTEGER PRIMARY KEY,
                         name VARCHAR(100) NOT NULL UNIQUE,
                         price INTEGER NOT NULL,
                         category_id INTEGER NOT NULL,
                         FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE user (
                      id INTEGER PRIMARY KEY,
                      name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE review (
                        id INTEGER PRIMARY KEY,
                        product_id INTEGER NOT NULL,
                        user_id INTEGER NOT NULL,
                        content VARCHAR(500) NOT NULL,
                        FOREIGN KEY (product_id) REFERENCES product(id),
                        FOREIGN KEY (user_id) REFERENCES user(id)
);