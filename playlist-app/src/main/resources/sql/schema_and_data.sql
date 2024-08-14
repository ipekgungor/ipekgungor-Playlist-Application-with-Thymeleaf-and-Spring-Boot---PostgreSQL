-- Creating the Artist table
CREATE TABLE Artist (
    artist_id SERIAL PRIMARY KEY,
    artist_name VARCHAR(100) NOT NULL,
    artist_surname VARCHAR(100),
    artist_style VARCHAR(100),
    artist_birth_year INT,
    artist_img VARCHAR(255)
);

-- Creating the Album table
CREATE TABLE Album (
    album_id SERIAL PRIMARY KEY,
    album_name VARCHAR(150) NOT NULL,
    release_date DATE,
    album_img VARCHAR(255),
    artist_id INT REFERENCES Artist(artist_id) ON DELETE CASCADE
);

-- Creating the Song table
CREATE TABLE Song (
    song_id SERIAL PRIMARY KEY,
    song_name VARCHAR(150) NOT NULL,
    song_release_date DATE,
    spotify_url VARCHAR(255),
    ytmusic_url VARCHAR(255),
    artist_id INT REFERENCES Artist(artist_id) ON DELETE CASCADE,
    album_id INT REFERENCES Album(album_id) ON DELETE CASCADE
);

-- Creating the Playlist table
CREATE TABLE Playlist (
    song_id INT REFERENCES Song(song_id) ON DELETE CASCADE,
    PRIMARY KEY (song_id)
);

-- Adding data to the Artist table
INSERT INTO Artist (artist_name, artist_surname, artist_style, artist_birth_year, artist_img) VALUES
('Michael', 'Jackson', 'Pop', 1958, 'https://imgs.smoothradio.com/images/224840?width=2480&crop=4_3&signature=2GwG8v_p12CdPC5pgWGykAusMCM='),
('Amy', 'Winehouse', 'Blues', 1983, 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcT5P3IdQvX25PSds6ygtRlPUaYfFcK2aEU_xtiQGASKhF484pDT'),
('The', 'Weeknd', 'Dance', 1990, 'https://variety.com/wp-content/uploads/2020/06/unnamed-1-2-e1593560403821.jpg?w=1000&h=667&crop=1'),
('AC/DC', '', 'Rock', 1973, 'https://cdns-images.dzcdn.net/images/artist/ad61d6e0fa724d880db979c9ac8cc5e3/1900x1900-000000-80-0-0.jpg');

-- Adding data to the Album table
INSERT INTO Album (album_name, release_date, album_img, artist_id) VALUES
('Dangerous', '1976-11-26', 'https://upload.wikimedia.org/wikipedia/en/1/11/Michaeljacksondangerous.jpg', 1),
('Back to Black', '2006-10-27', 'https://m.media-amazon.com/images/I/71caoKZoCsL._UF1000,1000_QL80_.jpg', 2),
('After Hours', '2020-03-20', 'https://i.scdn.co/image/ab67616d0000b2738863bc11d2aa12b54f5aeb36', 3),
('Highway to Hell', '1979-07-27', 'https://upload.wikimedia.org/wikipedia/tr/a/ac/Acdc_Highway_to_Hell.JPG', 4);

-- Adding data to the Song table
INSERT INTO Song (song_name, song_release_date, spotify_url, ytmusic_url, artist_id, album_id) VALUES
('Jam', '1996-11-26', 'https://open.spotify.com/intl-tr/track/2EI8uljBPaI23VUr2tv4eS', 'https://music.youtube.com/watch?v=UGT_9ah_YFo', 1, 1),
('Rehab', '2006-10-27', 'https://open.spotify.com/intl-tr/track/1L5tZi0izXsi5Kk5OJf4W0', 'https://music.youtube.com/watch?v=t2TKqJ2FXGM', 2, 2),
('After Hours', '2020-03-20', 'https://open.spotify.com/intl-tr/track/2p8IUWQDrpjuFltbdgLOag', 'https://music.youtube.com/watch?v=WxYgXmZ9xh8', 3, 3),
('Highway to Hell', '1979-07-27', 'https://open.spotify.com/intl-tr/track/2zYzyRzz6pRmhPzyfMEC8s', 'https://music.youtube.com/watch?v=ikFFVfObwss&list=OLAK5uy_ljCzkwI83r25upN0GqTnL0pSlKu5V7Es8', 4, 4),
('In the Closet', '1996-11-26', 'https://open.spotify.com/intl-tr/track/5Fy40smNxk0j5OpFMtvfaU', 'https://music.youtube.com/watch?v=A5DXQVpkrvc', 1, 1),
('Just Friend', '2006-10-27', 'https://open.spotify.com/intl-tr/track/2i1S5Dq9SaFGcnw8mnb4ks', 'https://music.youtube.com/watch?v=whaDlITyGsU', 2, 2),
('Save Your Tears', '2020-03-20', 'https://open.spotify.com/intl-tr/track/5QO79kh1waicV47BqGRL3g', 'https://music.youtube.com/watch?v=RmYCOm4ehKs', 3, 3);

-- Adding data to the Playlist table
INSERT INTO Playlist (song_id) VALUES
(1),
(2),
(4),
(7);
