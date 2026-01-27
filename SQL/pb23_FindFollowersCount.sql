-- Write your MySQL query statement below
-- This query counts the number of followers for each user

SELECT
	user_id,                          -- The user who has followers
	COUNT(*) AS followers_count       -- Count the number of times each user_id appears (= follower count)
FROM
	Followers                         -- Source table containing follower relationships
GROUP BY
	user_id                           -- Group records by user_id to count followers per user
ORDER BY
	user_id                           -- Sort results by user_id in ascending order