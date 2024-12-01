INSERT INTO shop (name, created_at, updated_at)
VALUES ('shop-1', NOW(), NOW()),
       ('shop-2', NOW(), NOW()),
       ('shop-3', NOW(), NOW()),
       ('shop-4', NOW(), NOW()),
       ('shop-5', NOW(), NOW());

INSERT INTO user (name, age, shop_id, created_at, updated_at)
VALUES ('user-1', 10, 1, NOW(), NOW()),
       ('user-2', 11, 2, NOW(), NOW()),
       ('user-3', 12, 2, NOW(), NOW()),
       ('user-4', 13, 3, NOW(), NOW()),
       ('user-5', 14, 4, NOW(), NOW()),
       ('user-6', 15, 4, NOW(), NOW()),
       ('user-7', 16, 4, NOW(), NOW()),
       ('user-8', 17, 5, NOW(), NOW());
