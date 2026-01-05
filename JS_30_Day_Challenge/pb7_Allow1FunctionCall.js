var once = function (fn) {
    let ex = 0;
    return function (...args) {
        if (ex > 0) return undefined;
        ex++;
        return fn(...args);
    };
};
