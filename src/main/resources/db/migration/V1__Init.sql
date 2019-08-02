CREATE TABLE movie
(
    id bigserial not null constraint movie_pkey primary key,
    created_at timestamp not null,
    modified_at timestamp not null,
    version bigint not null,
    name varchar(255) not null,
    description text,
    release_year smallint not null,
    disc_format varchar(40) not null,
    best_sound_format varchar(40) not null,
    ultra_hd_format varchar(40)
);

INSERT INTO movie (name, description, release_year, disc_format, best_sound_format, ultra_hd_format, created_at, modified_at, version)
VALUES ('Avenger''s Endgame', 'Newest Avenger''s', 2019, '4k', 'Dolby Atmos', 'HDR', now(), now(), 0);

INSERT INTO movie (name, description, release_year, disc_format, best_sound_format, ultra_hd_format, created_at, modified_at, version)
VALUES ('Spiderman Into The Spiderverse', 'Spidey', 2018, '4k', 'Dolby Atmos', 'Dolby Vision', now(), now(), 0);
