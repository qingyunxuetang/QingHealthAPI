create table news_item
(id int(4) not null primary key,
title char(20) not null,
news_date timestamp,
brief TEXT not null,
author char(20) not null,
image_url char(200)
);


