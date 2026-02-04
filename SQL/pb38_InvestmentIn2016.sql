
/*
 Brief: Calculate the total insured value for 2016 (`tiv_2016`) for a
 subset of `Insurance` records.

 Logic:
  - Include rows whose `tiv_2015` value appears more than once in the table
    (the first subquery finds duplicate `tiv_2015` values).
  - Restrict to rows whose `(lat, lon)` location pair is unique (appears
    exactly once in the table; the second subquery finds those pairs).

 Notes:
  - Returns a single numeric column `tiv_2016` rounded to 2 decimals.
  - Some SQL dialects do not support tuple comparisons like `(lat, lon) IN (...)`;
    if yours doesn't, replace the second subquery with a JOIN on `lat` and `lon`.
  - The query assumes the table and column names are exactly as shown.
*/

SELECT
    ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM
    Insurance
WHERE
    tiv_2015 IN (
        -- find tiv_2015 values that occur more than once
        SELECT tiv_2015
        FROM Insurance
        GROUP BY tiv_2015
        HAVING COUNT(*) > 1
    )
    AND (lat, lon) IN (
        -- find location pairs (lat, lon) that are unique (appear exactly once)
        SELECT lat, lon
        FROM Insurance
        GROUP BY lat, lon
        HAVING COUNT(*) = 1
    );