create table food_item (item_code bigint not null, category integer, item_name varchar(255), price float not null, primary key (item_code));

insert into food_item (category, item_name, price, item_code) values (1, 'Burger', 209, 1001);
insert into food_item (category, item_name, price, item_code) values (0, 'Salad', 129, 1002);
insert into food_item (category, item_name, price, item_code) values (1, 'Pizza', 299, 1003);