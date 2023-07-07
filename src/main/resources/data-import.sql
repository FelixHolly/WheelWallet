INSERT INTO Users (first_name, last_name, email, date_of_birth, password_hash)
VALUES ('John', 'Doe', 'johndoe@example.com', '1990-01-01', 'password123');

INSERT INTO Cars (user_id, model, make, year, color, fin, hp, notes)
VALUES (1, 'Civic', 'Honda', 2022, 'Blue', 'ABC123', 150, 'Some notes about the car');

INSERT INTO Tours (car_id, total_distance, start_date, end_date, start_location, end_location, notes)
VALUES (1, 1000, '2022-01-01 09:00:00', '2022-01-03 17:00:00', 'City A', 'City B', 'Tour notes');

INSERT INTO Documents (car_id, tour_id, appointment_id, date, type, url)
VALUES (1, 1, NULL, '2022-01-02 14:30:00', 'Insurance', 'https://example.com/document1.pdf');

INSERT INTO Appointments (car_id, date, type, notes)
VALUES (1, '2022-01-05 10:00:00', 'Maintenance', 'Appointment notes');

INSERT INTO Mechanics (car_id, name, address, email, telephone_number)
VALUES (1, 'John Smith', '123 Main St, City', 'johnsmith@example.com', '+1-555-1234567');
