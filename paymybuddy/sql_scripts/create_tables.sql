-- Création de la table Users
CREATE TABLE Users (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    fullName VARCHAR(255) NOT NULL,
    dateOfBirth DATE,
    creationDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- Création de la table Transactions
CREATE TABLE Transactions (
    transactionId INT AUTO_INCREMENT PRIMARY KEY,
    senderId INT NOT NULL,
    receiverId INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    transactionDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50),
    FOREIGN KEY (senderId) REFERENCES Users(userId),
    FOREIGN KEY (receiverId) REFERENCES Users(userId)
);

-- Création de la table FriendConnections pour les relations entre amis
CREATE TABLE FriendConnections (
    connectionId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    friendId INT NOT NULL,
    FOREIGN KEY (userId) REFERENCES Users(userId),
    FOREIGN KEY (friendId) REFERENCES Users(userId)
);

-- Création de la table AccountBalances pour les soldes des utilisateurs
CREATE TABLE AccountBalances (
    balanceId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    balance DECIMAL(10, 2),
    FOREIGN KEY (userId) REFERENCES Users(userId)
);
