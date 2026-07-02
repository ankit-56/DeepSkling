BEGIN
    -- Scenario 2: Promote customers to VIP status if their balance is greater than 10000

    DBMS_OUTPUT.PUT_LINE('VIP Customers (Balance > 10000)');

    FOR cust IN (
        SELECT CustomerID,
               Name,
               Balance
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'CustomerID: ' || cust.CustomerID ||
            ', Name: ' || cust.Name ||
            ', Balance: ' || cust.Balance
        );
    END LOOP;

    COMMIT;
END;
/