create table systech_collector.local_gateway
(
    id         bigserial   not null
        constraint local_gateway_pkey
            primary key,
    mac        varchar(17) not null,
    farm_key   varchar(20),
    created_at timestamp   not null default Now()
);

alter table systech_collector.sensor_data
    add column local_gateway_id bigint
    constraint fk_sensor_data_local_gateway_id references systech_collector.local_gateway;