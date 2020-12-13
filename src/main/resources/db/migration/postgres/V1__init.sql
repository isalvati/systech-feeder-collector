CREATE SCHEMA IF NOT EXISTS systech_collector;

create table systech_collector.sensor_data
(
    id            bigserial          not null
        constraint sensor_data_pkey
            primary key,
    mac                 varchar(17) not null,
    feeder_weight       numeric(19, 2),
    animal_weight       numeric(19, 2),
    temperature         numeric(19, 2),
    humidity            numeric(19, 2),
    height              integer,
    battery_voltage     numeric(19, 2),
    inclination_x       numeric(19, 2),
    inclination_y       numeric(19, 2),
    inclination_z       numeric(19, 2),
    moment              varchar(30),
    error               varchar(30),
    local_timestamp     timestamp,
    created_at          timestamp          not null default Now()
);
