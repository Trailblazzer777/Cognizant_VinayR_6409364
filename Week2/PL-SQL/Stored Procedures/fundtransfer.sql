CREATE OR REPLACE PROCEDURE TransferFunds (
  from_account_id IN NUMBER,
  to_account_id   IN NUMBER,
  amount          IN NUMBER
) AS
  from_balance NUMBER;
BEGIN
 SELECT balance INTO from_balance FROM accounts WHERE account_id = from_account_id FOR UPDATE;

  IF from_balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  UPDATE accounts
  SET balance = balance - amount
  WHERE account_id = from_account_id;

  UPDATE accounts
  SET balance = balance + amount
  WHERE account_id = to_account_id;

  COMMIT;
END;