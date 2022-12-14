CREATE DATABASE shop_db;
USE shop_db;

CREATE TABLE categories (
  id SERIAL NOT NULL,
  title varchar(32),
  PRIMARY KEY (id) 
);


CREATE TABLE products (
  id SERIAL NOT NULL,
  name varchar(64),
  image_url varchar(256),
  price numeric(10,2), 
  quantity numeric(10,2),
  category_id int,  
  PRIMARY KEY (id), 
  FOREIGN KEY (category_id) REFERENCES categories(id));

INSERT INTO categories (title)
VALUES
	('Berries'),
	('Vegetables'),
	('Fruits'),
	('Cereals'),
	('Spices');

INSERT INTO products (name, image_url, price, quantity, category_id)
VALUES
	('Blueberry', '../../assets/img/berries/blueberries.jpg', 8, 10, 1),
	('Strawberry', '../../assets/img/berries/strawberries.jpg', 5, 10, 1),
	('Raspberry', '../../assets/img/berries/raspberries.jpg', 7, 10, 1),
	('Blackberry', '../../assets/img/berries/blackberries.jpg', 6, 10, 1),
	('Red_Currants', '../../assets/img/berries/redcurrants.jpg', 8, 10, 1),
	('White_Currants', '../../assets/img/berries/whitecurrants.jpg', 9, 10, 1),
	('Blackcurrants', '../../assets/img/berries/blackcurrants.jpg', 8, 10, 1),
	('Cranberry', '../../assets/img/berries/cranberries.jpg', 12, 10, 1),
	('Gooseberry', '../../assets/img/berries/gooseberry.jpg', 10, 10, 1),
	('Brussels_Sprouts', '../../assets/img/vegetables/brusselssprouts.jpg', 10, 10, 2),
	('Cucumber', '../../assets/img/vegetables/cucumber.jpg', 3, 10, 2),
	('Zucchini', '../../assets/img/vegetables/zucchini.jpg', 6.5, 10, 2),
	('Potato', '../../assets/img/vegetables/potatoes.jpg', 2, 10, 2),
	('Celery', '../../assets/img/vegetables/celery.jpg', 10, 10, 2),
	('Onion', '../../assets/img/vegetables/onions.jpg', 3, 10, 2),
	('Garlic', '../../assets/img/vegetables/garlic.jpg', 10, 10, 2),
	('Tomato', '../../assets/img/vegetables/tomatoes.jpg', 4.5, 10, 2),
	('Orange', '../../assets/img/fruits/oranges.jpg', 7, 10, 3),
	('Grapefruit', '../../assets/img/fruits/grapefruits.jpg', 7, 10, 3),
	('Nectarine', '../../assets/img/fruits/nectarines.jpg', 11, 10, 3),
	('Mango', '../../assets/img/fruits/mangoes.jpg', 15, 10, 3),
	('Plum', '../../assets/img/fruits/plums.jpg', 4, 10, 3),
	('Rice', '../../assets/img/cereals/rice.jpg', 3.75, 10, 4),
	('Corn', '../../assets/img/cereals/corn.jpg', 8, 10, 4),
	('Oats', '../../assets/img/cereals/oats.jpg', 5, 10, 4),
	('Sorghum', '../../assets/img/cereals/sorghum.jpg', 12, 10, 4),
	('Quinoa', '../../assets/img/cereals/quinoa.jpg', 12, 10, 4),
	('Millet', '../../assets/img/cereals/millet.jpg', 9, 10, 4),
	('Buckwheat', '../../assets/img/cereals/buckwheat.jpg', 6, 10, 4),
	('Cardamom', '../../assets/img/spices/cardamom.jpg', 15, 10, 5),
	('Cinnamon', '../../assets/img/spices/cinnamon.jpg', 20, 10, 5),
	('Cloves', '../../assets/img/spices/cloves.jpg', 25, 10, 5),
	('Turmeric', '../../assets/img/spices/turmeric.jpg', 25, 10, 5),
	('Saffron', '../../assets/img/spices/saffron.jpg', 20, 10, 5),
	('Cumin', '../../assets/img/spices/cumin.jpg', 25, 10, 5);
