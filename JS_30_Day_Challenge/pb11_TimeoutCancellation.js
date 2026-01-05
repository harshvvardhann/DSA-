var cancellable = function (fn, args, t) {
    const cancelFn = () => {
        clearTimeout(timer);
    };
    const timer = setTimeout(() => {
        fn(...args);
    }, t);

    return cancelFn;
};
