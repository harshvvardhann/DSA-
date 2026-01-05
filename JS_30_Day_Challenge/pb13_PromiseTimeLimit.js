var timeLimit = function (fn, t) {
    return async function (...args) {
        const funPromise = fn(...args);

        const cancelFn = new Promise((_, reject) => {
            setTimeout(() => {
                reject('Time Limit Exceeded');
            }, t);
        });

        return Promise.race([funPromise, cancelFn]);
    };
};
