-- Kategorileri ekle
INSERT INTO categories (name, description) VALUES 
('Elektronik', 'Elektronik ürünler, bilgisayarlar, telefonlar vb.'),
('Giyim', 'Kıyafetler, ayakkabılar, aksesuarlar'),
('Kitaplar', 'Her türlü kitap, e-kitap ve sesli kitaplar'),
('Ev & Yaşam', 'Ev eşyaları, mobilyalar, bahçe ürünleri');

-- Ürünleri ekle
INSERT INTO products (name, description, price, stock_quantity) VALUES 
('Laptop', 'Yüksek performanslı gaming laptop', 12999.99, 25),
('Akıllı Telefon', 'Son model akıllı telefon', 8299.99, 50),
('Tişört', 'Pamuklu rahat tişört', 199.99, 100),
('Roman Kitap', 'Çok satan yeni roman', 79.99, 200),
('Koltuk Takımı', 'Modern tasarımlı koltuk takımı', 15999.99, 5);

-- Ürün-Kategori ilişkilerini ekle
INSERT INTO category_product (product_id, category_id) VALUES 
(1, 1), -- Laptop - Elektronik
(2, 1), -- Akıllı Telefon - Elektronik
(3, 2), -- Tişört - Giyim
(4, 3), -- Roman Kitap - Kitaplar
(5, 4); -- Koltuk Takımı - Ev & Yaşam 