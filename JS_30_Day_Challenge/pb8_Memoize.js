function memoize(fn) {
    const memo = {};
    return function (...args) {
        const key = JSON.stringify(args);

        if (key in memo) {
            return memo[key];
        }

        const result = fn(...args);
        return (memo[key] = result);
    };
}
