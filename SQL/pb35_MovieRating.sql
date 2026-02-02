-- Problem: Find top-rated user and top-rated movie in Feb 2020
-- Returns: (1) User who gave the most ratings (2) Movie with highest avg rating in Feb 2020

-- First Query: Find the user who gave the most movie ratings
(
SELECT 
	u.name AS results
FROM 
	Users u
JOIN
	MovieRating mr  -- Join to get rating counts per user
ON
	u.user_id = mr.user_id
GROUP BY
	u.name
ORDER BY
	COUNT(*) DESC,  -- Order by number of ratings (descending)
	u.name          -- Break ties alphabetically
LIMIT 1             -- Get only the top user
)

UNION ALL  -- Combine results from both queries

-- Second Query: Find the movie with highest average rating in February 2020
(
SELECT
	m.title AS results
FROM 
	Movies m
JOIN
	MovieRating mr  -- Join to get ratings for each movie
ON 
	m.movie_id = mr.movie_id
WHERE
	-- Filter ratings only from February 2020
	mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY
	m.title
ORDER BY
	AVG(mr.rating) DESC,  -- Order by average rating (highest first)
	m.title               -- Break ties alphabetically
LIMIT 1                   -- Get only the top movie
)