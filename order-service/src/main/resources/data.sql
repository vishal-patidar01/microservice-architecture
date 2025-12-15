INSERT INTO orders (total_price, order_status) VALUES
(100.50, 'PENDING'),
(100.50, 'CONFIRMED'),
(100.50, 'DELIVERED'),
(100.50, 'PENDING'),
(100.50, 'CANCELLED'),
(100.50, 'PENDING'),
(100.50, 'DELIVERED'),
(100.50, 'CONFIRMED'),
(100.50, 'PENDING'),
(100.50, 'CANCELLED');

INSERT INTO order_item (order_id, product_id, quantity) VALUES
(1, 101, 2),
(1, 102, 1),
(2, 103, 1),
(2, 104, 3),
(3, 105, 1),
(3, 106, 2),
(4, 107, 2),
(5, 108, 3),
(6, 109, 2),
(7, 110, 1),
(8, 111, 2),
(9, 112, 3),
(10, 113, 2);