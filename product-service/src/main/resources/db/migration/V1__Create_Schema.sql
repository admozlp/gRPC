-- Product tablosu
CREATE TABLE IF NOT EXISTS products (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity BIGINT NOT NULL,
    is_active BOOLEAN DEFAULT TRUE,
    is_deleted BOOLEAN DEFAULT FALSE
);

-- Category
CREATE TABLE IF NOT EXISTS categories (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    is_active BOOLEAN DEFAULT TRUE,
    is_deleted BOOLEAN DEFAULT FALSE
);

-- Çoka çok ilişki için join tablosu
CREATE TABLE IF NOT EXISTS category_product (
    product_id BIGINT REFERENCES products(id),
    category_id BIGINT REFERENCES categories(id),
    PRIMARY KEY(product_id, category_id)
); 