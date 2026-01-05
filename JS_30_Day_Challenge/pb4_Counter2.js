var createCounter = function (init) {
    let val = init;
    const newcal = init;

    return {
        increment: function () {
            return ++val;
        },
        reset: function () {
            val = newcal;
            return val;
        },
        decrement: function () {
            return --val;
        },
    };
};
