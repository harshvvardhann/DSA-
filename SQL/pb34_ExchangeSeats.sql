-- Problem: Exchange seats between adjacent students
-- Rules: Swap each pair of adjacent seats (1-2, 3-4, 5-6, etc.)
-- If the last row has odd ID, it stays in place

# Write your MySQL query statement below
SELECT 
    CASE 
        -- Odd ID that is NOT the max ID: swap with next seat (add 1)
        WHEN id % 2 = 1 AND id NOT IN (SELECT MAX(id) FROM Seat) THEN id + 1
        -- Even ID: swap with previous seat (subtract 1)
        WHEN id % 2 = 0 THEN id - 1
        -- If ID is odd and IS the max ID: keep it as is (odd-numbered row with no pair)
        ELSE id
    END AS id,
    student
FROM 
    Seat
ORDER BY id;  -- Sort results by seat ID