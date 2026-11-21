INSERT INTO category (id, name) VALUES
                                    (1, 'T-shirts'), (2, 'Shirts'), (3, 'Blouses'), (4, 'Jeans'), (5, 'Belts');

INSERT INTO product (id, name, price, category_id) VALUES
                                                       (1, 'Basic Tee', 62300, 1),
                                                       (2, 'Graphic Tee', 64400, 1),
                                                       (3, 'Striped Tee', 53700, 1),
                                                       (4, 'Denim Shirt', 71000, 2),
                                                       (5, 'Oxford Shirt', 68000, 2),
                                                       (6, 'Silk Blouse', 89000, 3),
                                                       (7, 'Slim Jeans', 79000, 4),
                                                       (8, 'Leather Belt', 35000, 5);

INSERT INTO user (id, name) VALUES
                                (1, 'Brenda'), (2, 'Alexander'), (3, 'Andrea'), (4, 'Amber');

INSERT INTO review (id, product_id, user_id, content) VALUES
                                                          (1, 1, 2, '편해요'),
                                                          (2, 1, 3, '사이즈가 딱 맞아요'),
                                                          (3, 1, 1, '색이 예뻐요'),
                                                          (4, 2, 4, '그림이 귀여워요'),
                                                          (5, 4, 3, '두께가 적당해요'),
                                                          (6, 1, 4, '재구매 의사 있어요');