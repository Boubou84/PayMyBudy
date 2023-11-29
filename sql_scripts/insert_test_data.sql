-- Insertion de données de test dans la table Users
INSERT INTO Users (email, password, full_name, date_of_birth, balance) VALUES
('user1@example.com', 'password1', 'User One', '1990-01-01', 100.00),
('user2@example.com', 'password2', 'User Two', '1992-02-02', 150.00),
('user3@example.com', 'password3', 'User Three', '1994-03-03', 200.00);

-- Insertion de données de test dans la table Transactions
INSERT INTO Transactions (sender_id, receiver_id, amount, transaction_date, status, fee) VALUES
(1, 2, 10.00, '2023-01-01 10:00:00', 'completed', 0.50),
(2, 3, 20.00, '2023-01-02 11:00:00', 'completed', 1.00),
(3, 1, 30.00, '2023-01-03 12:00:00', 'pending', 1.50);
