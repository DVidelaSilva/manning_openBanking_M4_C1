CREATE TABLE IF NOT EXISTS transactions (
    id BIGINT AUTO_INCREMENT,
    account_number INT NOT NULL,
    amount DOUBLE NOT NULL,
    currency VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
    merchant_logo VARCHAR(255) NOT NULL,
    merchant_name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO transactions 
(id, account_number, amount, currency, date, merchant_logo, merchant_name, type)
VALUES
(NULL, 123456789, 300, 'USD', '2024-11-20', 'BookStore-logo.png', 'BookStore', 'credit'),
(NULL, 123456789, 500, 'USD', '2024-11-20', 'BookStore-logo.png', 'BookStore', 'debit'),
(NULL, 123456789, 800, 'USD', '2024-11-20', 'GameStore-logo.png', 'GameStore', 'debit'),
(NULL, 123456789, 100, 'USD', '2024-11-20', 'GameStore-logo.png', 'GameStore', 'credit');