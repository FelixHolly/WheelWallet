INSERT INTO Users (first_name, last_name, email, date_of_birth, password_hash)
VALUES ('John', 'Doe', 'john.doe@example.com', '1990-01-01', 'password123');

INSERT INTO Cars (user_id, model, make, year, color, fin, hp, notes)
VALUES (1, 'Honda Civic', 'Honda', 2022, 'Blue', 'ABC123XYZ', 150, 'Some notes');

INSERT INTO Documents (car_id, date, type, url)
VALUES (1, '2023-06-15 10:30:00', 'Insurance', 'https://example.com/document.pdf');
