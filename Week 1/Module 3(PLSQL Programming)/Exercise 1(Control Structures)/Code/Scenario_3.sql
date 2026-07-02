BEGIN
    -- Scenario 3: Send reminders to customers whose loans are due within the next 30 days

    DBMS_OUTPUT.PUT_LINE('Loan Due Reminders');

    FOR rec IN (
        SELECT C.CustomerID,
               C.Name,
               L.DueDate
        FROM Customers C
        JOIN Loans L
        ON C.CustomerID = L.CustomerID
        WHERE L.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ' || rec.Name ||
            ' (ID: ' || rec.CustomerID ||
            ') has a loan due on ' ||
            TO_CHAR(rec.DueDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/