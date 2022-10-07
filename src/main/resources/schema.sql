CREATE TABLE  IF NOT EXISTS `consumer`
(
    `id` bigint auto_increment,
    `accept_value` integer not null,
    `add_time` timestamp DEFAULT(CURRENT_TIMESTAMP) not null,
    primary key(`id`)
) ;

